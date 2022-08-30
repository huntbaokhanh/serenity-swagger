package swaglabs.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import swaglabs.tasks.authentication.Login;
import swaglabs.model.SwaglabsUser;
import swaglabs.tasks.navigation.Navigate;

public class AuthenticationStepDefinitions {

    @Given("{actor} is on the login page")
    public void colin_is_on_the_login_page(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.saucedemo.com/")
        );
    }

    @Given("{actor} has logged on to the application")
    public void is_logged_on(Actor actor) {
        actor.attemptsTo(
                Navigate.toTheLoginPage(),
                Login.asA(SwaglabsUser.STANDARD_USER)
        );
    }

    @When("{actor} logs in with valid account")
    public void colin_logs_in_with_valid_account(Actor actor) {
        actor.attemptsTo(
                Login.asA(SwaglabsUser.STANDARD_USER)
        );
    }

    @Then("{actor} should be presented with the product page")
    public void he_should_be_presented_with_the_product_page(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Text.of(".title")).isEqualTo("PRODUCTS")
        );
    }

}
