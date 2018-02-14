package feedback;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;

public class sendInviteAndCheckSurveyFlow_Test {

    @Test
    public void sendInviteAndCheckSurveyFlow_Test(){

        OpenCI page = new OpenCI();
            page.openCI();
        SendInvite sendInvitation = new SendInvite();
            sendInvitation.searchField.setValue("4444").pressEnter();
            sleep(5000);
            sendInvitation.sendInvitationBtn.click();
            sendInvitation.modal.shouldBe(Condition.visible);
            sendInvitation.modalTitle.shouldHave(text(sendInvitation.modalText));
            sendInvitation.addressField.setValue(sendInvitation.mailCustomer);
            sendInvitation.btnSendInvitation.click();
            sleep(15000);

        StartSurveyFlowGmail surveyFlow = new StartSurveyFlowGmail();
            surveyFlow.gmail();
    }
}
