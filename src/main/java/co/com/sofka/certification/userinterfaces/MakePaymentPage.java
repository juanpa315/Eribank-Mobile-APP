package co.com.sofka.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MakePaymentPage {

    public static final Target PHONE = Target.the("").located(By.id("com.experitest.ExperiBank:id/phoneTextField"));
    public static final Target NAME = Target.the("").located(By.id("com.experitest.ExperiBank:id/nameTextField"));

    public static final Target COUNTRY = Target.the("").located(By.id("com.experitest.ExperiBank:id/countryTextField"));

    public static final Target AMOUNT = Target.the("").located(By.id("com.experitest.ExperiBank:id/amount"));

    public static final Target SEND_PAYMENT = Target.the("").located(By.id("com.experitest.ExperiBank:id/sendPaymentButton"));

}
