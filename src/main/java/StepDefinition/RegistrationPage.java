package StepDefinition;

import io.cucumber.java.en.Then;
import static Pages.RegistrationPage.*;
import io.cucumber.java.After;
public class RegistrationPage {
    @Then ("User should view the Registration page")
    public void registrtion_page_visible() throws InterruptedException {
        visibility_first_name_textbox();

    }
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}