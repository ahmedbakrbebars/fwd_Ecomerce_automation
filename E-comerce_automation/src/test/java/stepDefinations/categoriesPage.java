package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.categories;

public class categoriesPage {
    categories differentCategories = new categories();
    private Actions actionProvider;

    @Given("logged user navigate to home page")
    public void navigate_to_home() {
        String url = "https://demo.nopcommerce.com/";
        browser.driver.navigate().to(url);
    }

    @When("user select Computer categories")
    public void select_Computer_Category() {
        differentCategories.select_Computer_Category();
    }

    @And("user select a Electronics categories then hover to camera and photo subcategory")
    public void select_subCategory() {
        differentCategories.select_subCategory();
    }


    @And("user choose Gift Cards categories")
    public void Gift_Cards_Category() {
        differentCategories.Gift_Cards_Category();
    }
}
