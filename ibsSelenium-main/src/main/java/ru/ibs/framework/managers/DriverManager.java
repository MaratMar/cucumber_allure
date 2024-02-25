package ru.ibs.framework.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.ibs.framework.enums.DriverEnums;


public class DriverManager {

    private WebDriver driver;

    private static DriverManager INSTANCE = null;

    private DriverManager() {
    }

    public static DriverManager getDriverManager() {
        if (INSTANCE == null) {
            INSTANCE = new DriverManager();
        }
        return INSTANCE;
    }

    public WebDriver getDriver() {
        if (driver == null) {
            initDriver();
        }
        return driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    private void initDriver() {
        System.setProperty("webdriver.chrome.driver", DriverEnums.CHROME.getValue());
        driver = new ChromeDriver();
    }

}
