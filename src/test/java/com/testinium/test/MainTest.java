package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.*;
import org.junit.Test;

public class MainTest extends BaseTest {

    @Test
    public void mainMethod(){

        HomePage homePage= new HomePage();
        homePage.home();

        LoginPage loginPage= new LoginPage();
        loginPage.login();

        SearchPageAndAddFavorite searchPage= new SearchPageAndAddFavorite();
        searchPage.search();

        CatalogPage catalogPage= new CatalogPage();
        catalogPage.catalog();

        AddProductBasket addPageBasket= new AddProductBasket();
        addPageBasket.AddBaskett();

        GoToBasketPage goBasket= new GoToBasketPage();
        goBasket.goTo();

        LogoutPage logoutPage= new LogoutPage();
        logoutPage.logOut();
    }

}
