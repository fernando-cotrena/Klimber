package pages;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class GroupLifeStep3Page {

    public static Target TITLE = Target.the("title").located(By.className("title"));

    public static Target NAME = Target.the("name").located(By.id("Name"));

    public static Target SURNAME = Target.the("surname").located(By.id("Surname"));

    public static Target ID_NUMBER = Target.the("id number").located(By.id("ID_Number"));

    public static Target GENDER = Target.the("gender").located(By.id("Gender"));

    public static Target IDENTIFICATION_GENDER_TYPE = Target.the("gender type")
            .located(By.id("IdentificationGenderType"));

    public static Target CIVIL_STATUS = Target.the("civil status").located(By.id("CivilStatus"));

    public static Target EMAIL = Target.the("email").located(By.id("txtEmail"));

    public static Target PASSWORD = Target.the("password").located(By.id("Password"));

    public static Target PHONE_CODE = Target.the("phone code").located(By.id("PhoneCode"));

    public static Target PHONE_NUMBER = Target.the("phone number").located(By.id("PhoneNumber"));

    public static Target STREET = Target.the("street").located(By.id("Street"));

    public static Target HOUSE_NUMBER = Target.the("house number").located(By.id("HouseNumber"));

    public static Target ZIP_CODE = Target.the("zip code").located(By.id("zipCode"));

    public static Target CITY = Target.the("city").located(By.id("city"));

    public static Target REGISTER_USER = Target.the("register user").located(By.id("btnRegister"));

    public static Target CONTINUE_TO_NEXT_STEP = Target.the("continue to next step").located(By.id("btnRegister"));

}
