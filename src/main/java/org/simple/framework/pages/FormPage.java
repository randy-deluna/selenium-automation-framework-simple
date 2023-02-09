package org.simple.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FormPage {

    /**
     * Input values in all fields and then submit the form
     * @param driver
     */
    public void submitForm(WebDriver driver) {
        // Get first name web element and input first name; Using locator ID
        WebElement name = driver.findElement(By.id("first-name"));
        name.sendKeys("John");

        // Get last name web element and input last name
        driver.findElement(By.id("last-name")).sendKeys(("Smith"));

        // Get job title web element and input job title
        driver.findElement(By.id("job-title")).sendKeys(("QA Manager"));

        // Click "College" radio button
        driver.findElement(By.id("radio-button-2")).click();

        // Checkmark "Male" checkbox; Using locator cssSelector
        driver.findElement(By.cssSelector("input[value='checkbox-1']")).click();

        // Checkmark "Male" checkbox
        Select yearsOfExp = new Select(driver.findElement(By.id("select-menu")));
        yearsOfExp.selectByIndex(1);            // Selecting by Index
        yearsOfExp.selectByValue("2");          // Selecting by Value
        yearsOfExp.selectByVisibleText("5-9");  // Selecting by Text

        // Input a date
        driver.findElement(By.id("datepicker")).sendKeys("02/06/2023");

        // Get Submit button and then click it. Using locator linkText
        driver.findElement(By.linkText("Submit")).click();
    }

}
