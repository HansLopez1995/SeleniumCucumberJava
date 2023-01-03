package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.TestSandbox;

public class TestSandboxSteps {
    TestSandbox sandboxPage = new TestSandbox();

    @Given("^I navigate to the sandbox page$")
    public void navigateToTheSandbox(){
        sandboxPage.navigateToSandbox();
    }

    @And("^select a value from the dropdown$")
    public void SelectState(){
        sandboxPage.selectCategory("Haryana");
    }
}