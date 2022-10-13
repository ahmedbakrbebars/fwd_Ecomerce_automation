package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinations.browser;

public class resetPassword {
    public WebElement Forget_password()
    {
        By ForgetPassword= By.className("forgot-password");
        WebElement Forget_password= browser.driver.findElement(ForgetPassword);
        return Forget_password;
    }

    public WebElement Email_details()
    {
        By EmailDetails= By.id("Email");
        WebElement Email_details= browser.driver.findElement(EmailDetails);
        return Email_details;
    }
    public WebElement change_password_btn()
    {
        By changePassword= By.xpath("//button[contains(@name,\"send-email\")]");
        WebElement change_password_btn= browser.driver.findElement(changePassword);
        return change_password_btn;
    }
}
