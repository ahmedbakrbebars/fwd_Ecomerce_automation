package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import stepDefinations.browser;

public class categories {
    public WebElement select_Computer_Category() {
        By ComputerCategory = By.cssSelector("a[href=\"/computers\"]");
        WebElement select_Computer_Category = browser.driver.findElement(ComputerCategory);
        Actions actionProvider = new Actions(browser.driver);
        actionProvider.moveToElement(select_Computer_Category).click().build().perform();
        return select_Computer_Category;

    }

    public WebElement select_subCategory() {
        By subcategory = By.cssSelector("a[href=\"/electronics\"]");
        WebElement select_subCategory = browser.driver.findElement(subcategory);
        Actions actionProvider = new Actions(browser.driver);
        actionProvider.moveToElement(select_subCategory).build().perform();

        By CameraSubCategory = By.cssSelector("a[href=\"/camera-photo\"]");
        WebElement Electronics_SubCategory_Camera_photo = browser.driver.findElement(CameraSubCategory);
        actionProvider.moveToElement(Electronics_SubCategory_Camera_photo).click().build().perform();
        return select_subCategory;
    }
    public WebElement Gift_Cards_Category() {
        By giftCard = By.cssSelector("a[href=\"/gift-cards\"]");
        WebElement Gift_Cards_Category = browser.driver.findElement(giftCard);
        Actions actionProvider = new Actions(browser.driver);
        actionProvider.moveToElement(Gift_Cards_Category).click().build().perform();
        return Gift_Cards_Category;
    }
}
