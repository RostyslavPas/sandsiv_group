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
    SelenideElement newSurveyName = $("#name");
    SelenideElement checkBox = $(By.xpath("html/body/div[6]/div/div/div/div[2]/form/fieldset/div[3]/div/label[1]/input"));
    SelenideElement btnSaveNewSurvey = $(".btn.btn-primary.ladda-button");
    SelenideElement newCreatedSurvey = $(By.xpath("//span[contains(.,'testCopySurvey')]"));
}
