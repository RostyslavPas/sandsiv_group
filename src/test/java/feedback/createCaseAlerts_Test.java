package feedback;

import org.junit.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;

public class createCaseAlerts_Test {

    @Test
    public void createCaseAlerts(){

        OpenCI page = new OpenCI();
        page.openCI();
        CaseAlert caseAlert = new CaseAlert();
        caseAlert.createCaseAlert();

    }
}
