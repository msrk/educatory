package org.io.cucumber.skeleton;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static WebDriver webDriverInstance;
    public WebDriver test(  ) {
       // System.setProperty("webdriver.chrome.driver", "/Users/mohamedelkomy/Desktop/untitled folder 3/selenium-chrome-driver-4.29.0.jar");


        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
        //WebDriver driver = new ChromeDriver(chromeOptions);


//This waits up to 10 seconds before throwing a TimeoutException or if it finds the element will return it in 0 - 10 seconds
        WebDriverWait wait = new WebDriverWait(webDriverInstance, Duration.ofSeconds(10));

        webDriverInstance = new ChromeDriver(chromeOptions);
        return webDriverInstance;
    }
}
