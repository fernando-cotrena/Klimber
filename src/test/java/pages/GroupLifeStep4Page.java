package pages;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class GroupLifeStep4Page {

    public static Target TITLE = Target.the("title").located(By.className("title"));

    public static Target NATIONALITY = Target.the("nationality").located(By.id("Nationality"));

    public static Target PLACE_OF_BIRTH = Target.the("surname").located(By.id("PlaceOfBirth"));

    public static Target OCCUPATION = Target.the("id number").located(By.id("txtOccupation"));

    public static Target SALARY_ANUAL = Target.the("gender").located(By.id("txtSalaryAnual"));

    public static Target ANNUAL_INCOME = Target.the("gender type")
            .located(By.id("txtAnnualIncome"));

    public static Target DATA_USAGE = Target.the("civil status").located(By.id("chkDataUsage"));

    
    public static Target CONTINUE_TO_NEXT_STEP = Target.the("continue to next step").located(By.id("btnSaveInfo"));

}
