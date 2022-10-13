package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinations.browser;

public class registrationPage {
    public WebElement register_Link()
    {
        By register= By.className("ico-register");
        WebElement register_Link= browser.driver.findElement(register);
        return register_Link;
    }
    public WebElement First_Name() {
        By FirstName = By.cssSelector("input[id^=\"FirstName\"]");
        WebElement First_Name = browser.driver.findElement(FirstName);
        return First_Name;
    }
    public WebElement Last_Name() {
        By LastName = By.cssSelector("input[id^=\"LastName\"]");
        WebElement Last_Name = browser.driver.findElement(LastName);
        return Last_Name;
    }
    public WebElement Email() {
        By email = By.name("Email");
        WebElement Email = browser.driver.findElement(email);
        return Email;
    }
    public WebElement Password() {
        By password = By.id("Password");
        WebElement Password = browser.driver.findElement(password);
        return Password;

    }
    public WebElement Confirm_Password() {
        By password = By.id("ConfirmPassword");
        WebElement Confirm_Password = browser.driver.findElement(password);
        return Confirm_Password;
    }
    public  WebElement RegisterBtn()
    {
        By register1 = By.xpath("//button[contains(@name,\"register-butt\")]");
        WebElement RegisterBtn = browser.driver.findElement(register1);
        return RegisterBtn;
    }
}
