package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.tags;

public class tagsPage {
    tags Tags = new tags();

    @Given("user navigate to computer category page")
    public void navigate_to_home() {
        String url = "https://demo.nopcommerce.com/computers";
        browser.driver.navigate().to(url);
    }

    @When("user select cool from popular tags")
    public void Cool_Tags() {
        Tags.Cool_Tags();
    }

    @And("user select digital from popular tags")

    public void Digital_Tags() {
        Tags.Digital_Tags();
    }

    @And("user select game from popular tags")

    public void Game_Tags() {
        Tags.Game_Tags();
    }

    @And("user select computer from popular tags")
    public void Computer_Tags() {
        Tags.Computer_Tags();
    }
}
