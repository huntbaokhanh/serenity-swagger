package swaglabs.tasks.cart;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.Collection;

public class CartContent {
    public static Question<Collection<String>> currentlyDisplayed() {
        return Text.ofEach(".inventory_item_name");
    }
}
