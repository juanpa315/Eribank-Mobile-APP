package co.com.sofka.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.HashMap;
import java.util.Map;

import static co.com.sofka.certification.interactions.ScrollToElementInteraction.scrollToElement;
import static co.com.sofka.certification.userinterfaces.MakePaymentPage.*;

public class MakePaymentTask implements Task {

    private Map<String, String> userData;



    public  MakePaymentTask(Map<String, String> userData) {
        this.userData=userData;

    }

    public static MakePaymentTask MakePayment(Map<String, String> userData){
        return new MakePaymentTask(userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        /*Map<String, Integer> scrollArea = new HashMap<>();
        scrollArea.put("left", -10000);
        scrollArea.put("top", 0);
        scrollArea.put("width", 0);
        scrollArea.put("height", 0);*/

        actor.attemptsTo(
                Enter.theValue(userData.get("Phone")).into(PHONE),
                Enter.theValue(userData.get("Name")).into(NAME),
                scrollToElement()
                        .lookingFor(AMOUNT)
                        //.withScrollArea(scrollArea)
                        .inDirection("right")
                        .andSpeed(10000.0)
                        .andPercent(0.5),
                Enter.theValue(userData.get("Country")).into(COUNTRY),
                Click.on(SEND_PAYMENT)
        );
    }
}
