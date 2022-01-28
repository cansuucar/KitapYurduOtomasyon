package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.SearchPageAndAddFavorite;
import org.junit.Test;

public class SearchPageAndAddFavoriteTest extends BaseTest {

    @Test
    public void getSearch(){
        SearchPageAndAddFavorite searchPage= new SearchPageAndAddFavorite();
        searchPage.search();


    }



}
