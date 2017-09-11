package feedback;

import com.codeborne.selenide.ElementsCollection;
import org.junit.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;

public class deleteCaseAlert_Test {
    public void delAlert(){
        $$(".btn.btn-link.btn-xs").get(0).click();
        $(".btn.ng-binding.btn-primary").click();
        $(".noty_message").shouldHave(text("Case alert was successfully deleted"));
    }
    @Test
    public void deleteCaseAlert() {

        OpenCI page = new OpenCI();
            page.openCI();

        CaseAlert caseAlert = new CaseAlert();
            caseAlert.menuGlobalSetting.get(3).click();
        sleep(4000);
            caseAlert.menuCaseAlertSetting.get(2).click();
        ElementsCollection alert = $$(".pointer.case-alerts-item.ng-pristine.ng-untouched.ng-valid.ng-binding");

    }
}
