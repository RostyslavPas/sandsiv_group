package feedback;

import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class Hub {

    String pageSt = "https://st-activate.sandsiv.com/login";
    SelenideElement loginUserSt = $("#username");
    String nameSt = "rostislav.pas@sandsiv.com";
    SelenideElement passwordUserSt = $("#password");
    String passwordSt = "Ro$_$and$iv_Gr@";
    SelenideElement btnLoginSt = $("#_submit");
    SelenideElement notyAlert = $(".noty_message");
    String notyMessage = "Already logged in";

    String pageSurvey = "https://st-activate.sandsiv.com/feedback/#/survey_list";
    String pageExport = "https://st-activate.sandsiv.com/feedback/#/export/results";
    String pageImport = "https://st-activate.sandsiv.com/feedback/#/import";
    String pageGlobalSetting = "https://st-activate.sandsiv.com/feedback/#/settings/advanced";
    String pageCustomer = "https://st-activate.sandsiv.com/feedback/#/customers";

    public void loginST() {

        open(pageSt);
        loginUserSt.setValue(nameSt);
        passwordUserSt.setValue(passwordSt);
        btnLoginSt.click();
        notyAlert.shouldHave(text(notyMessage));
    }
    public void pageSurvey(){
        open(pageSurvey);
        sleep(20000);
    }
    public void pageExport(){
        open(pageExport);
        sleep(20000);
    }
    public void pageImport(){
        open(pageImport);
        sleep(20000);
    }
    public void pageGlobalSetting(){
        open(pageGlobalSetting);
        sleep(20000);
    }
    public void pageCustomers(){
        open(pageCustomer);
        sleep(20000);
    }
}
