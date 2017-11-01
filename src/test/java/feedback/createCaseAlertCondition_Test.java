package feedback;

import org.junit.Test;
import static com.codeborne.selenide.Selenide.sleep;

public class createCaseAlertCondition_Test {
    @Test
    public void createCaseAlertCondition() {
        OpenCI page = new OpenCI();
            page.openCI();
        CaseAlert caseAlert = new CaseAlert();
            caseAlert.createCaseAlert();
        sleep(2000);
            caseAlert.createCaseAlertCondition();
    }
}


