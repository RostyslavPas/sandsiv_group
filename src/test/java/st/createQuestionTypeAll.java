package st;

import org.junit.Test;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;

public class createQuestionTypeAll {
    @Test
    public void createQuestionTypeAll(){

        Hub hub = new Hub();
            hub.loginST();
            hub.pageSurvey();
        SurveyCreateProd surveyNew = new SurveyCreateProd();
            surveyNew.addSurveyBtn.click();
            surveyNew.popupAddSurvey.shouldBe(exist);
            surveyNew.titlePopup.shouldHave(text("Add Survey"));


        int testMail = ((int)(Math.random()*100000));
        String userMail = "TestQASupport" + testMail;

            surveyNew.surveyName.setValue(userMail);
            surveyNew.popupBtnAddSurvey.click();
            surveyNew.alertSurveySaved.shouldHave(text("Survey was successfully saved"));
            surveyNew.surveyList.get(0).shouldHave(text(userMail));
            surveyNew.surveyList.get(0).click();

        SurveyUpdateProd survey = new SurveyUpdateProd();
            survey.surveyUpdatePage.shouldHave(text("Select a channel to start"));

//        for (int channel = 0; channel < 3; channel++) {
//            survey.channelList.get(channel).click();
//            survey.alertCreateChannel.shouldHave(text("Channel was created"));
//            sleep(3000);
//        }
            survey.channelList.get(0).click();
        sleep(4000);

        QuestionTypeProd questionType = new QuestionTypeProd();

            questionType.QuestionTypeProdScalable();
            questionType.QuestionTypeProdConfigurable();
            questionType.QuestionTypeProdOpen();
            questionType.QuestionTypeProdDelimiter();
            questionType.QuestionTypeProdFinishSurvey();
            questionType.QuestionTypeProdSurveyRedirect();
            questionType.QuestionTypeProdTerminator();

    }

}
