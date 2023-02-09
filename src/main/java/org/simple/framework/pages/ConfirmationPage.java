package org.simple.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {

    /**
     * Wait for the new page to load and the alert banner is visible
     * @param driver
     */
    public void waitForAlertBanner(WebDriver driver) {
        // Create a WebDriverWait object
        // Wait for the new page to load
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert-success"))));
    }

}
