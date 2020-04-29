package com.demo.xcart.cucumber;

import com.cucumber.listener.Reporter;
import com.demo.xcart.basepage.BasePage;
import com.demo.xcart.browserselector.BrowserSelector;
import com.demo.xcart.loadproperty.LoadProperty;
import com.demo.xcart.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hook extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseUrl = new LoadProperty().getProperty("baseUrl");
    String browser = new LoadProperty().getProperty("browser");

    @Before
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        Reporter.assignAuthor("Harrow Group", "Jitendra Patel");
    }

    @After
    public void closeBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotpath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenshotpath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        driver.quit();
    }
}
