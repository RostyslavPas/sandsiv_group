package feedback;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SendInvite {
    SelenideElement searchField = $(By.xpath("//input[@ng-model='search']"));
    ElementsCollection sendInvitationBtn = $$(".btn.btn-link-light.btn-sm");
    SelenideElement modal = $(".modal-content");
    SelenideElement modalTitle = $(".modal-title");
    String modalText = "Send invitation";
    SelenideElement addressField = $("#address");
    String mailCustomer = "rostislav.pas@sandsiv.com";
    SelenideElement btnSendInvitation = $(".ladda-button.btn.btn-primary");
}
