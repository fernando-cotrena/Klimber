package pages;

import org.openqa.selenium.By;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("/ar/GroupLife/Index")
public class GroupLifeIndexPage {

    public static Target BIRTHDAY = Target.the("birthday").located(By.id("BirthdayStep1"));
    public static Target PROVINCE = Target.the("pronvince").located(By.id("province"));
    public static Target PHONE_CODE = Target.the("phone code").located(By.id("txtPhoneCode"));
    public static Target PHONE_NUMBER = Target.the("phone number").located(By.id("txtPhoneNumber"));
    public static Target AMOUNT = Target.the("amount").located(By.id("suma_aseguradatotal"));
    public static Target MONTHLY_AMOUNT = Target.the("monthly amount").located(By.id("ex6CurrentSliderValLabel"));
    public static Target ALERT = Target.the("message alert").located(By.xpath("//*[@aria-role='alertdialog']"));
    
    public static Target CONTINUE_TO_STEP_2 = Target.the("continue to step 1").located(By.id("btnSaveStep1"));

}
