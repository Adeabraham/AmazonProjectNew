package co.uk.amazon.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchForItemsSteps {

    WebDriver driver; //to be able to use selenium, we import selenium into the project. It is
                       // located inside of webDriver library
                      // the driver is Selenium. Can be named anything
                       // and it's what we use to control
    @Given("I navigate to Amazon homepage")
    public void i_navigate_to_Amazon_homepage() {

        //Enter the url


        //: setting up the browser:chrome
        WebDriverManager.chromedriver().setup();// WebDrivermanager, give me chromedriver and
                                                // setit up for me.
        //Launching the browser
        driver = new ChromeDriver(); //for firefox, use FirefoxDriver,
                                  //also:InternetExplorerDriver

        //Navigate to the url
        driver.navigate().to("https://www.amazon.co.uk/");



    }

    @When("I enter {string} into the search box")
    public void i_enter_into_the_search_box(String string) {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(string); // find the element,
                                                  // then type (sendkeys) into it


    }

    @Then("a page is displayed showing different {string}")
    public void a_page_is_displayed_showing_different(String string) {

    }

    @Then("I click on one of the search results")
    public void i_click_on_one_of_the_search_results() {

    }

    @Then("an error page is displayed showing no results")
    public void an_error_page_is_displayed_showing_no_results() {

    }

}
