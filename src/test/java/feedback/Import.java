package feedback;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;

public class Import {

    ElementsCollection mainMenu = $$(".dropdown-menu>li>a");
    SelenideElement importHistory = $(".pull-left.padding-l-15>strong");
    String textImportHistory = "Import History";
    SelenideElement btnAddImport = $(".btn.btn-default.btn-in-panel.pull-right");
    SelenideElement popapWindows = $(".modal-title");
    String textPopapWindows = "Import questionnaires for the survey";
    SelenideElement alertInfo = $(".alert.alert-info>p");
    String alertInfoText = "Choose a file to import (txt or csv). Please consider export or backup your data first";
    SelenideElement uploadFile = $(By.xpath(".//*[@id='file']"));
    String filePath = "X:\\Download\\Import_File_FeedbackTest.csv";
    SelenideElement delimiter = $("#delimiter");
    SelenideElement surveyColumn = $("#survey_column");
    SelenideElement btnSaveImport = $(".ladda-button.btn.btn-primary");
    SelenideElement alertSave = $(".noty_message");
    String textImportSave = "Import was successfully saved";


    public void addImport(){

        btnAddImport.click();
        popapWindows.shouldHave(text(textPopapWindows));
        alertInfo.shouldHave(text(alertInfoText));
        sleep(2000);
        uploadFile.sendKeys(filePath);
        delimiter.setValue(",");
        surveyColumn.setValue("10");
        btnSaveImport.click();
        alertSave.shouldHave(text(textImportSave));
        Import importCI = new Import();
        importCI.importHistory.shouldHave(text(importCI.textImportHistory));

    }
    public void addImportWithSurvey(){
        btnAddImport.click();
        popapWindows.shouldHave(text(textPopapWindows));
        alertInfo.shouldHave(text(alertInfoText));
        sleep(2000);
//        $(By.xpath("//option[@label='TestBlackListCustomer_QA']")).click();
        $(By.xpath("//option[@label='QA_Test_Sandsiv::27.10.2017']")).click();
        sleep(2000);
        uploadFile.sendKeys(filePath);
        delimiter.setValue(",");
        btnSaveImport.click();
        alertSave.shouldHave(text(textImportSave));
        Import importCI = new Import();
        importCI.importHistory.shouldHave(text(importCI.textImportHistory));
    }


}
