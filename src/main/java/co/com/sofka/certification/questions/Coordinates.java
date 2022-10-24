package co.com.sofka.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.certification.userinterfaces.Coordinates.*;

public class Coordinates implements Question<Boolean> {

    public static Coordinates appear() {
        return new Coordinates();

    }


    @Override
    public Boolean answeredBy(Actor actor){
        return LATIN.resolveFor(actor).isVisible() &&
                !LATIN.resolveFor(actor).getText().isEmpty()&&
                LONGIN.resolveFor(actor).isVisible() &&
                !LONGIN.resolveFor(actor).getText().isEmpty()&&
                CONSULT_BUTTON.resolveFor(actor).isVisible();

    }
}
