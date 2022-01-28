package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class GoToBasketPage {  //Sepete git


    Methods methods;

    public GoToBasketPage() {

        methods = new Methods();
    }

   public void goTo(){ //sepete git

    methods.click(By.id("sprite-cart-icon"));
    methods.waitBySeconds(3);
    methods.click(By.id("js-cart"));
    methods.waitBySeconds(3);
    methods.reset(By.xpath("//*[@name='quantity']"));
    methods.waitBySeconds(1);
    methods.sendKeys(By.xpath("//*[@name='quantity']"),"2");
    methods.waitBySeconds(1);
    methods.click(By.xpath("//i[@title='Güncelle']"));
    methods.waitBySeconds(1);
    methods.click(By.xpath("//div[@class='right']/a"));
    methods.waitBySeconds(3);  //satın al kısmına tıkladık


      methods.click(By.xpath("//a[@href='#tab-shipping-new-adress']")); //Yeni adres kullanamk istiyoruma tıkladık
       methods.sendKeys(By.id("address-firstname-companyname"),"Cansu Gizem ");  //Ad
       methods.waitBySeconds(3);
       methods.sendKeys(By.id("address-lastname-title"),"Uçar"); //Soyad
       methods.waitBySeconds(3);
       methods.selectByText(By.cssSelector("select#address-country-id"),"Türkiye");
       methods.waitBySeconds(2);
       methods.selectByText(By.cssSelector("select#address-zone-id"),"İstanbul");
       methods.waitBySeconds(2);
       methods.selectByText(By.cssSelector("select#address-county-id"),"ADALAR");
       methods.waitBySeconds(2);
       methods.sendKeys(By.id("district"),"BURGAZADA MAH"); //Mahalle
       methods.waitBySeconds(2);
       methods.sendKeys(By.id("address-address-text"),"Yeni"); //Adres
       methods.waitBySeconds(2);
       methods.sendKeys(By.id("address-postcode"),"12345"); //PostaKodu
       methods.waitBySeconds(2);
       methods.sendKeys(By.id("address-telephone"),"5443333332"); // SabitTelefonu
       methods.waitBySeconds(2);
       methods.sendKeys(By.id("address-mobile-telephone"),"5213332211"); //Cep Telefon
       methods.waitBySeconds(2);
       methods.sendKeys(By.id("address-tax-id"),"13993049604"); //TcKimlik
       methods.waitBySeconds(2);

      // Button
      methods.click(By.id("button-checkout-continue"));
      methods.waitBySeconds(3);
      methods.click(By.id("button-checkout-continue"));
      methods.waitBySeconds(3);

      //Kart bilgileri
       methods.sendKeys(By.id("credit-card-owner"),"Cansu Gizem Uçar");  //Ad
       methods.waitBySeconds(3);
       methods.sendKeys(By.id("credit_card_number_1"),"1234"); //Kart numaraları
       methods.waitBySeconds(3);
       methods.sendKeys(By.id("credit_card_number_2"),"1234");
       methods.waitBySeconds(3);
       methods.sendKeys(By.id("credit_card_number_3"),"1234");
       methods.waitBySeconds(3);
       methods.sendKeys(By.id("credit_card_number_4"),"1234");
       methods.waitBySeconds(3);
       methods.selectByText(By.cssSelector("select#credit-card-expire-date-month"),"02");
       methods.waitBySeconds(2);
       methods.selectByText(By.cssSelector("select#credit-card-expire-date-year"),"2022");
       methods.waitBySeconds(2);
       methods.sendKeys(By.id("credit-card-security-code"),"123"); //Cvv
       methods.waitBySeconds(2);
      methods.click(By.id("button-checkout-continue"));
      methods.waitBySeconds(2);




}


}
