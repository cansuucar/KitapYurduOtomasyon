package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;


public class LoginPage {


    Methods methods;
    //loglama için
    Logger logger = LogManager.getLogger(LoginPage.class);

    public LoginPage(){

        methods = new Methods();

    }

    public void login(){

        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        //kitapyurdu sitesindeki giriş yap kısmına tıkladık
        methods.waitBySeconds(2);
        //logine giriş yap sayfasını actık 2 sn bekledik
        //e posta sifre ve giriş yap dememiz gerek
        methods.sendKeys(By.id("login-email"),"cansuucar_@hotmail.com");  //email
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("login-password"),"Ucar1234"); //sifre
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        //class oldugu için aralara nokta koyduk
        methods.waitBySeconds(2);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='logo-icon']"))); //o sayfada mıyım

    }
   //log kontrolü yapılan yer
    public void textControlTest(){
        String text=methods.getText(By.cssSelector(".common-sprite"));
        //giriş yaptıktan sonra adın azdıgı kısımın locaterı
        System.out.println("Alınan Text: "+text);
        logger.info("Alınan Text: " + text);
        methods.waitBySeconds(3);
    }





}

