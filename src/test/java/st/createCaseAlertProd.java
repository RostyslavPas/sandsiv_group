package st;

import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;

public class createCaseAlertProd {
    @Test
    public void createCaseAlertsProd(){

        Hub hub = new Hub();
            hub.loginST();
            hub.pageGlobalSetting();
        CaseAlertProd caseAlert = new CaseAlertProd();

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

}
