package Tests;

import BaseTest.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests extends BaseTest{


    @Test

    public void checkTitleAndUrlTest(){
        String title = "Google";
        String url = "https://www.google.co.in/";

        Assertions.assertEquals(title, homePage.checkTitle());
        Assertions.assertEquals(url, homePage.checkUrl());

    }

}

