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
    SelenideElement surveyName = $("#name");
    SelenideElement popupBtnAddSurvey = $(".btn.btn-primary.ladda-button");
    SelenideElement alertSurveySaved = $(By.xpath("//span[contains(.,'Survey was successfully saved')]"));
    ElementsCollection surveyList = $$(".padding-l-10.ng-binding");
    SelenideElement surveyUnit = $(By.xpath(".//*[@id='unit']/option[4]"));
    ElementsCollection editSurvey = $$(".btn.btn-link-light.btn-sm");
    SelenideElement assertSurveyTitle = $(".surveyTitle.ng-binding");
    public void createNewSurvey(){
        addSurveyBtn.click();
        popupAddSurvey.shouldBe(exist);
        titlePopup.shouldHave(text("Add Survey"));

        int testMail = ((int)(Math.random()*100000));
        String userMail = "qaTest" + testMail;

        surveyName.setValue(userMail);
        popupBtnAddSurvey.click();
        alertSurveySaved.shouldHave(text("Survey was successfully saved"));
        editSurvey.get(0).click();
        assertSurveyTitle.shouldHave(text(userMail));
    }
}
