package StepDefinition;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import static Pages.LoggedInPage.*;
public class LoggedInPage {
    @Then ("User should view the products page")
    public void products_page_visible() throws InterruptedException {
        visibility_product_formalshoes();
        visibility_product_sportsshoes();
        visibility_product_sneakershoes();
    }
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}