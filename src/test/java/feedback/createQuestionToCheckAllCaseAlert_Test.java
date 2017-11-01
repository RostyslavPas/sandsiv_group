package feedback;

import org.junit.Test;

public class createQuestionToCheckAllCaseAlert_Test {
    @Test
    public void testCaseAlert(){
        OpenCI page = new OpenCI();
            page.openCI();
        SurveyCreate createSurvey = new SurveyCreate();
            createSurvey.createNewSurvey();
        SurveyUpdate updateSurvey = new SurveyUpdate();
            updateSurvey.surveyUpdate();
        QuestionType question = new QuestionType();
            question.QuestionTypeScalableForCaseAlert();
            question.QuestionTypeOpenForCaseAlert();
            question.QuestionTypeFinishSurvey();
        CaseAlert caseAlert = new CaseAlert();
            caseAlert.createCaseAlert();
            caseAlert.createCaseAlertCondition();
    }
}
