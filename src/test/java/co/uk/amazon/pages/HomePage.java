package co.uk.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    // This is the template on which you write all
    // the methods you need to use in this class.
    //now you need to write a constructor. Write one
    // for each page you create

    public HomePage(WebDriver driver)//
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        /*
        In the above, we are trying to go from one page to another. The page is denoted by driver. We want to ensure that
        once we finish working on a page, selenium still have the (driver) capability to move
         from one page to another. We are using PageFactory to keep the process going. So we are
         creating an object of driver ( this.driver = driver;) and we are using pagefactory to
         initialize the driver.
         */

        //we need to create other classes.....one for every page you create e.g. search result
        // page, product detail page etc

    }
            /*
    This is an empty class. We need to populate it:
    What else do we want to do on the homepage? We need to type into the search field. Then we need to
    identify/locate the element-using varieties of locator: id, classname,name, Xpath,CssSelector
    in the given example, zoopla homepage, we have 3 ways to identify input: ID, name and class

           */

    //now we need to tell selenium how to find the element:
    @FindBy(id = "twotabsearchtextbox")  // selenium should find an element by id. On html, the id is twotabsearchtextbox
    private WebElement searchField;    //the element is a WebElement, private and with the given name searchField
    @FindBy(className = "nav-input")
    private WebElement searchButton;

    public void enterLocationValue(String item)//this location value is coming from the table on feature page & item
                       // is from the heading of item column in amazon project but called location in zoopla project

    {
        searchField.sendKeys(item);    //this will interact with the element we just created
       // searchField.click();          //this will click on the value we enter into search box
                                     //now we can go and use this method inside our step definition i.e.
                                    // we add this  method to step defn otherwise step defn will not run
    }

    public SearchResultPage clickSearchButton()
    {
          searchButton.click(); //action performed on the current page
          return new SearchResultPage(driver);//this is the page that resulted from the searchButton.click action
    }


    //************************************************************************************************
          // we use this code to accept cookies on the homepage (zoopla) but
          // amazon has no cookies so code is not needed here


       // @FindBy(css = ".ui-button-primary.ui-cookie-accept-all-medium-large")
       // public void clickOnCookieButton()
    //        {
    //         acceptCookieButton.click();
    //        }

}




/*
* ******************************************************************************
@FindBy(className = "ui-button-primary ui-cookie-accept-all-medium-large")
private WebElement acceptCookieButton;
*
*
private void enterLocationValue(String location); (if amazon project replace location with item)
{
 acceptCookieButton.click();
}

Note: for id, name or classname, you cannot use any name or class that has space in between OR a compound
    name except when you are using Css:

@FindBy(css = ".ui-button-primary.ui-cookie-accept-all-medium-large")// put a dot before ui and also
private WebElement acceptCookieButton;                      close the space between primary and ui with a dot.

   we can also use: .ui-cookie-accept-all-medium-large - if this classname is UNIQUE, it should find it

//and the method following will be:
public void clickOnCookieButton()
{
   acceptCookieButton.click();//no need to parameterize cos we dont need any value in
}

   * ************************************************************************************
 */

/*
i.e.
@FindBy(css = ".ui-button-primary.ui-cookie-accept-all-medium-large")
private WebElement acceptCookieButton;
public void clickOnCookieButton()
{
   acceptCookieButton.click();
}
 */