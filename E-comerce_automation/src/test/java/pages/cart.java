package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinations.browser;

public class cart {
    public WebElement Apple_MacBook() {
        By MacBook = By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]");
        WebElement Apple_MacBook = browser.driver.findElement(MacBook);
        return Apple_MacBook;
    }

    public WebElement Add_To_Cart_1() {
        By cart_1 = By.id("add-to-cart-button-4");
        WebElement Add_To_Cart_1 = browser.driver.findElement(cart_1);
        return Add_To_Cart_1;
    }


    public WebElement Laptop_Samsung() {
        By Samsung = By.cssSelector("a[href=\"/samsung-series-9-np900x4c-premium-ultrabook\"]");
        WebElement Laptop_Samsung = browser.driver.findElement(Samsung);
        return Laptop_Samsung;
    }

    public WebElement Add_To_Cart_2() {
        By cart_2 = By.id("add-to-cart-button-6");
        WebElement Add_To_Cart_2 = browser.driver.findElement(cart_2);
        return Add_To_Cart_2;

    }


    public WebElement Gift_card() {
        String url = "https://demo.nopcommerce.com/";
        browser.driver.navigate().to(url);
        By giftCard = By.cssSelector("a[href=\"/25-virtual-gift-card\"]");
        WebElement Gift_card = browser.driver.findElement(giftCard);
        return Gift_card;
    }

    public WebElement RecipientName() {
        By Recipient = By.name("giftcard_43.RecipientName");
        WebElement RecipientName = browser.driver.findElement(Recipient);
        return RecipientName;
    }

    public WebElement RecipientEmail() {
        By RecipientMail = By.id("giftcard_43_RecipientEmail");
        WebElement RecipientEmail = browser.driver.findElement(RecipientMail);
        return RecipientEmail;
    }

    public WebElement SenderName() {
        By Sender = By.id("giftcard_43_SenderName");
        WebElement SenderName = browser.driver.findElement(Sender);
        return SenderName;
    }

    public WebElement SenderEmail() {
        By SenderMail = By.id("giftcard_43_SenderEmail");
        WebElement SenderEmail = browser.driver.findElement(SenderMail);
        return SenderEmail;
    }

    public WebElement Add_To_Cart_3() {
        By cart_3 = By.id("add-to-cart-button-43");
        WebElement Add_To_Cart_3 = browser.driver.findElement(cart_3);
        return Add_To_Cart_3;

    }
}
