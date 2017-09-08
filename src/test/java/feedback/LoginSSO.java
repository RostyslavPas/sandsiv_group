package feedback;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginSSO {
    String pageSSO = "http://sso.ci-fb.sandsiv.com/account/login/";

    SelenideElement userName = $("#id_username");
    SelenideElement password = $("#id_password");

    String loginUserSSO = "rostislav.pas@sandsiv.com";
    String passwordUserSSO = "Ros_0632059555_sandsiv";

    SelenideElement button = $(".btn.btn-block.btn-primary");
    SelenideElement userConfirm = $(By.xpath("//span[contains(.,'SANDSIV Single Sign On Application')]"));
    String userConfirmText = "SANDSIV Single Sign On Application";

    public void feedbackCI(){
        String pageFeedbackCI = "http://feedback-backend.ci.sandsiv.com/";
        open(pageFeedbackCI);
        SelenideElement menu = $(".dropdown-menu");
        menu.shouldBe(Condition.visible);
        sleep(10000);
    }
}