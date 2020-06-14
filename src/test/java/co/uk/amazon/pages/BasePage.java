package co.uk.amazon.pages;

import co.uk.amazon.commons.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverManager
{
     public String BASE_URL = "https://www.amazon.co.uk/";
     public Select select;

     public void launchURL()
     {
        driver.navigate().to(BASE_URL);
     }

     public void selectByText(WebElement element, String text)
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
