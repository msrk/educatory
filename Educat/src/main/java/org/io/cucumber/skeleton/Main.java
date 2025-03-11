package org.io.cucumber.skeleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static WebDriver webDriverInstance;
    public WebDriver test(  ) {
       // System.setProperty("webdriver.chrome.driver", "/Users/mohamedelkomy/Desktop/untitled folder 3/selenium-chrome-driver-4.29.0.jar");
        webDriverInstance = new ChromeDriver();
        return webDriverInstance;
    }
}
