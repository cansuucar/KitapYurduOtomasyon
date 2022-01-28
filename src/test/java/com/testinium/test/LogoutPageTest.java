package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.LogoutPage;
import org.junit.Test;

public class LogoutPageTest extends BaseTest {

    @Test
    public void LogoutTest(){
        LogoutPage logoutPage=new LogoutPage();
        logoutPage.logOut();

    }
}
