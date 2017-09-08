package st;

import org.junit.Test;

public class createTenImportFile {

    @Test
    public void createTenImportFile(){

        Hub hub = new Hub();
            hub.loginST();
            hub.pageImport();
        ImportProd importProd = new ImportProd();
        for (int i = 0; i < 11; i++) {
            importProd.addImportProd();

        }
    }
}
