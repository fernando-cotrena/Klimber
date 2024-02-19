package pages;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class GroupLifeStep2Page {
    public static Target TITLE = Target.the("title").located(By.className("form-group"));
    public static Target PANEL_BODY = Target.the("panel body").located(By.className("panel-body-custom"));
    public static Target FOOTNOTE = Target.the("footnote").located(By.xpath("//*[@id='frmStep2']//small"));

    public static Target HEIGHT = Target.the("height").located(By.id("txtHeight"));
    public static Target WEIGHT = Target.the("weight").located(By.id("txtWeight"));
    public static Target CONTINUE_TO_STEP_3 = Target.the("continue to step 2").located(By.id("btnSaveStep2"));

}
