package StepDefinition;

import io.cucumber.java.en.When;
import static Pages.LogInPage.*;

import static Pages.HomePage.*;
public class LoginPage {
    @When("User enters the log in details")
    public void user_successfully_loggedin() throws InterruptedException {
        type_username();
        type_password();
        click_login();

    }
}