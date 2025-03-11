package org.example.bdd.runner;

import cucumber.api.cli.Main;
import org.junit.Test;

public class CLIRunner {
    @Test
    public void test() throws Throwable {
        Main.main(new String[]{


                "-g", "org/example/bdd/cucumber",
                "-t", "@all",
                "src/test/resources"
        });
    }
}
