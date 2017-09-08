package st;

import org.junit.Test;
import static com.codeborne.selenide.Selenide.sleep;

public class createCaseAlertConditionProd {
    @Test
    public void createCaseAlertCondition() {
        Hub hub = new Hub();
            hub.loginST();
            hub.pageGlobalSetting();
        CaseAlertProd caseAlert = new CaseAlertProd();
        caseAlert.createCaseAlertProd();
        sleep(2000);

        for (int condition = 1; condition < 3; condition++) {

            caseAlert.addCaseAlertCondition.get(1).click();
            sleep(2000);
            if (condition == 1) {
                caseAlert.chooseAlertConditionType.click();
            }
            if (condition > 1) {
                caseAlert.chooseAlertConditionType1.click();
            }

            caseAlert.btnAddCondition.click();
            sleep(2000);
            caseAlert.createCaseAlertConditionProd();
        }
    }

}
