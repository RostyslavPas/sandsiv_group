package feedback;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class StartSurveyFlowGmail {
    public void gmail(){
        String pageGmail = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
            open(pageGmail);
        SelenideElement mail = $("#identifierId");
        String userMail = "rostislav.pas@sandsiv.com";
            mail.setValue(userMail).pressEnter();
        SelenideElement password = $(".whsOnd.zHQkBf");
        String userPassword = "Ros_0632059555_sandsiv";
            password.setValue(userPassword).pressEnter();
            sleep(10000);
        ElementsCollection letters = $$(".yX.xY");
            letters.get(0).click();
        SelenideElement showTrimmedContent = $(".ajT");
            showTrimmedContent.click();

        SelenideElement startSurvey = $(By.linkText("Start survey (EN)"));

        startSurvey.click();
        sleep(5000);
            switchTo().window("..:: Sandsiv ::..");
            sleep(3000);
        SelenideElement scalableQuestionCheckbox = $("#form_q_7479_validated_4");
            scalableQuestionCheckbox.click();
        SelenideElement btnEnter = $("#form_submit");
            btnEnter.click();
            sleep(2000);
        SelenideElement openQuestionField = $("#form_q_7520_validated");
            openQuestionField.setValue("test");
            btnEnter.click();
            sleep(2000);
        SelenideElement compliteSurveyFlow = $("#question_text");
            compliteSurveyFlow.shouldHave(text("You completed survey! Thanks! (EN)"));
        SelenideElement closeWindows = $("#content");
            closeWindows.sendKeys(Keys.ALT, Keys.F4);

    }
}
