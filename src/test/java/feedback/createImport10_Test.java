package feedback;

import org.junit.Test;
import static com.codeborne.selenide.Condition.text;


public class createImport10_Test {

    @Test
    public void createImport10(){
        OpenCI page = new OpenCI();
            page.openCI();
        Import importCI = new Import();
            importCI.mainMenu.get(2).click();
            importCI.importHistory.shouldHave(text(importCI.textImportHistory));
//        Hub staging = new Hub();
//        staging.loginST();
//        staging.pageImport();
//        Import importStaging = new Import();
//        importStaging.addImportWithSurvey();

        for (int countSurvey = 0; countSurvey < 11; countSurvey++) {
            importCI.addImportWithSurvey();
//            importStaging.addImportWithSurvey();
        }


    }
}
