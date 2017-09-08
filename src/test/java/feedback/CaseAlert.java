package feedback;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;

public class CaseAlert {
    ElementsCollection menuGlobalSetting = $$(".dropdown-menu>li>a");
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

    public void createCaseAlert(){
        CaseAlert caseAlert = new CaseAlert();
        caseAlert.menuGlobalSetting.get(3).click();
        sleep(4000);
        caseAlert.menuCaseAlertSetting.get(2).click();
        caseAlert.btnAddCaseAlert.click();
        caseAlert.caseAlertName.setValue(caseAlert.textCaseAlertName);
        caseAlert.addCaseAlert.click();
        caseAlert.pressCaseAlertMail.setValue(caseAlert.userMail);
        caseAlert.btnSaveCaseAlert.click();
        caseAlert.saveCaseAlertSuccess.shouldHave(text(caseAlert.textAlertSuccess));
    }
    public void createCaseAlertCondition(){
        SelenideElement questionExternalID = $("#question");
        questionExternalID.setValue("1");
        SelenideElement alertCondition = $(By.xpath(".//*[@id='alert_condition_comparison']/option[2]"));
        alertCondition.click();
        SelenideElement answerValue = $("#value");
        answerValue.setValue("55");
        SelenideElement joinCondition = $(By.xpath(".//*[@id='alert_condition_link_condition']/option[2]"));
        joinCondition.click();
        ElementsCollection btnSave = $$(".ladda-button.btn.btn-primary");
        btnSave.get(1).click();
        sleep(3000);
        SelenideElement alertSave = $(".noty_message");
        String textAlert = "Case alert condition was successfully saved";
        alertSave.shouldHave(text(textAlert));
    }


    ElementsCollection addCaseAlertCondition = $$(".btn.btn-link.btn-xs");
    SelenideElement chooseAlertConditionType = $(By.xpath(".//*[@id='type']/option[1]"));
    SelenideElement chooseAlertConditionType1 = $(By.xpath(".//*[@id='type']/option[2]"));
    SelenideElement btnAddCondition = $(".ladda-button.btn.btn-primary");

}
