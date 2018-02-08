package feedback;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class createQuestionAllType_Test {

    @Test
    public void createQuestionAllType() {

        OpenCI page = new OpenCI();
        page.openCI();
//        Hub staging = new Hub();
//        staging.loginST();
//        staging.pageSurvey();



        SurveyCreate surveyNew = new SurveyCreate();
            surveyNew.addSurveyBtn.click();
            surveyNew.popupAddSurvey.shouldBe(exist);
            surveyNew.titlePopup.shouldHave(text("Add Survey"));


        int testMail = ((int)(Math.random()*100000));
        String userMail = "qaTest" + testMail;

            surveyNew.surveyName.setValue(userMail);
            surveyNew.popupBtnAddSurvey.click();
            surveyNew.alertSurveySaved.shouldHave(text("Survey was successfully saved"));
            surveyNew.editSurvey.get(0).click();
            surveyNew.assertSurveyTitle.shouldHave(text(userMail));

        SurveyUpdate survey = new SurveyUpdate();
            survey.surveyUpdatePage.shouldHave(text("Select a channel to start"));
            survey.channelList.get(0).click();
            sleep(4000);

        QuestionType questionType = new QuestionType();

        questionType.QuestionTypeScalable();
        questionType.QuestionTypeConfigurable();
        questionType.QuestionTypeOpen();
        questionType.QuestionTypeDelimiter();
        questionType.QuestionTypeFinishSurvey();
        questionType.QuestionTypeSurveyRedirect();
        questionType.QuestionTypeTerminator();

    }
}