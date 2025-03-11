package org.example.bdd.cucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TaggedHooks {
    public TaggedHooks() {

    }

    @Before(value = { "@tag" }, order = 1)
    public void beforeTag() { }

    @After(value = { "@tag" }, order = 1)
    public void afterTag() { }
}
