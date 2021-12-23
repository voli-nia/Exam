package com.step_it.steps;

import com.step_it.pages.MainPage;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

import static org.assertj.core.api.Assertions.assertThat;

@Log4j2
@AllArgsConstructor
public class CommonSteps {
    private MainPage mainPage;

    public void checkPageIsDisplayed() {
        mainPage.isTitleDisplayed();
    }

    public void languageBtn() {
        mainPage.changeLanguage();
    }

    private void checkLanguage(String assertionMessage) {
        assertThat(mainPage.isTitleDisplayed()).isTrue();
    }

    public void checkLanguageIsChanged() {
        log.info("Check language is set from EN to RU");
        checkLanguage("The language is not changed");
    }
}
