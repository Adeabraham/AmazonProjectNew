package co.uk.amazon.pages;

import co.uk.amazon.commons.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverManager
{
     public String BASE_URL = "https://www.amazon.co.uk/";
     //selenium will do select by:
     public Select select;

     //with the variable BASE_URL created, we want to launch a method
    //that will navigate to the url
     public void launchURL()
     {
        driver.navigate().to(BASE_URL);
     }//in the url, driver will help me to navigate
      // and the url is base_url


    // we need to write some methods to help us select:

     public void selectByText(WebElement element, String text)// to select we need the web element &
                                                          // the string to pass onto it
     {
         // this method will be used on any of the pages to select anything
         select = new Select(element);
         select.selectByVisibleText(text);
     }
     public void selectByValue(WebElement element,String value)

     {
         select = new Select(element);
         select.selectByValue(value);
     }
     public void selectByIndex(WebElement element, int index)

     {
         select = new Select(element);
         select.selectByIndex(index);
     }
}
