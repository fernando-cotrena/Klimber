package pages;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class GroupLifeStep3Page {
    public static Target TITLE = Target.the("title").located(By.className("title"));

    public static Target CONTINUE_TO_NEXT_STEP = Target.the("continue to step 2").located(By.id("btnRegister"));

}
