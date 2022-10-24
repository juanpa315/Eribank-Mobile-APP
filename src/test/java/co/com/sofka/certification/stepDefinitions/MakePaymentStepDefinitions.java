package co.com.sofka.certification.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static co.com.sofka.certification.tasks.LoginTask.Login;
import static co.com.sofka.certification.tasks.MakePaymentTask.MakePayment;
import static co.com.sofka.certification.userinterfaces.HomePage.MAKE_PAYMENT_BUTTON;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class MakePaymentStepDefinitions {


    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    @Given("{actor} access to the application with user {string} and password {string}")
    public void heAccessToTheApplicationWithUserAndPassword(Actor actor, String withUser, String andPassword) {
        actor.attemptsTo(
                Login(withUser, andPassword)
        );
    }
    @And("{actor} makes click on the makePayment button")
    public void heMakesClickOnTheMakePaymentButton(Actor actor) {
        actor.attemptsTo(
                Click.on(MAKE_PAYMENT_BUTTON)
        );
    }
    @When("{actor} complete the required data")
    public void heCompleteTheRequiredData(Actor actor, List<Map<String, String>> userData) {
        Map<String, String> transactionUserData = userData.get(0);
        System.out.println(userData.get(0).get("Phone"));
        actor.attemptsTo(
                MakePayment(transactionUserData)
        );
    }
    @And("{actor} makes click on the button send")
    public void heMakesClickOnTheButtonSend(Actor actor) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The application sends the payment successfully")
    public void theApplicationSendsThePaymentSuccessfully(Actor actor) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
