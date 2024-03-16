package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pages.GroupLifeStep2Page;

public class TakeOutLifeInsurance {
    public static Performable completeTheRequiredDataFromStepTwo(
            String height,
            String weight) {
        return Task.where("complete the required data from step two",
                Enter.theValue(height).into(GroupLifeStep2Page.HEIGHT),
                Enter.theValue(weight).into(GroupLifeStep2Page.WEIGHT));
    }

    public static Performable continueToThirdStep() {
        return Task.where("Continue with the second step",
                Click.on(GroupLifeStep2Page.CONTINUE_TO_STEP_3)

        );
    }

}
