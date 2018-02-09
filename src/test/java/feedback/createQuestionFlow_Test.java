package feedback;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class createQuestionFlow_Test {
    @Test
    public void createQuestionFlow(){

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
        surveyNew.unitSurvey.click();
        surveyNew.selectUnitSurvey.click();
        surveyNew.popupBtnAddSurvey.click();
        surveyNew.alertSurveySaved.shouldHave(text("Survey added successfully!"));
//        surveyNew.surveyList.get(0).shouldHave(text(userMail));
        surveyNew.editSurvey.get(0).click();
        surveyNew.assertSurveyTitle.shouldHave(text(userMail));
//        surveyNew.surveyList.get(0).click();

        SurveyUpdate survey = new SurveyUpdate();
        survey.surveyUpdatePage.shouldHave(text("Select a channel to start"));

        survey.channelList.get(0).click();
        sleep(4000);

        QuestionType questionType = new QuestionType();

        questionType.QuestionTypeScalable();
        questionType.QuestionTypeConfigurable();

/**
 create question flow (10 question flow)
 */
        QuestionFlow questionFlow = new QuestionFlow();

        for (int flow = 1; flow < 10; flow++) {
            questionFlow.addFlow.get(0).click();
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
