package feedback;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;

public class copySurveys_Test {
    @Test
    public void copySurveysTest() {
        OpenCI page = new OpenCI();
        page.openCI();
//        Hub staging = new Hub();
//            staging.loginST();
//            staging.pageSurvey();


        CopySurvey copy = new CopySurvey();
            copy.functionButton.get(1).click();
            copy.modalTitle.shouldHave(text("Copy survey"));
            copy.newSurveyName.setValue(copy.textCopySurvey);
            copy.unitSurvey.click();
            copy.selectUnitSurvey.click();

        copy.checkBox.click();
            copy.btnSaveNewSurvey.click();
        sleep(15000);
            copy.newCreatedSurvey.get(0).shouldHave(text(copy.textCopySurvey));
    }
}
