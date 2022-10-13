package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import pages.registrationPage;

public class registration {
    registrationPage register = new registrationPage();


    @And("user navigate to home page")
    public void navigate_home()
    {
        String url = "https://demo.nopcommerce.com/";
        browser.driver.navigate() .to(url);
    }

    @And("user click on register link")
    public void register_link()
    {

        register.register_Link().click();    }


    @And("user fills your personal details with valid data")
    public void Personal_details()
    {
        register.First_Name().sendKeys("Ahmed");
        register.Last_Name().sendKeys("Bebars");
        register.Email().sendKeys("bebars@gmail.com");



    }
    @And("user fills your password with valid data")
    public void Your_Password_details()

    {
        register.Password().sendKeys("P@ssw0rd");
        register.Confirm_Password().sendKeys("P@ssw0rd");

    }

    @And("user clicks on register button")
    public void register_button() {
        register.RegisterBtn().click();
    }

    @Then("success message is displayed")
    public void success_Message()
    {
        Assert.assertTrue(browser.driver.findElement(By.cssSelector("div[class=\"result\"]")).isDisplayed());

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(browser.driver.findElement(By.cssSelector("div[class=\"result\"]")).isDisplayed());
        soft.assertTrue(browser.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/registerresult/1?returnUrl=/"));
        soft.assertTrue(browser.driver.findElement(By.cssSelector("a[href=\"/customer/info\"][class=\"ico-account\"]")).isDisplayed());

        soft.assertAll();

    }
}
