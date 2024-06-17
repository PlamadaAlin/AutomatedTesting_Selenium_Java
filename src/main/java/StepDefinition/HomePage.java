package StepDefinition;

import io.cucumber.java.en.Given;
import static Pages.HomePage.*;
public class HomePage {
    @Given("User is on the log in page")
    public void user_navigates_to_login() throws InterruptedException {
        click_sideMenu();
        click_signIn();
    }
}
