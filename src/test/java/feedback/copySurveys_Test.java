package feedback;

import org.junit.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;

public class copySurveys_Test {
    @Test
    public void copySurveysTest(){
        OpenCI page = new OpenCI();
        page.openCI();
        CopySurvey copy = new CopySurvey();
        copy.functionButton.get(1).click();
        copy.modalTitle.shouldHave(text("Copy survey"));
        copy.newSurveyName.setValue(copy.textCopySurvey);
        copy.checkBox.click();
        copy.btnSaveNewSurvey.click();
        sleep(10000);
        copy.newCreatedSurvey.shouldBe(visible);
    }
}
