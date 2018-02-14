package feedback;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;

public class sendInvitation100Users {

    @Test
    public void sendInvite_Test(){

        OpenCI page = new OpenCI();
        page.openCI();
        SendInvite sendInvitation = new SendInvite();
        sendInvitation.searchField.setValue("4444").pressEnter();
        sleep(5000);

        for (int invite = 0; invite < 101; invite++) {
            sendInvitation.sendInvitationBtn.click();
            sendInvitation.modal.shouldBe(Condition.visible);
            sendInvitation.modalTitle.shouldHave(text(sendInvitation.modalText));

                String userMail = "rostislav.pas+" + invite + "@sandsiv.com";
                sleep(6000);

            sendInvitation.channel.click();
            sendInvitation.selectChannel.click();
                sleep(3000);
            sendInvitation.language.click();
            sendInvitation.selectLanguage.click();

            sendInvitation.addressField.setValue(userMail);
            sendInvitation.btnSendInvitation.click();
                sleep(1000);
        }
    }
}
