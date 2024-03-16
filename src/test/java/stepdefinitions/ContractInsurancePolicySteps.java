package stepdefinitions;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static tasks.QuoteLifeInsurance.continueWithTheSecondStep;
import static tasks.RegisterUserTask.acceptTermsAndConditions;
import static tasks.RegisterUserTask.completeAddressInformation;
import static tasks.RegisterUserTask.completeAditionalInformation;
import static tasks.RegisterUserTask.completeContactInformation;
import static tasks.RegisterUserTask.completePassword;
import static tasks.RegisterUserTask.completePersonalData;
import static tasks.RegisterUserTask.continueToNextStep;
import static tasks.TakeOutLifeInsurance.completeTheRequiredDataFromStepTwo;

import org.openqa.selenium.remote.Browser;

import io.cucumber.java.an.Y;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.serenitybdd.screenplay.ensure.Ensure;
import pages.CongratulationsPage;
import pages.GroupLifeStep2Page;
import pages.GroupLifeStep3Page;
import pages.GroupLifeStep4Page;
import pages.GroupLifeStep5Page;
import pages.GroupLifeStep6Page;
import pages.SummaryPage;
import tasks.RegisterUserTask;

public class ContractInsurancePolicySteps {

    @Y("que completo informacion medica,datos personales, de contacto y datos adicionales")
    public void completoInformacionMedicaDatosPersonalesDeContactoYadicionales() {
        int randomNumber = (int) (100 + (Math.random() * 900));

        theActorInTheSpotlight().attemptsTo(
                continueWithTheSecondStep(),
                completeTheRequiredDataFromStepTwo("180", "80"),
                continueToNextStep(GroupLifeStep2Page.CONTINUE_TO_STEP_3),
                completePersonalData("Pedro", "Gonzalez", "33000" + randomNumber, "Masculino", "Masculino",
                        "Soltera/o"),
                completeAddressInformation("Av. La Plata", "666", "1228", " C.A.B.A"),
                completeContactInformation("pedro.gonzales" + randomNumber + "@test.com", "11", "12345001"),
                completePassword("Pa$$word123_"),
                continueToNextStep(GroupLifeStep3Page.CONTINUE_TO_NEXT_STEP),
                continueToNextStep(GroupLifeStep3Page.CONTINUE_TO_NEXT_STEP),
                completeAditionalInformation("Argentina", "Cordoba", "QA", "2500000", "Ahorro"),
                continueToNextStep(GroupLifeStep4Page.CONTINUE_TO_NEXT_STEP)

        );

    }

    @Y("cargo un medio de pago valido")
    public void cargoMedioDePagoValido() {
        theActorInTheSpotlight().attemptsTo(RegisterUserTask.completaDataCreditCard("4509 9535 6623 3704"),
                continueToNextStep(GroupLifeStep5Page.CONTINUE_TO_NEXT_STEP));
    }

    @Y("avanzo si designar beneficiario")
    public void continuaAlPasoNumeroDos() {
        theActorInTheSpotlight()
                .attemptsTo(continueToNextStep(GroupLifeStep6Page.CONTINUE_TO_NEXT_STEP));
    }

    @Cuando("ve el resumen de la poliza")
    public void visualizaElResumenDeLaPoliza() {
        
        theActorInTheSpotlight().attemptsTo(Ensure.that(TheWebPage.currentUrl()).contains("/Summary"));    
        theActorInTheSpotlight().should(
                eventually(seeThat(the(SummaryPage.TITLE), isVisible())).waitingForNoLongerThan(5)
                        .seconds());
    }

    @Y("acepta terminos y condiciones")
    public void aceptaTerminosYCondiciones() {
        theActorInTheSpotlight().attemptsTo(acceptTermsAndConditions());
    }

    @Entonces("visualiza que la poliza de seguro se genero con exito")
    public void visualizaLaPolizaGenerada() {
        
        theActorInTheSpotlight().should(
            eventually(seeThat(the(SummaryPage.TITLE), isVisible())).waitingForNoLongerThan(5)
                    .seconds());

    }

}
