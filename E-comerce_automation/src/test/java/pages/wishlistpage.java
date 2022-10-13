package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinations.browser;

public class wishlistpage {
    public WebElement Apple_MacBook() {
        By MacBook = By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]");
        WebElement Apple_MacBook = browser.driver.findElement(MacBook);
        return Apple_MacBook;
    }
    public WebElement Add_To_Wishlist_1() {
        By wishlist_1 = By.id("add-to-wishlist-button-4");
        WebElement Add_To_Wishlist_1 = browser.driver.findElement(wishlist_1);
        return Add_To_Wishlist_1;
    }


    public WebElement Laptop_Samsung() {
        By Samsung = By.cssSelector("a[href=\"/samsung-series-9-np900x4c-premium-ultrabook\"]");
        WebElement Laptop_Samsung = browser.driver.findElement(Samsung);
        return Laptop_Samsung;

    }
    public WebElement Add_To_Wishlist_2() {
        By wishlist_2 = By.id("add-to-wishlist-button-6");
        WebElement Add_To_Wishlist_2 = browser.driver.findElement(wishlist_2);
        return Add_To_Wishlist_2;
    }

    public WebElement HP_Laptop() {
        By HP = By.cssSelector("a[href=\"/hp-spectre-xt-pro-ultrabook\"]");
        WebElement HP_Laptop = browser.driver.findElement(HP);
        return HP_Laptop;
    }
    public WebElement Add_To_Wishlist_3() {
        By wishlist_3 = By.id("add-to-wishlist-button-7");
        WebElement Add_To_Wishlist_3 = browser.driver.findElement(wishlist_3);
        return Add_To_Wishlist_3;
    }
}
