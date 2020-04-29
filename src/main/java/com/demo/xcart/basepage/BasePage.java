package com.demo.xcart.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public static WebDriver driver;

    //Constructor
    public BasePage() {
        //This is for pagefactory
        PageFactory.initElements(driver, this);
        //this is for log4j
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/com/demostore/xcart/resources/properties/log4j.properties");
    }
}
