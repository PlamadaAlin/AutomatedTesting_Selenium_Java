package StepDefinition;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

import static Pages.ProductsPage.click_formalshoesdropdpown;
import static Pages.ProductsPage.getText_formalshoes;

public class ProductsPage {

    @When("User clicks on Formal Shoes drop down")
    public void user_clicks_on_Formal_Shoes_drop_down() throws InterruptedException {
        click_formalshoesdropdpown();
    }
    @Then("User should view the product")
    public void user_should_be_able_to_view_the_Products() throws InterruptedException {
        assertEquals("   Classic Cheltenham",getText_formalshoes());
    }

}