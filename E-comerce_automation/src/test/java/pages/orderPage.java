package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stepDefinations.browser;

public class orderPage {
    public WebElement Navigate_to_shopping_cart_page() {
        By cart_Page = By.cssSelector("a[href=\"/cart\"]");
        WebElement Navigate_to_shopping_cart_page = browser.driver.findElement(cart_Page);
        return Navigate_to_shopping_cart_page;
    }

    public WebElement choose_wrapped() {
        By checkout = By.name("checkout_attribute_1");
        WebElement choose_wrapped = browser.driver.findElement(checkout);
        Select drpCountry = new Select(choose_wrapped);
        drpCountry.selectByVisibleText("Yes [+$10.00]");
        return choose_wrapped;
    }

    public WebElement agreement_checkbox() {
        By agreement = By.id("termsofservice");
        WebElement agreement_checkbox = browser.driver.findElement(agreement);
        return agreement_checkbox;
    }

    public WebElement checkout_button() {
        By checkout = By.id("checkout");
        WebElement checkout_button = browser.driver.findElement(checkout);
        return checkout_button;
    }
    public WebElement log_in() {
        By login = By.className("email");
        WebElement log_in = browser.driver.findElement(login);
        return log_in;
    }
    public WebElement Password() {
        By password = By.id("Password");
        WebElement Password = browser.driver.findElement(password);
        return Password;
    }
    public  WebElement logInBtn()
    {
        By log_in = By.cssSelector("button[class=\"button-1 login-button\"]");
        WebElement logInBtn = browser.driver.findElement(log_in);
        return logInBtn;
    }
    public WebElement agreement_checkbox2() {
        By agreement = By.id("termsofservice");
        WebElement agreement_checkbox2 = browser.driver.findElement(agreement);
        return agreement_checkbox2;
    }

    public WebElement checkout_button2() {
        By checkout = By.id("checkout");
        WebElement checkout_button2 = browser.driver.findElement(checkout);
        return checkout_button2;
    }


    public WebElement Country() {
        By country = By.id("BillingNewAddress_CountryId");
        WebElement Country = browser.driver.findElement(country);
        Select selectObject2 = new Select(Country);
        selectObject2.selectByValue("123");
        return Country;
    }

    public WebElement City() {
        By city = By.name("BillingNewAddress.City");
        WebElement City = browser.driver.findElement(city);
        return City;
    }

    public WebElement Address() {
        By address = By.name("BillingNewAddress.Address1");
        WebElement Address = browser.driver.findElement(address);
        return Address;
    }

    public WebElement ZipCode() {
        By zipCode = By.name("BillingNewAddress.ZipPostalCode");
        WebElement ZipCode = browser.driver.findElement(zipCode);
        return ZipCode;
    }

    public WebElement PhoneNum() {
        By phoneNum = By.name("BillingNewAddress.PhoneNumber");
        WebElement PhoneNum = browser.driver.findElement(phoneNum);
        return PhoneNum;
    }

    public WebElement continue_Btn() {
        By Btn1 = By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]");
        WebElement continue_Btn = browser.driver.findElement(Btn1);
        return continue_Btn;
    }

    public WebElement continue_Btn2() {
        By Btn2 = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button");
        WebElement continue_Btn2 = browser.driver.findElement(Btn2);
        return continue_Btn2;
    }

    public WebElement continue_Btn3() {
        By Btn3 = By.xpath("//*[@id=\"payment-method-buttons-container\"]/button");
        WebElement continue_Btn3 = browser.driver.findElement(Btn3);
        return continue_Btn3;
    }

    public WebElement continue_Btn4() {
        By Btn4 = By.xpath("//*[@id=\"payment-info-buttons-container\"]/button");
        WebElement continue_Btn4 = browser.driver.findElement(Btn4);
        return continue_Btn4;
    }

    public WebElement confirm_Btn() {
        By Btn5 = By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button");
        WebElement confirm_Btn = browser.driver.findElement(Btn5);
        return confirm_Btn;
    }
}
