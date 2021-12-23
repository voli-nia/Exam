package com.step_it.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class LocalWebDriverManager {
    private static WebDriver driver = null;

    private LocalWebDriverManager() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            startDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        getDriver().quit();
        driver = null;
    }

    private static void startDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        EventFiringWebDriver driverWithEvents = new EventFiringWebDriver(driver);
        driver = driverWithEvents;
    }
}
