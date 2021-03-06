package feedback;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Question {
    ElementsCollection addQuestionBtn = $$(".btn.btn-success.pull-right");
    SelenideElement questionTypeScalable = $(By.xpath(".//*[@id='questionType']/option[2]"));
    SelenideElement questionTypeConfigurable = $(By.xpath(".//*[@id='questionType']/option[3]"));
    SelenideElement questionTypeOpen = $(By.xpath(".//*[@id='questionType']/option[4]"));
    SelenideElement questionTypeDelimiter = $(By.xpath(".//*[@id='questionType']/option[5]"));
    SelenideElement questionTypeFinishSurvey = $(By.xpath(".//*[@id='questionType']/option[6]"));
    SelenideElement questionTypeSurveyRedirect = $(By.xpath(".//*[@id='questionType']/option[7]"));
    SelenideElement questionTypeTerminator = $(By.xpath(".//*[@id='questionType']/option[8]"));
    SelenideElement btnContinue = $(".ladda-button.btn.btn-primary");
    SelenideElement validationTitleAlert = $(".alert.alert-validation-error.padding-t-5.ng-binding");

    String textAlertValidation = "The question title must not be empty!";

    SelenideElement questionTitle = $("#title");
    String questionTitleText = "Test Title";
    SelenideElement questionId = $("#external_id");
    String questionIdText = "Text_External_ID";
    String questionIdTextForCaseAlert [] = {"Conditions_\"<\"", "Conditions_\"<=\"", "Conditions_\">\"", "Conditions_\"=\"",
            "Conditions_\">=\"", "Conditions_\"!=\"", "Conditions_\"like%\"", "Conditions_\"%like%\"",
            "Conditions_\"likeNot%\"", "Conditions_\"%likeNot%\""};
    SelenideElement questionText = $("#text");
    String questionTextText = "Question Text";
    String questionTextScalableForCaseAlert [] = {"Conditions_\"<\" must be < 10 ", "Conditions_\"<=\" must be <= 9 ",
            "Conditions_\">\" must be > 5 ", "Conditions_\"=\" must be = 10 ", "Conditions_\">=\" must be >= 5 ",
            "Conditions_\"!=\" must be != 1 "};
    String questionTextOpenForCaseAlert [] = {"Conditions_\"like%\" must be like% - test",
            "Conditions_\"%like%\" must be %like% - test_test", "Conditions_\"likeNot%\" must be likeNot% - sandsiv ",
            "Conditions_\"%likeNot%\" must be %likeNot% - sandsiv_sandsiv"};

    SelenideElement questionErrorText = $("#error_text");
    String questionErrorTextText = "Error Question Text";
    SelenideElement lowestValue = $(By.xpath(".//*[@id='configurable-values-panel']/div[2]/div[4]/div/question-options/div[3]/input[2]"));
    SelenideElement highestValue = $(By.xpath(".//*[@id='configurable-values-panel']/div[2]/div[6]/div/question-options/div[3]/input[2]"));
    SelenideElement numberOfValue = $(By.xpath(".//*[@id='configurable-values-panel']/div[2]/div[8]/div/question-options/div[3]/input[2]"));
    SelenideElement btnSaveQuestion = $(".ladda-button.btn.btn-primary");

    String lowestValueText = "1";
    String highestValueText = "10";
    String numberOfValueText = "10";

    SelenideElement notyMessage = $(".noty_message");
    String successfullySaved = "Question was successfully saved";

}
