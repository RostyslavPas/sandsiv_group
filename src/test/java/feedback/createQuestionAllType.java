package feedback;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class createQuestionAllType {

    @Test
    public void createQuestionAllType() {

        OpenCI page = new OpenCI();
        page.openCI();
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
//            surveyNew.surveyList.get(0).shouldHave(text(userMail));

//            surveyNew.surveyList.get(0).click();

        SurveyUpdate survey = new SurveyUpdate();
            survey.surveyUpdatePage.shouldHave(text("Select a channel to start"));

//        for (int channel = 0; channel < 3; channel++) {
//            survey.channelList.get(channel).click();
//            survey.alertCreateChannel.shouldHave(text("Channel was created"));
//            sleep(3000);
//        }
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