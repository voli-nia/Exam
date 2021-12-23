package com.step_it.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLoader {
    private static final int DRIVER_WAIT_TIME = 5;
    private final WebDriver driver;

    public PageLoader(WebDriver driver) {
        this.driver = driver;
    }

    public void isMainPageVisible() {
        try{
            getWait().until(ExpectedConditions.visibilityOfAllElements());
        } catch (WebDriverException e) {
            throw new WebDriverException("The main page is not loaded correctly: " + e.getMessage());
        }
    }

    private WebDriverWait getWait() {
        return new WebDriverWait(this.driver, DRIVER_WAIT_TIME);
    }

}
