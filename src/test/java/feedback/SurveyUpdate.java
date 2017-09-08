package feedback;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SurveyUpdate {
    SelenideElement surveyUpdatePage = $(".alert.alert-danger.alert-danger-light.text-center.ng-binding");
    ElementsCollection channelList = $$(".btn.btn-default.btn-channel.ng-scope");
    SelenideElement alertCreateChannel = $(".noty_message");

}
