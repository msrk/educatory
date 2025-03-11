package io.cucumber.skeleton;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    SearchPage searchPage = new SearchPage();


    @Given("^we open educatly page$")
    public void weOpenEducatlyPage() {
        searchPage.gotoSearch();
    }

    @When("^search using study$")
    public void searchUsingStudy() {
        searchPage.searchStudy();
    }

    @Then("^I find the search results$")
    public void iFindTheSearchResults() {
        searchPage.verifySearchResults();

    }
}