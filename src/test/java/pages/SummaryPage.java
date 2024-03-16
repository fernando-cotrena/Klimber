package pages;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class SummaryPage {

   
    public static Target TITLE = Target.the("title").located(By.className("title"));
    public static Target ACCEPT_TERMS_AND_CONDITIONS = Target.the("continue to next step").located(By.id("chkTC"));

}