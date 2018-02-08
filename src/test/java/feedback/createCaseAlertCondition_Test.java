package feedback;

import org.junit.jupiter.api.Test;

public class createCaseAlertCondition_Test {
    @Test
    public void createCaseAlertCondition() {
      OpenCI page = new OpenCI();
            page.openCI();

//        Hub staging = new Hub();
//            staging.loginST();
//            staging.pageGlobalSetting();


        CaseAlert caseAlert = new CaseAlert();
            caseAlert.createCaseAlert();
            caseAlert.createCaseAlertCondition();
    }
}


