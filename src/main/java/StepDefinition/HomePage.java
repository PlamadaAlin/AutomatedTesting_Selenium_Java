package StepDefinition;

import io.cucumber.java.en.Given;
import static Pages.HomePage.*;
public class HomePage {
    @Given("User is on the log in page")
    public void user_navigates_to_login() throws InterruptedException {
        click_sideMenu();
        click_signIn();
    }
    @Given("User navigates to the Online products page")
    public void user_navigates_to_the_Online_product_page() throws InterruptedException {
        click_sideMenu();
        click_products();
    }
}
