package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;

public class AddProductBasket {

    Methods methods;

    public AddProductBasket() {

        methods = new Methods();
    }

   public void AddBaskett(){
    //tüm kitaplar
    methods.click(By.xpath("//span[@class=\"mn-strong common-sprite\" and text()='Tüm Kitaplar']"));
    methods.waitBySeconds(3);
    methods.click(By.xpath("//a[@href='kategori/kitap-hobi/1_212.html' and text()='Hobi']"));
    methods.waitBySeconds(3);

    methods.randomSelect(By.xpath("//a[@class=\"pr-img-link\"]")); //random ürün seçiyor
    methods.waitBySeconds(3);
    methods.click(By.xpath("//span[contains(text(),'Sepete Ekle')]")); //Sepete ekleme kısmı
    methods.waitBySeconds(2);
    methods.hover(By.xpath("//div[@class='menu top my-list']")); //listelerim<favorilerim
    methods.waitBySeconds(2);
    methods.click(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0']"));
    methods.waitBySeconds(2);
    methods.favouriteDelete();
    methods.waitBySeconds(2);
}

}
