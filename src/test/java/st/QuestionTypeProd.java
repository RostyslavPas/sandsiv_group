package st;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;

public class QuestionTypeProd {
    public void QuestionTypeProdScalable(){

        QuestionProd question = new QuestionProd();

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
        sleep(5000);
    }
    public void QuestionTypeProdConfigurable() {

        QuestionProd question = new QuestionProd();

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
        sleep(5000);
    }
    public void QuestionTypeProdOpen() {

        QuestionProd question = new QuestionProd();

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
        sleep(5000);
    }

    public void QuestionTypeProdDelimiter() {

        QuestionProd question = new QuestionProd();
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
        sleep(5000);
    }

    public void QuestionTypeProdFinishSurvey() {

        QuestionProd question = new QuestionProd();
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
        sleep(5000);
    }

    public void QuestionTypeProdSurveyRedirect() {

        QuestionProd question = new QuestionProd();
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
        sleep(5000);
    }

    public void QuestionTypeProdTerminator() {

        QuestionProd question = new QuestionProd();
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
        sleep(5000);
    }
}
