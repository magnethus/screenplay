package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.AddProduct;
import tasks.SearchProduct;
import userInterfaces.HomePage;

public class GlobalExampleSteps {


    @Managed(driver ="chrome")
    private WebDriver driver;
    private Actor actor = Actor.named("Alex");
    private HomePage homePage = new HomePage();


    @Given("^a new client login to the buying car$")
    public void aNewClientLoginToTheBuyingCar() {
        actor.can(BrowseTheWeb.with(driver));
        actor.wasAbleTo(Open.browserOn(homePage));
    }


    @When("^he adds (.*) ammount of (.*) of (.*) to the car$")
    public void aNewProductIsAdddedToTheCar(String quantity, String description, String typeCategory) {
        actor.wasAbleTo(
                SearchProduct.withDescription(description, typeCategory),
                AddProduct.quantity(quantity)
        );
    }

    @Then("^the product added should be displayed on the buying car$")
    public void theProductAddedShouldBeDisplayedOnTheBuyingCar() {

    }


}
