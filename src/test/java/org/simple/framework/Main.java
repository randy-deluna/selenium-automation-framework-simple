package org.simple.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.simple.framework.pages.ConfirmationPage;
import org.simple.framework.pages.FormPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Apps\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Navigate to site
        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        formPage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);

        // Verify that the expected text is equal to the actual text on the new page
        assertEquals("The form was successfully submitted!", getAlertBannerText(driver));

        // Close the browser
        driver.quit();
    }

    /**
     * Get the alert banner text and then return it
     * @param driver
     * @return String - Alert banner text
     */
    public static String getAlertBannerText(WebDriver driver) {
        return driver.findElement(By.className("alert")).getText();
    }
}