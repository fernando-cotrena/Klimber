package stepdefinitions;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
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
import tasks.NavigateTo;
import tasks.QuoteLifeInsurance;

public class ConsultLifeInsuranceCostsSteps {

    @Dado("{actor} un usuario que accedio a cotizar su seguro de vida")
    public void unUsuarioQueAccedioACotizarSuSeguroDeVida(Actor actor) {
        actor.wasAbleTo(NavigateTo.navigateTo("/ar/GroupLife/Index"));
    }

    @Entonces("visualiza la suma asegurada")
    public void visualizaLaSumaAsegurada() {
        String amount = "$ 230.000";
        theActorInTheSpotlight().should(
                eventually(seeThat(the(GroupLifeIndexPage.AMOUNT), containsText(amount))).waitingForNoLongerThan(5)
                        .seconds());
    }

    @Entonces("es notificado que no puede asegurarse por el momento")
    public void noPuedeAsegurase() {
        String term = "Por el momento, la compañía de seguros no va a poder asegurarte en este momento.";
        theActorInTheSpotlight().should(
                eventually(seeThat(the(GroupLifeIndexPage.ALERT), containsText(term))).waitingForNoLongerThan(5)
                        .seconds());
    }

    @Y("visualiza el valor por mes")
    public void visualizaElValorPorMes() {
        String monthlyAmount = "$ 46";
        theActorInTheSpotlight().should(
                eventually(seeThat(the(GroupLifeIndexPage.MONTHLY_AMOUNT), containsText(monthlyAmount)))
                        .waitingForNoLongerThan(5)
                        .seconds());
    }

    @Cuando("completa los datos para presupuestar")
    public void compleataLosDatos(DataTable dataTable) {
        List<Map<String, String>> table = dataTable.asMaps(String.class, String.class);
        Map<String, String> data = table.get(0);

        String birthday = data.get("fecha_de_nacimiento");
        String province = data.get("provincia");
        String phoneCode = data.get("codigo_de_area");
        String phonNumber = data.get("numero_de_telefono");

        theActorInTheSpotlight()
                .attemptsTo(QuoteLifeInsurance.completeTheDataForQuotation(birthday, province, phoneCode, phonNumber));
    }
}
