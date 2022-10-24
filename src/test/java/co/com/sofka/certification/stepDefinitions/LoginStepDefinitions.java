package co.com.sofka.certification.stepDefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;


import static co.com.sofka.certification.tasks.LoginTask.Login;
import static co.com.sofka.certification.userinterfaces.LoginPage.BUTTON_LOGOUT;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class LoginStepDefinitions {


    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    //Steps lo login successful
    @When("{actor} access to the eriBank application with user {string} and Password {string}")
    public void iAccessToTheEriBankApplicationWithUserAndPassword(Actor actor, String withUser, String andPassword) {
        actor.attemptsTo(
                Login(withUser, andPassword)
        );
    }

    @Then("{actor} can login successfully on the eriBank application")
    public void theActorCanLoginSuccessfullyOnTheEriBankApplication(Actor actor) {
        actor.attemptsTo(
                Ensure.that(BUTTON_LOGOUT).isDisplayed()
        );

    }

    //Steps when the user access with incorrect login details

    @When("{actor} insert a incorrect username {string} and password {string}")
    public void actorInsertAIncorrectUsernameAndPassword(Actor actor, String withIncorrectUsername, String andIncorrectPassword) {
        actor.attemptsTo(
                Login(withIncorrectUsername, andIncorrectPassword)
        );
    }
    @Then("The system denies {actor} access to the eriBank application")
    public void theSystemDeniesActorAccessToTheEriBankApplication(Actor actor) {
        actor.attemptsTo(
                Ensure.that(BUTTON_LOGOUT).isNotDisplayed()
        );

    }


}

