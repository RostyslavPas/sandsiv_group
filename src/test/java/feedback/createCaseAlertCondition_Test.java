package feedback;

import org.junit.Test;

public class createCaseAlertCondition_Test {
    @Test
    public void createCaseAlertCondition() {
        OpenCI page = new OpenCI();
            page.openCI();
        CaseAlert caseAlert = new CaseAlert();
            caseAlert.createCaseAlert();
            caseAlert.createCaseAlertCondition();
    }
}


