package com.testinium.driver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

//Driveri ayağa kaldıracağımız class
public class BaseTest {

    public static WebDriver driver; //Driver tanımladık

    @Before //test run edildiğinde ilk buraya gelir ve ilk burayı çalıştırır
    public void setUp(){  //Driveri ayağa kaldırıyoruz
        //chromedriver-copy path dedik
        System.setProperty("webdriver.chrome.driver" ,"src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions= new ChromeOptions(); //Chrome üzerinde yapacağımız işlemlerle ilgili özellikler
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-gpu ");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("disable-infobars");
        chromeOptions.addArguments("disable-plugins");
        chromeOptions.addArguments("disable-popup-blocking");
        chromeOptions.addArguments("ignore-certificate-errors");
        chromeOptions.addArguments("disable-translate");
        chromeOptions.addArguments("disable-extensions");

        DesiredCapabilities desiredCapabilities= new DesiredCapabilities();
        chromeOptions.merge(desiredCapabilities);

        //Mor renk globale karsılık gelir
        driver= new ChromeDriver(chromeOptions);
        driver.manage().window().maximize(); //Tarayıcı ayaga kalktıgında tam ekran acılsın dedik

        driver.get("https://www.kitapyurdu.com/");  //Driverin gideceği url

    }

    @After   //Test sonlandıktan sonra bu kısma gelir
    public void tearDown(){
        if(driver  != null) {  //driver null mu
            driver.close(); // sekmeyi kapatır
            driver.quit();  // tarayıcıdan cıkar
        }
    }

}

