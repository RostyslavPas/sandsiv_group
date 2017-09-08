package feedback;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;

public class sendInviteAndCheckSurveyFlow_Test {
    @Test
    public void sendInviteAndCheckSurveyFlow_Test(){

        OpenCI page = new OpenCI();
            page.openCI();

        SelenideElement searchField = $(".form-control.ng-valid.ng-dirty.ng-valid-parse.on-focus.ng-touched");
            searchField.setValue("4444").pressEnter();
            sleep(5000);

        ElementsCollection sendInvitationBtn = $$(".btn.btn-link-light.btn-sm");
            sendInvitationBtn.get(3).click();
        SelenideElement modal = $(".modal-content");
            modal.shouldBe(Condition.visible);
        SelenideElement modalTitle = $(".modal-title");
        String modalText = "Send invitation";
            modalTitle.shouldHave(text(modalText));
        SelenideElement addressField = $("#address");
        String mailCustomer = "rostislav.pas@sandsiv.com";
            addressField.setValue(mailCustomer);
        SelenideElement btnSendInvitation = $(".ladda-button.btn.btn-primary");
            btnSendInvitation.click();

            sleep(15000);



    }
}
