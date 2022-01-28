package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.HomePage;
import com.testinium.page.LoginPage;
import org.junit.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void loginTest(){
        LoginPage loginPage= new LoginPage();
        loginPage.login();

    }

    @Test
    public void getTextTest(){  //Giriş yaptıktan sonra ad alanının testini gerceklicez
        //HomePage acıldıgı kontrolü
        HomePage homePage= new HomePage();
        LoginPage loginPage= new LoginPage();


        homePage.home();
        loginPage.login();
        loginPage.textControlTest();


    }
}