package co.com.sofka.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static co.com.sofka.certification.userinterfaces.Coordinates.CONSULT_CORDINATES_BUTTON;
import static co.com.sofka.certification.userinterfaces.Coordinates.LOCATIONALERT;
import static co.com.sofka.certification.userinterfaces.Coordinates.ALLOWLOCATION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RequestCordinates implements Task {
    public static Performable current() {
        return instrumented(RequestCordinates.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(

         Click.on(CONSULT_CORDINATES_BUTTON)
    );

        if (LOCATIONALERT.isVisibleFor(actor)){
            actor.attemptsTo(
                    Click.on(ALLOWLOCATION)

            );
        }
    actor.attemptsTo(
            Click.on(CONSULT_CORDINATES_BUTTON)
    );
    }
}
