package feedback;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class OpenCI {
    public void openCI() {
        LoginSSO login = new LoginSSO();
        open(login.pageSSO);
        login.userName.setValue(login.loginUserSSO);
        login.password.setValue(login.passwordUserSSO);
        login.button.click();
        login.userConfirm.shouldHave(text(login.userConfirmText));

        LoginSSO feedback = new LoginSSO();
        feedback.feedbackCI();
    }
}
