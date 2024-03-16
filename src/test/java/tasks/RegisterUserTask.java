package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Select;
import pages.GroupLifeStep3Page;
import pages.GroupLifeStep4Page;
import pages.GroupLifeStep5Page;
import pages.SummaryPage;

public class RegisterUserTask {

        public static Performable completePersonalData(
                        String name,
                        String surname,
                        String idNumber,
                        String gender,
                        String genderType,
                        String civilStatus) {
                return Task.where("complete personal data",
                                Enter.theValue(name).into(GroupLifeStep3Page.NAME),
                                Enter.theValue(surname).into(GroupLifeStep3Page.SURNAME),
                                Enter.theValue(idNumber).into(GroupLifeStep3Page.ID_NUMBER),
                                Select.option(gender).from(GroupLifeStep3Page.GENDER),
                                Select.option(genderType).from(GroupLifeStep3Page.IDENTIFICATION_GENDER_TYPE),
                                Select.option(civilStatus).from(GroupLifeStep3Page.CIVIL_STATUS));
        }

        public static Performable completeAddressInformation(
                        String street,
                        String houseNumber,
                        String zipCode,
                        String city) {
                return Task.where("complete address information",
                                Enter.theValue(street).into(GroupLifeStep3Page.STREET),
                                Enter.theValue(houseNumber).into(GroupLifeStep3Page.HOUSE_NUMBER),
                                Enter.theValue(zipCode).into(GroupLifeStep3Page.ZIP_CODE),
                                Select.option(city).from(GroupLifeStep3Page.CITY));
        }

        public static Performable completeContactInformation(
                        String email,
                        String phoneCode,
                        String phoneNumber) {
                return Task.where("complete contact information",
                                Enter.theValue(email).into(GroupLifeStep3Page.EMAIL),
                                Enter.theValue(phoneCode).into(GroupLifeStep3Page.PHONE_CODE),
                                Enter.theValue(phoneNumber).into(GroupLifeStep3Page.PHONE_NUMBER)

                );

        }

        public static Performable completePassword(String password) {
                return Task.where("complete password",
                                Enter.theValue(password).into(GroupLifeStep3Page.PASSWORD));
        };

        public static Performable completeAditionalInformation(
                        String nationality,
                        String placeOfBirth,
                        String occupation,
                        String salaryAnual,
                        String annualIncome) {
                return Task.where("complete contact information",
                        
                                Select.option(nationality).from(GroupLifeStep4Page.NATIONALITY),
                                Enter.theValue(placeOfBirth).into(GroupLifeStep4Page.PLACE_OF_BIRTH),
                                Enter.theValue(occupation).into(GroupLifeStep4Page.OCCUPATION),
                                Enter.theValue(salaryAnual).into(GroupLifeStep4Page.SALARY_ANUAL),
                                Select.option(annualIncome).from(GroupLifeStep4Page.ANNUAL_INCOME)

                );

        }

        public static Performable continueToNextStep(Target next) {
                return Task.where("Continue with the next step",
                                Click.on(next)

                );
        }

        public static Performable completaDataCreditCard(String creditNumber) {
                return Task.where("complete credit number",
                                Enter.theValue(creditNumber).into(GroupLifeStep5Page.CARD_NUMBER));
        }

        public static Performable acceptTermsAndConditions() {
                return Task.where("accept terms and conditions",
                                Click.on(SummaryPage.ACCEPT_TERMS_AND_CONDITIONS));
        }
}
