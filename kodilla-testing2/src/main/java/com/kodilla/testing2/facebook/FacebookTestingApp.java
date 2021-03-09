package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookTestingApp {

    public static final String ACCEPT_COOKIES = "//button[contains(@title, \"Akceptuj wszystkie\")]";
    public static final String CREATE_NEW_ACCOUNT = "//*[contains(@id, \"u_0_2\")]";
    public static final String DAY = "//*[@id=\"day\"]";
    public static final String MONTH = "//*[@id=\"month\"]";
    public static final String YEAR = "//*[@id=\"year\"]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");

        WebElement button = driver.findElement(By.xpath(ACCEPT_COOKIES));
        button.click();

        button = driver.findElement(By.xpath(CREATE_NEW_ACCOUNT));
        button.click();

        WebElement selectCombo = driver.findElement(By.xpath(DAY));
        Select selectComboDay = new Select(selectCombo);
        selectComboDay.selectByIndex(5);

        selectCombo = driver.findElement(By.xpath(MONTH));
        Select selectComboMonth = new Select(selectCombo);
        selectComboMonth.selectByIndex(5);

        selectCombo = driver.findElement(By.xpath(YEAR));
        Select selectComboYear = new Select(selectCombo);
        selectComboYear.selectByValue("1945");
    }
}
