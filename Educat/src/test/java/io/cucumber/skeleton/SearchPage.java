package io.cucumber.skeleton;

import org.io.cucumber.skeleton.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.io.cucumber.skeleton.Main.webDriverInstance;


public class SearchPage {
    WebDriver driver ;
    public SearchPage(){
        Main main = new Main();
        webDriverInstance =main.test();

        setDriver( webDriverInstance);
    }
    public void setDriver(WebDriver driver){
        this.driver=driver;
    }

    public void gotoSearch(){
        webDriverInstance.get("https://www.educatly.com/");

    }

    public void searchStudy(){
        String search2 = "//div[contains(@class,'styles_header__start__search__inputs__')]/div";

        String search = "//div[contains(@class,'styles_header__start__search__inputs__')]/div/div//input[@type='search']";
        WaitFor(webDriverInstance, search2);

        webDriverInstance.findElement(By.xpath(search2)).click();
        webDriverInstance.findElement(By.xpath(search)).sendKeys("Arts");
        String Arts = "//div[@title='Arts']/div";
        WaitFor(webDriverInstance, Arts);
        webDriverInstance.findElement(By.xpath(Arts)).click();
        String clickSearch="//div[contains(@class,'styles_header__start__search__btn__Faur')]";
        webDriverInstance.findElement(By.xpath(clickSearch)).click();
    }



    public static void WaitFor(WebDriver driver,String xpath ){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(d -> d.findElement(By.xpath(xpath)).isEnabled());
    }

    public void verifySearchResults() {
        String results = "//div[contains(@class,'styles_criteriaCards__card')]/p";
        WaitFor(webDriverInstance, results);
        webDriverInstance.quit();
    }
}
