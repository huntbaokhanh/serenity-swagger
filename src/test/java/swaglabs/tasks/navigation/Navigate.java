package swaglabs.tasks.navigation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {
    public static Performable toTheLoginPage() {
        return Open.url("https://www.saucedemo.com/");
    }

    public static Performable toTheCatalogPage() {
        return Open.url("https://www.saucedemo.com/inventory.html");
    }

    public static Performable toTheShoppingCart() {
        return Open.url("https://www.saucedemo.com/cart.html");
    }
}
