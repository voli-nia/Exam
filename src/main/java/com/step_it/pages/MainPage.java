package com.step_it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    private MainPage mainPage;

    @FindBy(xpath = "//button[normalize-space()='en']")
    private WebElement langBtn;

    @FindBy(xpath = "//a[normalize-space()='ru']")
    private WebElement ruBtn;

    @FindBy(xpath = "//h1[@class='highlight-title']")
    private WebElement pageTitle;

    public boolean isTitleDisplayed() {
        return pageTitle.isDisplayed();
    }

    public void changeLanguage() {
        langBtn.click();
        ruBtn.click();
    }
}
