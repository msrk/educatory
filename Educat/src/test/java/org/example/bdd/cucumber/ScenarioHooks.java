package org.example.bdd.cucumber;

import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class ScenarioHooks {
    public static WebDriver webDriverInstance;

    private static final long NANO_TO_SECONDS = 1000000000;

    private long timeExecutingTask = 0;


    public ScenarioHooks() {

    }

    @Before(order = 1)
    public void createWebDriver() throws MalformedURLException {


        System.setProperty("webdriver.chrome.driver", "/Users/mohamedelkomy/Desktop/chromedriver_mac64/chromedriver");
        webDriverInstance = new ChromeDriver();






    }





}
