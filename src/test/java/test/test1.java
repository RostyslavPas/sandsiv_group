package test;


import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class test1 {
    @Test
    public void test_test(){
        open("http://google.com.ua");
    }
}
