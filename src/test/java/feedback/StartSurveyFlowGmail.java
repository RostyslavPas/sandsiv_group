package feedback;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class StartSurveyFlowGmail {
    @Test
    public void gmail(){
        String pageGmail = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
            open(pageGmail);
        SelenideElement mail = $("#identifierId");
        String userMail = "rostislav.pas@sandsiv.com";
            mail.setValue(userMail).pressEnter();
        SelenideElement password = $(".whsOnd.zHQkBf");
        String userPassword = "Ros_0632059555_sandsiv";
            password.setValue(userPassword).pressEnter();
        ElementsCollection letters = $$(".yX.xY");
            letters.get(0).click();

        SelenideElement startSurvey = $(By.linkText("Start survey (EN)"));

        startSurvey.click();
            switchTo().window("..:: Sandsiv ::..");


    }
}
