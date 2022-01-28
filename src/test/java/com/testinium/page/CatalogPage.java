package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;

public class CatalogPage {

    Methods methods;

    public CatalogPage(){

        methods = new Methods();

    }

    public void catalog(){

        //anasayfaya gider
        methods.click(By.xpath("//div[@class='logo-text']"));
        methods.waitBySeconds(3);
        //puan kataloguna gidilir
        methods.click(By.xpath("//div[@class='lvl1catalog']"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.cssSelector(".heading-links"));
        methods.waitBySeconds(3);
        //türk klasikleri locator
        methods.click(By.cssSelector("[src='https://img.kitapyurdu.com/v1/getImage/fn:4359433/wh:14a4e2d16']"));
        methods.waitBySeconds(3);

        methods.selectByText(By.cssSelector("[onchange='location = this.value;']"), "Yüksek Oylama");
        methods.waitBySeconds(3); //select işleminin locatorı




    }






}
