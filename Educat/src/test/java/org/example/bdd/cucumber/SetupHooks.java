package org.example.bdd.cucumber;

import cucumber.api.java.Before;
import org.example.bdd.pages.SearchPage;

public class SetupHooks {
    public SetupHooks() {

    }
    private static boolean executed = false;
    private SearchPage searchPage;



//    private static CustomWebDriver globalDriver;

    public SetupHooks(SearchPage searchPage) {
        this.searchPage = new SearchPage();

    }


    @Before(order = 0)
    public void start() {
        this.searchPage = new SearchPage();

    }
}
