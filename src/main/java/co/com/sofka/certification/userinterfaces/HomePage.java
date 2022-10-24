package co.com.sofka.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target MAKE_PAYMENT_BUTTON = Target.the("Button access to Make a payment functionality").located(By.id("com.experitest.ExperiBank:id/makePaymentButton"));
}
