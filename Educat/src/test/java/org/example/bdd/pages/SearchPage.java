package org.example.bdd.pages;

import org.openqa.selenium.WebDriver;

import static org.example.bdd.cucumber.ScenarioHooks.webDriverInstance;

public class SearchPage {
    WebDriver driver ;
    public SearchPage(){
        setDriver( webDriverInstance);
    }
    public void setDriver(WebDriver driver){
        this.driver=driver;
    }

    public void gotoSearch(){
        webDriverInstance.get("https://www.educatly.com/");
    }
}
