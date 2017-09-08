package st;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SurveyCreateProd {

    SelenideElement addSurveyBtn = $(".btn.btn-default.pull-right");
    SelenideElement popupAddSurvey = $(".modal-content");
    SelenideElement titlePopup = $(".modal-title");
    SelenideElement surveyName = $("#name");
    SelenideElement popupBtnAddSurvey = $(".btn.btn-primary.ladda-button");
    SelenideElement alertSurveySaved = $(By.xpath("//span[contains(.,'Survey was successfully saved')]"));
    ElementsCollection surveyList = $$(".padding-l-10.ng-binding");

}
