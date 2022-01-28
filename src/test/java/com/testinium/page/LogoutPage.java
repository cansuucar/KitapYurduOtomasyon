package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;

public class LogoutPage {

    Methods methods;

    public LogoutPage() {

        methods = new Methods();
    }

    public void logOut(){

        methods.click(By.xpath("//a[@href='https://www.kitapyurdu.com/']"));
        methods.waitBySeconds(3);

        methods.hover(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/account']")); //kullanıcı
        methods.waitBySeconds(2);

        methods.click(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/logout']"));
        methods.waitBySeconds(3); //çıkış yap

    }
}
