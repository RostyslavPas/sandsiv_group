package feedback;

import org.junit.Test;
import static com.codeborne.selenide.Selenide.sleep;

public class createCaseAlertCondition {
    @Test
    public void createCaseAlertCondition() {
        OpenCI page = new OpenCI();
            page.openCI();
        CaseAlert caseAlert = new CaseAlert();
            caseAlert.createCaseAlert();
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
                caseAlert.createCaseAlertCondition();
        }
    }
}


