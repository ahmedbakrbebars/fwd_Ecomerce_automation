package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinations.browser;

public class loginPage {
    public WebElement loginBtn()
    {
        By login = By.className("ico-login");
        WebElement loginBtn = browser.driver.findElement(login);
        return loginBtn;
    }

    public WebElement Email()
    {
        By email = By.name("Email");
        WebElement Email = browser.driver.findElement(email);
        return Email;
    }
    public WebElement Password()
    {
        By password = By.id("Password");
        WebElement Password = browser.driver.findElement(password);
        return Password;

    }
    public  WebElement SignIn()
    {
        By sign_in = By.cssSelector("button[class=\"button-1 login-button\"]");
        WebElement SignIn = browser.driver.findElement(sign_in);
        return SignIn;
    }
}
