package co.uk.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage extends BasePage{

    public ProductDetailPage(WebDriver driver)//
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
        //we need to create other classes.....

    }

}
