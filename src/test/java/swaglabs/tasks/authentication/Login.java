package swaglabs.tasks.authentication;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Button;
import swaglabs.model.SwaglabsUser;

public class Login {
    public static Performable asA(SwaglabsUser standardUser) {
        return Task.where("{0} login as a" + standardUser,
                Enter.theValue(standardUser.userName).into("[data-test=\"username\"]"),
                Enter.theValue(standardUser.passWord).into("[data-test=\"password\"]"),
                Click.on(Button.locatedBy("[data-test=\"login-button\"]")));
    }
}
