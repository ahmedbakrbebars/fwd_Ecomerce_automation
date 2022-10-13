package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import stepDefinations.browser;

public class tags {
    public WebElement Cool_Tags() {

        By cool = By.cssSelector("a[href=\"/cool\"]");
        WebElement Cool_Tags = browser.driver.findElement(cool);
        Actions actionProvider = new Actions(browser.driver);
        actionProvider.moveToElement(Cool_Tags).click().build().perform();
        return Cool_Tags;
    }
    public WebElement Digital_Tags() {
        By Digital = By.cssSelector("a[href=\"/digital\"]");
        WebElement Digital_Tags = browser.driver.findElement(Digital);
        Actions actionProvider = new Actions(browser.driver);
        actionProvider.moveToElement(Digital_Tags).click().build().perform();
        return Digital_Tags;
    }
    public WebElement Game_Tags() {
        By Game = By.cssSelector("a[href=\"/game\"]");
        WebElement Game_Tags = browser.driver.findElement(Game);
        Actions actionProvider = new Actions(browser.driver);
        actionProvider.moveToElement(Game_Tags).click().build().perform();
        return Game_Tags;
    }

    public WebElement Computer_Tags() {
        By Computer = By.cssSelector("a[href=\"/computer\"]");
        WebElement  Computer_Tags = browser.driver.findElement(Computer);
        Actions actionProvider = new Actions(browser.driver);
        actionProvider.moveToElement( Computer_Tags).click().build().perform();
        return  Computer_Tags;
    }
}
