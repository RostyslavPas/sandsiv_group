package st;

import org.junit.Test;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;

public class createQuestionFlowProd {
    @Test
    public void createQuestionFlow(){

        Hub hub = new Hub();
            hub.loginST();
            hub.pageSurvey();

            sleep(20000);

//        SurveyCreateProd surveyNew = new SurveyCreateProd();
//            surveyNew.addSurveyBtn.click();
//            surveyNew.popupAddSurvey.shouldBe(exist);
//            surveyNew.titlePopup.shouldHave(text("Add Survey"));
//
//
//        int testMail = ((int)(Math.random()*100000));
//        String userMail = "TestQASupportSundsiv" + testMail;
//
//            surveyNew.surveyName.setValue(userMail);
//            surveyNew.popupBtnAddSurvey.click();
//            surveyNew.alertSurveySaved.shouldHave(text("Survey was successfully saved"));
//            surveyNew.surveyList.get(0).shouldHave(text(userMail));
//
//            surveyNew.surveyList.get(0).click();
//
//        SurveyUpdateProd survey = new SurveyUpdateProd();
//            survey.surveyUpdatePage.shouldHave(text("Select a channel to start"));
//
//            survey.channelList.get(0).click();
//        sleep(4000);
//
//        QuestionTypeProd questionType = new QuestionTypeProd();
//
//            questionType.QuestionTypeProdScalable();
//            questionType.QuestionTypeProdConfigurable();

/**
 create question flow (10 question flow)
 */
        QuestionFlowProd questionFlow = new QuestionFlowProd();

        for (int flow = 1; flow < 12; flow++) {
            questionFlow.addFlow.get(0).click();
            sleep(3000);
            questionFlow.conditionQuestionAnswer.click();
            questionFlow.btnAddFlow.click();
            sleep(3000);
            questionFlow.skipQuestion.click();
            questionFlow.questionFlowCount.setValue("" + flow);
            questionFlow.btnSaveFlow.click();
            sleep(3000);
        }
    }
}
