package co.com.sofka.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USER = Target.the("username of client").located(By.id("com.experitest.ExperiBank:id/usernameTextField"));
    public static final Target PASSWORD = Target.the("password of client").located(By.id("com.experitest.ExperiBank:id/passwordTextField"));
    public static final Target BTN_ACCESS  = Target.the("button for acces to the system").located(By.id("com.experitest.ExperiBank:id/loginButton"));

    public static final Target BUTTON_LOGOUT  = Target.the("LogOut button").located(By.id("com.experitest.ExperiBank:id/logoutButton"));
}
