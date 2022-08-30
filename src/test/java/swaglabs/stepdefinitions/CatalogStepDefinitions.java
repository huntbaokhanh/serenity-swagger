package swaglabs.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import swaglabs.tasks.cart.AddToCart;
import swaglabs.tasks.cart.CartContent;
import swaglabs.tasks.cart.CartCount;
import swaglabs.tasks.navigation.Navigate;

import java.util.List;

public class CatalogStepDefinitions {

    @And("{actor} is browsing the catalog")
    public void heIsBrowsingTheCatalog(Actor actor) {
        actor.attemptsTo(Navigate.toTheCatalogPage());
    }

    List<String> cartItems;

    @When("{actor} adds the following items to the cart:")
    public void heAddsTheFollowingItemsToTheCart(Actor actor, List<String> items) {
        cartItems = items;
        items.forEach(
                itemName -> actor.attemptsTo(
                        AddToCart.item(itemName)
                )
        );
    }

    @Then("the shopping cart count should be {int}")
    public void theShoppingCartCountShouldBe(int expectedCount) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(CartCount.currentlyDisplayed()).isEqualTo(expectedCount)
        );
    }

    @And("the items should appear in the cart")
    public void theItemsShouldAppearInTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Navigate.toTheShoppingCart(),
                Ensure.that(CartContent.currentlyDisplayed()).containsElementsFrom(cartItems)
        );
    }
}
