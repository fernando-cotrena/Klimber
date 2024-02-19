package stepdefinitions;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import pages.GroupLifeIndexPage;
import pages.GroupLifeStep2Page;
import pages.GroupLifeStep3Page;
import tasks.QuoteLifeInsurance;
import tasks.NavigateTo;
import tasks.TakeOutLifeLnsurance2;

public class TakeOutLifeInsuranceSteps {
  
    @Dado("{actor} un usuario que presupuesto un seguro de vida")
    public void dadoUnUsuarioQuePresupuestoUnSeguroDeVida(Actor actor) {
        actor.wasAbleTo(NavigateTo.navigateTo("/ar/GroupLife/Index"));
        actor.attemptsTo(QuoteLifeInsurance.completeTheDataForQuotation("10/10/1980", "CABA", "11", "12345678"));
    }

    @Cuando("inicia el proceso de contratacion")
    public void continuaAlPasoNumeroDos() {
        theActorInTheSpotlight().attemptsTo(QuoteLifeInsurance.continueWithTheSecondStep());
    }

    @Entonces("visualiza el formulario del paso numero dos")
    public void visualizaElFormularioEnPasoDos() {
        String title = "Necesito conocerte un poco más";
        String footnote = "Toda declaración falsa o";

        theActorInTheSpotlight().should(
                eventually(seeThat(the(GroupLifeStep2Page.TITLE), containsText(title))).waitingForNoLongerThan(5)
                        .seconds(),
                eventually(seeThat(the(GroupLifeStep2Page.PANEL_BODY), isVisible())).waitingForNoLongerThan(5)
                        .seconds(),
                eventually(seeThat(the(GroupLifeStep2Page.FOOTNOTE), containsText(footnote))).waitingForNoLongerThan(5)
                        .seconds());
    }

    @Y("completa el paso dos con los datos requeridos")
    public void completaElPasoDos(DataTable dataTable) {
        List<Map<String, String>> table = dataTable.asMaps(String.class, String.class);
        Map<String, String> data = table.get(0);

        String height = data.get("altura");
        String weight = data.get("peso");
        
        theActorInTheSpotlight().attemptsTo(TakeOutLifeLnsurance2.completeTheRequiredDataFromStepTwo(height, weight));
    }

    @Y("avanza al paso numero tres")
    public void avanzaAlPasoTres() {
        theActorInTheSpotlight().attemptsTo(TakeOutLifeLnsurance2.continueToThirdStep());
    }

    @Entonces("visualiza el formulario del paso numero tres")
    public void visualiza_el_formulario_del_paso_numero_tres() {
        String title = "Ya casi terminamos";
        theActorInTheSpotlight().should(
                eventually(seeThat(the(GroupLifeStep3Page.TITLE), containsText(title))).waitingForNoLongerThan(5)
                        .seconds());
    
    }
    @Entonces("visualiza el formulario de contacto")
    public void visualiza_el_formulario_de_contacto() {
        String title = "Muchas gracias por tu interés en nuestros seguros.";
        theActorInTheSpotlight().should(
                eventually(seeThat(the(GroupLifeStep2Page.TITLE), containsText(title))).waitingForNoLongerThan(5)
                        .seconds());
    
    }



}
