package feedback;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class QuestionFlow {
    ElementsCollection addFlow = $$(".btn.btn-link.btn-sm.no-margin-l");
    SelenideElement conditionQuestionAnswer = $(By.xpath(".//*[@id='type']/option[3]"));
    SelenideElement btnAddFlow = $(".ladda-button.btn.btn-primary");
    SelenideElement skipQuestion = $(By.xpath("html/body/div[2]/div/div/div/div[2]/form/fieldset/div/flow-questions/div[2]/div[1]/div/div[1]/select[1]/option[3]"));
    SelenideElement questionFlowCount = $(".form-control.flow-value.ng-pristine.ng-untouched.ng-valid");
    SelenideElement btnSaveFlow = $(".ladda-button.btn.btn-primary.btn-w-115");
}
