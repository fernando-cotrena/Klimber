package tasks;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;
import pages.GroupLifeIndexPage;

public class QuoteLifeInsurance {

    public static Performable completeTheDataForQuotation(
            String birthday,
            String province,
            String phoneCode,
            String phonNumber) {
        return Task.where("quote life insurance",
                Enter.theValue(birthday).into(GroupLifeIndexPage.BIRTHDAY),
                Select.options(province).from(GroupLifeIndexPage.PROVINCE),
                Enter.theValue(phoneCode).into(GroupLifeIndexPage.PHONE_CODE),
                Enter.keyValues(phonNumber).into(GroupLifeIndexPage.PHONE_NUMBER).thenHit(Keys.TAB));
    }

    public static Performable continueWithTheSecondStep(){
        return Task.where("Continue with the second step",
        Click.on(GroupLifeIndexPage.CONTINUE_TO_STEP_2)

        );
    }

}
