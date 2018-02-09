package feedback;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SurveyCreate {
    SelenideElement addSurveyBtn = $(".btn.btn-default.pull-right");
    SelenideElement popupAddSurvey = $(".modal-content");
    SelenideElement titlePopup = $(".modal-title");
    SelenideElement surveyName = $("#survey_name");

    SelenideElement unitSurvey = $(".Select-placeholder");
    SelenideElement selectUnitSurvey = $("#react-select-2--option-0");

    SelenideElement popupBtnAddSurvey = $(By.xpath("//button[contains(.,' Add survey')]"));
    SelenideElement alertSurveySaved = $(".noty_body");
    ElementsCollection surveyList = $$(".padding-l-10.ng-binding");
    SelenideElement surveyUnit = $(By.xpath(".//*[@id='unit']/option[4]"));
    ElementsCollection editSurvey = $$(".btn.btn-editSurvey.btn-link-light.btn-sm");
    SelenideElement assertSurveyTitle = $(".surveyTitle.ng-binding.ng-scope");
    public void createNewSurvey(){
        addSurveyBtn.click();
        popupAddSurvey.shouldBe(exist);
        titlePopup.shouldHave(text("Add Survey"));

        int testMail = ((int)(Math.random()*100000));
        String userMail = "qaTest" + testMail;

        surveyName.setValue(userMail);
        unitSurvey.click();
        selectUnitSurvey.click();
        popupBtnAddSurvey.click();
        alertSurveySaved.shouldHave(text("Survey added successfully!"));
        editSurvey.get(0).click();
        assertSurveyTitle.shouldHave(text(userMail));
    }
}
