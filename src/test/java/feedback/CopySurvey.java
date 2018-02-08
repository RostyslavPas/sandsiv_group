package feedback;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CopySurvey {
    ElementsCollection functionButton = $$(".btn.btn-link-light.btn-sm");
    SelenideElement modalTitle = $(".modal-title");
    String textCopySurvey = "testCopySurvey";
    SelenideElement newSurveyName = $("#survey_name");
    SelenideElement unitSurvey = $(".Select-placeholder");
    SelenideElement selectUnitSurvey = $("#react-select-2--option-0");
    SelenideElement checkBox = $("#WEB");
    SelenideElement btnSaveNewSurvey = $(By.xpath("//button[contains(.,' Copy Survey')]"));
    ElementsCollection newCreatedSurvey = $$(".wrap");
}
