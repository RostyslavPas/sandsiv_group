package feedback;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.sleep;

public class deleteCaseAlert_Test {

    @Test
    public void deleteCaseAlert() {

        OpenCI page = new OpenCI();
            page.openCI();
        CaseAlert caseAlert = new CaseAlert();
            caseAlert.menuGlobalSettingCI.get(3).click();
                sleep(4000);
            caseAlert.menuCaseAlertSetting.get(2).click();
            caseAlert.delCaseAlert();
    }
}
