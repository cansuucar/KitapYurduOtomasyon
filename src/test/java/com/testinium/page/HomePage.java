package com.testinium.page;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage   {


    Methods methods;
    public HomePage(){

        methods = new Methods();  //Method içindekileri kullanılabilir hale getirdik

    }

    public void home(){
        methods.waitBySeconds(5);


    }

}