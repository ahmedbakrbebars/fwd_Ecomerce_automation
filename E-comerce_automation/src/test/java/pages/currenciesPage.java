package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stepDefinations.browser;

public class currenciesPage {
    public WebElement choose_Euro()
    {
        By Euro= By.id("customerCurrency");
        WebElement choose_Euro= browser.driver.findElement(Euro);
        Select selectObject = new Select(choose_Euro);
        selectObject.selectByVisibleText("Euro");
        return choose_Euro;
    }


    public WebElement choose_US()
    {
        By US= By.id("customerCurrency");
        WebElement choose_US= browser.driver.findElement(US);
        Select selectObject2 = new Select(choose_US);
        selectObject2.selectByVisibleText("US Dollar");
        return choose_US;
    }
}
