package feedback;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;

public class QuestionType {

    public void QuestionTypeScalable(){

        Question question = new Question();

            question.addQuestionBtn.get(1).click();
    sleep(3000);
            question.questionTypeScalable.click();
            question.btnContinue.click();
    sleep(10000);
            question.validationTitleAlert.shouldHave(text(question.textAlertValidation));
            question.questionTitle.setValue(question.questionTitleText);
            question.questionId.setValue(question.questionIdText);
            question.questionText.setValue(question.questionTextText);
            question.questionErrorText.setValue(question.questionErrorTextText);
            question.lowestValue.setValue(question.lowestValueText);
            question.highestValue.setValue(question.highestValueText);
            question.numberOfValue.setValue(question.numberOfValueText);
            question.btnSaveQuestion.click();
            question.notyMessage.shouldHave(text(question.successfullySaved));
    sleep(4000);
    }
    public void QuestionTypeConfigurable() {

        Question question = new Question();

        question.addQuestionBtn.get(1).click();
         sleep(3000);
         question.questionTypeConfigurable.click();
         question.btnContinue.click();
         sleep(10000);
         question.validationTitleAlert.shouldHave(text(question.textAlertValidation));
         question.questionTitle.setValue(question.questionTitleText);
         question.questionId.setValue(question.questionIdText);
         question.questionText.setValue(question.questionTextText);
         question.questionErrorText.setValue(question.questionErrorTextText);
         question.btnSaveQuestion.click();
         question.notyMessage.shouldHave(text(question.successfullySaved));
         sleep(4000);
     }
    public void QuestionTypeOpen() {

        Question question = new Question();

     question.addQuestionBtn.get(1).click();
     sleep(3000);
     question.questionTypeOpen.click();
     question.btnContinue.click();
     sleep(10000);
     question.validationTitleAlert.shouldHave(text(question.textAlertValidation));
     question.questionTitle.setValue(question.questionTitleText);
     question.questionId.setValue(question.questionIdText);
     question.questionText.setValue(question.questionTextText);
     question.questionErrorText.setValue(question.questionErrorTextText);
     question.btnSaveQuestion.click();
     question.notyMessage.shouldHave(text(question.successfullySaved));
     sleep(4000);
 }

    public void QuestionTypeDelimiter() {

        Question question = new Question();
        question.addQuestionBtn.get(1).click();
        sleep(3000);
        question.questionTypeDelimiter.click();
        question.btnContinue.click();
        sleep(10000);
        question.validationTitleAlert.shouldHave(text(question.textAlertValidation));
        question.questionTitle.setValue(question.questionTitleText);
        question.questionId.setValue(question.questionIdText);
        question.questionText.setValue(question.questionTextText);
        question.questionErrorText.setValue(question.questionErrorTextText);
        question.btnSaveQuestion.click();
        question.notyMessage.shouldHave(text(question.successfullySaved));
        sleep(4000);
    }

        public void QuestionTypeFinishSurvey() {

            Question question = new Question();
            question.addQuestionBtn.get(1).click();
            sleep(3000);
            question.questionTypeFinishSurvey.click();
            question.btnContinue.click();
            sleep(10000);
            question.validationTitleAlert.shouldHave(text(question.textAlertValidation));
            question.questionTitle.setValue(question.questionTitleText);
            question.questionId.setValue(question.questionIdText);
            question.questionText.setValue(question.questionTextText);
            question.questionErrorText.setValue(question.questionErrorTextText);
            question.btnSaveQuestion.click();
            question.notyMessage.shouldHave(text(question.successfullySaved));
            sleep(4000);
        }

        public void QuestionTypeSurveyRedirect() {

            Question question = new Question();
            question.addQuestionBtn.get(1).click();
            sleep(3000);
            question.questionTypeSurveyRedirect.click();
            question.btnContinue.click();
            sleep(10000);
            question.validationTitleAlert.shouldHave(text(question.textAlertValidation));
            question.questionTitle.setValue(question.questionTitleText);
            question.questionId.setValue(question.questionIdText);
            question.questionText.setValue(question.questionTextText);
            question.questionErrorText.setValue(question.questionErrorTextText);
            question.btnSaveQuestion.click();
            question.notyMessage.shouldHave(text(question.successfullySaved));
            sleep(4000);
        }

        public void QuestionTypeTerminator() {

            Question question = new Question();
            question.addQuestionBtn.get(1).click();
            sleep(3000);
            question.questionTypeTerminator.click();
            question.btnContinue.click();
            sleep(10000);
            question.validationTitleAlert.shouldHave(text(question.textAlertValidation));
            question.questionTitle.setValue(question.questionTitleText);
            question.questionId.setValue(question.questionIdText);
            question.questionText.setValue(question.questionTextText);
            question.questionErrorText.setValue(question.questionErrorTextText);
            question.btnSaveQuestion.click();
            question.notyMessage.shouldHave(text(question.successfullySaved));
            sleep(4000);
        }

    public void QuestionTypeScalableForCaseAlert(){
        for (int i = 0; i <= 5; i++) {
            Question question = new Question();

            question.addQuestionBtn.get(1).click();
            sleep(3000);
            question.questionTypeScalable.click();
            question.btnContinue.click();
            sleep(10000);
            question.validationTitleAlert.shouldHave(text(question.textAlertValidation));
            question.questionTitle.setValue(question.questionTitleText);
            question.questionId.setValue(question.questionIdText);


            question.questionText.setValue(question.questionTextScalableForCaseAlert[i]);


            question.questionErrorText.setValue(question.questionErrorTextText);
            question.lowestValue.setValue(question.lowestValueText);
            question.highestValue.setValue(question.highestValueText);
            question.numberOfValue.setValue(question.numberOfValueText);
            question.btnSaveQuestion.click();
            question.notyMessage.shouldHave(text(question.successfullySaved));
            sleep(4000);
        }

    }

    public void QuestionTypeOpenForCaseAlert() {
        for (int i = 0; i <= 3; i++) {

            Question question = new Question();

            question.addQuestionBtn.get(1).click();
            sleep(3000);
            question.questionTypeOpen.click();
            question.btnContinue.click();
            sleep(10000);
            question.validationTitleAlert.shouldHave(text(question.textAlertValidation));
            question.questionTitle.setValue(question.questionTitleText);
            question.questionId.setValue(question.questionIdText);
            question.questionText.setValue(question.questionTextOpenForCaseAlert[i]);
            question.questionErrorText.setValue(question.questionErrorTextText);
            question.btnSaveQuestion.click();
            question.notyMessage.shouldHave(text(question.successfullySaved));
            sleep(4000);
        }
    }

}


