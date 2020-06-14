package co.uk.amazon.commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends DriverManager

{
    //ist browser we need is chrome. to open chrome:
    private WebDriver initChrome()
    {
        // we set up the chromeDriver:
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
      //so, anytime the method WebDriver is called, it will flash ChromeDriver
    }

    // we want another ChromeDriver-headless chrome
    //1) because it is very fast 2) Jenkins run with headless chrome

    private WebDriver initHeadlessChrome()
    {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();//instantiation
        options.addArguments("--disable-gpu", "-headless");// i want to disable the graphic unit and
                              // i want to run it headlessly
        return new ChromeDriver(options);
    }
    // to open chrome firefox:
    private WebDriver initFirefox()
    {
        // we set up the firefoxDriver:
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
        //so, anytime the method WebDriver is called, it will flash ChromeDriver
    }

    // we want another ChromeDriver-headless chrome
    //1) because it is very fast 2) Jenkins run with headless chrome

    private WebDriver initHeadlessFirefox()
    {
        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions options = new FirefoxOptions();//instantiation
        options.addArguments("--disable-gpu", "-headless");// i want to disable the graphic unit and
        // i want to run it headlessly
        return new FirefoxDriver(options);
    }
    //to work with any of these 4 browsers:
    public void launchBrowser(String browser) //this browser is parameterized,
                                            // as a string
    {
        switch(browser)
        {
            case "Chrome":
                 driver = initChrome();
                 break;
            case "HeadlessChrome":
                 driver = initHeadlessChrome();
                 break;
            case "Firefox":
                driver = initFirefox();
                break;
            case "HeadlessFirefox":
                driver = initHeadlessFirefox();
                break;
            default:
                driver = initHeadlessChrome();
                break;
        }
        driver.manage().window().maximize();// i want driver to help me to
                                      // manage my window and then maximize the window for me.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //manage it implicitly
                                  // and wait 10s every minute: i.e. if u get to a place and you
                                   // can't find it, wait for 10secs i.e. if the elements doesn't appear/load on time
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);//manage pageloading
                              // and when u get to a page and it does not load on time, wait for 30secs
    }
    // to close browser after test:
    public void closeBrowser()
    {
      driver.manage().deleteAllCookies();//because we want each test to be unique
      driver.quit();
    }
}
