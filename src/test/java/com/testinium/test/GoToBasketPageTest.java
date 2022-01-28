package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.GoToBasketPage;
import org.junit.Test;

public class GoToBasketPageTest extends BaseTest {

@Test
    public void goToBasket(){
    GoToBasketPage goBasket= new GoToBasketPage();
    goBasket.goTo();


}


}
