package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;

public class SearchPageAndAddFavorite {  //Oyuncak arama
    Methods methods;

    public SearchPageAndAddFavorite(){

        methods = new Methods();

    }
    public void search() {

        methods.sendKeys(By.id("search-input"), "oyuncak"); //Arama kısmına oyuncak yazdık
        methods.click(By.cssSelector(".common-sprite.button-search")); //aratma işlemi
        methods.scrollWithAction(By.xpath("//div[@class='product-cr'][7]"));//scrollu 7. ürüne kadar götürdük
        methods.waitBySeconds(2);
        for (int i=7; i<11; i++) { //favorilere ekleme işlemi gercekleşti
            methods.selectProduct(By.cssSelector(".add-to-favorites"), i);
            methods.waitBySeconds(2);

        }

    }
}
