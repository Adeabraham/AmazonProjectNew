package co.uk.amazon.stepDefinitions;

import co.uk.amazon.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

//step definition is not aware of the pages. To recognise the pages
// we need to INSTANTIATE the object of the pages and extend basepage also 'cos the driver is from there
public class SearchForItemsSteps extends BasePage {

    //INSTANTIATION:
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);//i want selenium to use PageFactory
    // library to initialise driver (connected to browser) and homepage
    // (whatever that is in HomePage to be stored in homePage)
    //the above is instantiation, we instantiated, using page object, not new
    // this time but we used PageFactory to initialise driver and HomePage

    //WebDriver driver; //to be able to use selenium, we import selenium into the project. It is
    // located inside of webDriver library
    // the driver is Selenium. Can be named anything
    // and it's what we use to control
    SearchResultPage searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
    ProductDetailPage productDetailPage = PageFactory.initElements(driver, ProductDetailPage.class);
   // ErrorPage errorPage = PageFactory.initElements(driver, ErrorPage.class);

    @Given("I navigate to Amazon homepage")
    public void i_navigate_to_Amazon_homepage() {

        // launchURL();// this method is inside homePage. homepage is inheriting basepage
        // hence it can also launch url conveniently
        homePage.launchURL();//alternative method
        //It will launch the browser and maximize it for us

/*
**********************************************************************************************

 //Enter the url
        //: setting up the browser:chrome
       // WebDriverManager.chromedriver().setup();// WebDrivermanager, give me chromedriver and
                                                // set it up for me.
        //Launching the browser
        //driver = new ChromeDriver(); //for firefox, use FirefoxDriver,
                                  //also:InternetExplorerDriver

        //Navigate to the url
        //driver.navigate().to("https://www.amazon.co.uk/");
**********************************************************************************************

 */

    }

    @When("I enter {string} into the search box")
    public void i_enter_into_the_search_box(String item) {
        homePage.enterLocationValue(item);
        //searchField.click();
        searchResultPage = homePage.clickSearchButton();//'handshake': transfer
        // from clickSearchButton at homepage to searchResultPage (new page)

    }

    @Then("a page is displayed showing different {string}")
    public void a_page_is_displayed_showing_different(String item) {
        searchResultPage.isSearchResultPageDisplayed(item);//this just confirms that
        // the "items" are actually on the displayed page
        searchResultPage.doesPageTitleContain(item);
    }

    @Then("I click on one of the search results")
    public void i_click_on_one_of_the_search_results() {
        //productDetailPage = searchResultPage.clickOnTheFirstResult();
        productDetailPage = searchResultPage.clickOnAnyResult();
    }

    @Then("an error page is displayed showing no results")
    public void an_error_page_is_displayed_showing_no_results() {

        //errorPage.isErrorPageDisplayed();

    }

}

/*
for zoopla project:
@When("I select {string} from Min price")
public void i_select_from_Min_price(String miniPrice)
{
homePage.selectMinimumPrice(miniPrice);
}
 */

//a-size-mini a-spacing-none a-color-base s-line-clamp-2
//a-size-mini a-spacing-none a-color-base s-line-clamp-2