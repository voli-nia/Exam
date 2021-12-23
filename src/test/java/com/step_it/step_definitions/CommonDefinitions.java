package com.step_it.step_definitions;

import com.step_it.steps.CommonSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CommonDefinitions {
    private CommonSteps commonSteps;

    @Given("the user is on main page")
    public void theUserIsOnMainPage() {
        commonSteps.checkPageIsDisplayed();
    }

    @When("the user clicks on language button")
    public void theUserClicksOnLanguageButton() {
        commonSteps.languageBtn();
    }

    @Then("the language is changed")
    public void theLanguageIsChanged() {
        commonSteps.checkLanguageIsChanged();
    }
}
