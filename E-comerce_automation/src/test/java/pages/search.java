package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinations.browser;

public class search {
    public WebElement search()
    {
        By Search= By.id("small-searchterms");
        WebElement search= browser.driver.findElement(Search);
        return search;
    }
    public WebElement search_product() {
        By SearchProduct = By.id("small-searchterms");
        WebElement search_product = browser.driver.findElement(SearchProduct);
        return search_product;

    }
    public WebElement search_product1()
    {
        By SearchProduct1 = By.cssSelector("button[class=\"button-1 search-box-button\"]");
        WebElement search_product1= browser.driver.findElement(SearchProduct1);
        return search_product1;
    }
}
