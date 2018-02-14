package feedback;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SendInvite {
    SelenideElement searchField = $(By.xpath("//input[@placeholder='Search']"));
    SelenideElement sendInvitationBtn = $(".btn-link-light.btn-sendInvitation.btn.btn-sm.btn-default");
    SelenideElement modal = $(".modal-content");
    SelenideElement modalTitle = $(".modal-title");
    String modalText = "Send invitation";

    SelenideElement channel = $(By.xpath(".//*[@id='react-select-27--value']/div[1]"));
    SelenideElement selectChannel = $("#react-select-9--option-0");
    SelenideElement language = $(By.xpath(".//*[@id='react-select-29--value']/div[1]"));
    SelenideElement selectLanguage = $("#react-select-14--option-0");

    SelenideElement addressField = $("#invitation_email");
    String mailCustomer = "rostislav.pas@sandsiv.com";
    SelenideElement btnSendInvitation = $(By.xpath("//button[contains(.,' Send invitation')]"));
}
