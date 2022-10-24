package co.com.sofka.certification.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Coordinates {

    public static final Target CONSULT_CORDINATES_BUTTON = Target.the("Button that consult the current coordinates")
            .located(By.id("mx.com.cdp.consumirws:id/btnConsGeo"));

   public static final Target LATIN = Target.the("EditText of Latitude In")
           .located(By.id("mx.com.cdp.consumirws:id/txtLatIn"));

    public static final Target LONGIN = Target.the("EditText of longitude In")
            .located(By.id("mx.com.cdp.consumirws:id/txtLngIn"));

    public static final Target CONSULT_BUTTON = Target.the("Button that consults the data of latitude and longitude")
            .located(By.id("mx.com.cdp.consumirws:id/btnEnviar"));


    public static final Target LOCATIONALERT = Target.the("Alert about location permisions")
            .located(By.id("com.android.permissioncontroller:id/content_container"));

    public static final Target ALLOWLOCATION = Target.the("option for allow location in the app")
            .located(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
}
