package feedback;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;


public class createImport10_Test {

    @Test
    public void createImport10(){
        OpenCI page = new OpenCI();
            page.openCI();
        Import importCI = new Import();
            importCI.mainMenu.get(3).click();
            importCI.importHistory.shouldHave(text(importCI.textImportHistory));

        for (int countSurvey = 0; countSurvey < 11; countSurvey++) {
            importCI.addImport();
//            importStaging.addImportWithSurvey();
        }


    }
}
