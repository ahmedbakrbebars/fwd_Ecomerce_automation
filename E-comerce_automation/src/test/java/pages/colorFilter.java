package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import stepDefinations.browser;

public class colorFilter {
    public WebElement Apparel_subcategory() {
        By ApparelCategory = By.cssSelector("a[href=\"/apparel\"]");
        WebElement Apparel_subcategory = browser.driver.findElement(ApparelCategory);
        Actions actionProvider = new Actions(browser.driver);
        actionProvider.moveToElement(Apparel_subcategory).build().perform();
        return Apparel_subcategory;
    }
    public WebElement shoesCategory() {
        By ShoesCategory = By.cssSelector("a[href=\"/shoes\"]");
        WebElement shoesCategory = browser.driver.findElement(ShoesCategory);
        Actions actionProvider = new Actions(browser.driver);
        actionProvider.moveToElement(shoesCategory).build().perform();
        return shoesCategory;

    }

    public WebElement Filter_Color() {
        By filterColor = By.id("attribute-option-15");
        WebElement Filter_Color = browser.driver.findElement(filterColor);
        return Filter_Color;
    }
}
