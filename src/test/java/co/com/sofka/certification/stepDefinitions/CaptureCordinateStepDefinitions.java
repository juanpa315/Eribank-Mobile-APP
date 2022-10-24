package co.com.sofka.certification.stepDefinitions;

import co.com.sofka.certification.exceptions.CoordinateQueryException;
import co.com.sofka.certification.tasks.RequestCordinates;
import co.com.sofka.certification.questions.Coordinates;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.sofka.certification.exceptions.CoordinateQueryException.MSG_COORD_EXCEP;
import static org.hamcrest.Matchers.equalTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CaptureCordinateStepDefinitions {

    private static final String YISUS = "Yisus";

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
    }

    @When("Request the cordinates")
    public void requestTheCordinates() {
       theActorCalled(YISUS).attemptsTo(
               RequestCordinates.current()
       );
    }
    @Then("The system display latitude and longitude of the current location")
    public void theSystemDisplayLatitudeAndLongitudeOfTheCurrentLocation() {
        theActorInTheSpotlight().should(seeThat(
                Coordinates.appear(), equalTo(true)
        ).orComplainWith(CoordinateQueryException.class, MSG_COORD_EXCEP));
    }
}
