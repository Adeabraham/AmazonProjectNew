package co.uk.amazon.pages;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ErrorPage extends BasePage
{
    public ErrorPage(WebDriver driver)            // every page created
    {
        this.driver = driver;                            //must have
        PageFactory.initElements(driver, this);     //this constructor
    }
    //@FindBy(css = ".a-size-medium.a-color-base")
    @FindBy(className = "a-row")
    private WebElement errorPageTitle;

    public void isErrorPageDisplayed()
    {
         String errorTitle = errorPageTitle.getText();
         Assert.assertTrue(errorTitle.contains("a-row"));
    }
}
