package com.testinium.methods;


import com.testinium.driver.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;


public class Methods {

    WebDriver driver;  //global bir driver tanımladık
    FluentWait<WebDriver> wait;  //ekranda beklesin diye
    JavascriptExecutor jsdriver; //javascript için scrollda


    public Methods(){
        driver = BaseTest.driver;
        wait = new FluentWait<WebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(30))  //wait maksimum ne kadar sürede arasın 30 sn
                .pollingEvery(Duration.ofMillis(300)) //polling: ne kadar sürede bir arasın 300ms
                .ignoring(NoSuchElementException.class); //neleri ignore etsin
        jsdriver=(JavascriptExecutor) driver;
    }

    public WebElement findElement(By by){  //Web elementi döndürecek void demedik
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
        //until: ne zamana kadar  Aradığımız elementi bulana kadar
    }


    public void click(By by){   //find elementi ile bulduklarımızı click ile kullanabildik
        findElement(by).click();

    }

    public void waitBySeconds(long seconds){  //Wait metodu yazdık beklemek için
        try{
            Thread.sleep(seconds*1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }



    public boolean isElementVisible(By by){  //elementin olup olmadığını kontrol edicez.
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        }catch (Exception e){
            return false;
        }

    }

    public void sendKeys (By by, String text){ //önce bir alanı locator ile bulmalı sonra birsey yazdırmalıyız
        findElement(by).sendKeys(text);
    }


    public void scrollWithAction(By by){  //javascript kulanmadan scroll
        Actions actions =new Actions(driver);  //mause klavyenın yaptıgı işlemleri yapıyor
        actions.moveToElement(findElement(by)).build().perform();
    }

   /* public void scrollWithJavaScript(By by){  //javascript kullandık scroll için
        jsdriver.executeScript("arguments[0].scrollIntoView();",findElement(by));

    }
    */

    public Select getSelect(By by){
        return new Select(findElement(by));

    }

    public void selectByText(By by,String text){ //hangi elemente ne yazdıracak
        getSelect(by).selectByVisibleText(text);

    }

    public String getAttribute(By by, String attributeName){
        return findElement(by).getAttribute(attributeName);
    }

    public String getText(By by){
        return findElement(by).getText();
    }


    public List<WebElement> findAll(By by){ //Liste olusturduk

        return driver.findElements(by);
}

    public void randomSelect(By by){ //Random seçim
        Random random= new Random();
        findAll(by).get(random.nextInt(findAll(by).size())).click();


    }

    public void hover(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).perform(); // üstüne gelince işlemi yaptır
    }

    public void selectProduct(By by, int index){

        findAll(by).get(index).click();
    }

    public void favouriteDelete() { // favorilerden ürün silmek
        driver.findElement(By.xpath("//div[@class='hover-menu']/a[3]")).click();
    }

    public void reset(By by){  //sıfırla
        findElement(by).clear();
    }




}