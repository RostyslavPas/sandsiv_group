package feedback;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;

public class CaseAlert {
    ElementsCollection menuGlobalSettingCI = $$(".dropdown-menu>li>a");

    ElementsCollection menuCaseAlertSetting = $$(".pointer>a");
    SelenideElement btnAddCaseAlert = $(".btn.btn-success.btn-invitation.pull-right");
    SelenideElement caseAlertName = $("#name");
    SelenideElement addCaseAlert = $(".case-alert-emails-button.btn.btn-primary");
    SelenideElement pressCaseAlertMail = $(".form-control.text-lighter.ng-pristine.ng-untouched.ng-valid.ng-valid-email");
    String userMail = "rotislav.pas@sandsiv.com";
    SelenideElement btnSaveCaseAlert = $(".ladda-button.btn.btn-primary");
    SelenideElement saveCaseAlertSuccess = $(".noty_message");
    String textAlertSuccess = "Case alert was successfully saved";

    int caseAlert = ((int)(Math.random()*10000));
    String textCaseAlertName = "testNameForCaseAlert" + caseAlert;

    ElementsCollection addCaseAlertCondition = $$(".btn.btn-link.btn-xs");
    SelenideElement chooseAlertConditionType = $(By.xpath(".//*[@id='type']/option[1]"));
    SelenideElement chooseAlertConditionType1 = $(By.xpath(".//*[@id='type']/option[2]"));
    SelenideElement btnAddCondition = $(".ladda-button.btn.btn-primary");

    SelenideElement questionExternalID = $("#question");
    SelenideElement answerValue = $("#value");
    SelenideElement joinCondition = $(By.xpath(".//*[@id='alert_condition_link_condition']/option[2]"));
    ElementsCollection btnSave = $$(".ladda-button.btn.btn-primary");
    SelenideElement alertSave = $(".noty_message");
    String textAlert = "Case alert condition was successfully saved";

    String externalID [] = {"Conditions_\"<\"", "Conditions_\"<=\"", "Conditions_\">\"", "Conditions_\"=\"",
            "Conditions_\">=\"", "Conditions_\"!=\"", "Conditions_\"like%\"", "Conditions_\"%like%\"",
            "Conditions_\"likeNot%\"", "Conditions_\"%likeNot%\""};
    String answerValueText [] = {"10", "9", "5", "10", "5", "1", "test", "test_test", "sandsiv", "sandsiv_sandsiv"};

    SelenideElement element1 = $(By.xpath("//option[@value='<']"));
    SelenideElement element2 = $(By.xpath("//option[@value='<=']"));
    SelenideElement element3 = $(By.xpath("//option[@value='>']"));
    SelenideElement element4 = $(By.xpath("//option[@value='=']"));
    SelenideElement element5 = $(By.xpath("//option[@value='>=']"));
    SelenideElement element6 = $(By.xpath("//option[@value='!=']"));
    SelenideElement element7 = $(By.xpath("//option[@value='like%']"));
    SelenideElement element8 = $(By.xpath("//option[@value='%like%']"));
    SelenideElement element9 = $(By.xpath("//option[@value='likeNot%']"));
    SelenideElement element10 = $(By.xpath("//option[@value='%likeNot%']"));

    ElementsCollection btnDelCaseAlert = $$(".btn.btn-link.btn-xs");
    SelenideElement btnConfirmDelCaseAlert = $(".btn.ng-binding.btn-primary");
    SelenideElement messageAlert = $(".noty_message");
    String caseAlertSuccessfullyDel = "Case alert was successfully deleted";


    public void createCaseAlert(){
        CaseAlert caseAlert = new CaseAlert();
//        caseAlert.menuGlobalSettingCI.get(3).click();    if testing ST
        sleep(4000);
        caseAlert.menuCaseAlertSetting.get(2).click();
        caseAlert.btnAddCaseAlert.click();
        caseAlert.caseAlertName.setValue(caseAlert.textCaseAlertName);
        caseAlert.addCaseAlert.click();
        caseAlert.pressCaseAlertMail.setValue(caseAlert.userMail);
        caseAlert.btnSaveCaseAlert.click();
        caseAlert.saveCaseAlertSuccess.shouldHave(text(caseAlert.textAlertSuccess));
        sleep(2000);
    }
    public void createCaseAlertCondition(){

        for (int conditionsAnswer = 0; conditionsAnswer <= 9 ; conditionsAnswer++) {

            addCaseAlertCondition.get(1).click();
            sleep(2000);
            chooseAlertConditionType.click();
            btnAddCondition.click();
            sleep(2000);

            questionExternalID.setValue(externalID[conditionsAnswer]);

            if (conditionsAnswer == 0){
                element1.click();
            }
            if (conditionsAnswer == 1){
                element2.click();
            }
            if (conditionsAnswer == 2){
                element3.click();
            }
            if (conditionsAnswer == 3){
                element4.click();
            }
            if (conditionsAnswer == 4){
                element5.click();
            }
            if (conditionsAnswer == 5){
                element6.click();
            }
            if (conditionsAnswer == 6){
                element7.click();
            }
            if (conditionsAnswer == 7){
                element8.click();
            }
            if (conditionsAnswer == 8){
                element9.click();
            }
            if (conditionsAnswer == 9){
                element10.click();
            }
            answerValue.setValue(answerValueText[conditionsAnswer]);
            joinCondition.click();
            btnSave.get(1).click();
            sleep(3000);
            alertSave.shouldHave(text(textAlert));

        }
    }

    public void delCaseAlert(){
        for (int testCaseAlert = 0; testCaseAlert < 6; testCaseAlert++) {
            btnDelCaseAlert.get(0).click();
            btnConfirmDelCaseAlert.click();
            messageAlert.shouldHave(text(caseAlertSuccessfullyDel));
            sleep(2000);
        }
    }
}
