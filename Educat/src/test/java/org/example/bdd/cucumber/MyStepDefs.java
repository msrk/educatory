package org.example.bdd.cucumber;

import cucumber.api.java.en.Given;
import org.example.bdd.pages.SearchPage;
import io.restassured.specification.RequestSpecification;

public class MyStepDefs {
    SearchPage searchPage = new SearchPage();
    RequestSpecification request;



    @Given("^we open educatly page$")
    public void goToVideo() {
        searchPage.gotoSearch();
    }
}
