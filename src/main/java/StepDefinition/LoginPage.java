package StepDefinition;

import io.cucumber.java.en.When;
import static Pages.LogInPage.*;
public class LoginPage {
    @When("User enters the log in details")
    public void user_types_details() throws InterruptedException {
        type_username();
        type_password();
        click_login();
    }
    @When("User clicks the Registration button")
    public void user_clicks_registration_button(){
        click_NewRegister();
    }
}