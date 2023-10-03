package pages;

import base.DriverInstance;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FormPage extends DriverInstance {

    private static String firstNameField = "first-name" ;
    private static String lastNameField = "last-name";
    private static String jobTitleField = "job-title";
    private static String leveEducationRadio = "radio-button-3";
    private static String maleGenderCheckbox = "checkbox-1";
    private static String submitButton = "//*[text()='Submit']";
    private static String successAlert = ".alert-success";


    public static void userFillFirstNameWith(String first_name) {
        driver.findElement(By.id(firstNameField)).sendKeys(first_name);
    }

    public static void userFillLastNameWith(String last_name) {
        driver.findElement(By.id(lastNameField)).sendKeys(last_name);
    }

    public static void userFillJobTitleWith(String job_title) {
        driver.findElement(By.id(jobTitleField)).sendKeys(job_title);
    }

    public static void userClickLevelEducation() {
        driver.findElement(By.id(leveEducationRadio)).click();
    }

    public static void userClickMaleGender() {
        driver.findElement(By.id(maleGenderCheckbox)).click();
    }

    public static void userClickSubmitButton() {
        driver.findElement(By.xpath(submitButton)).click();
    }

    public static void userVerifyTheFormWasSuccessfullySubmitted() {
        WebElement element = driver.findElement(By.cssSelector(successAlert));
        wait.until(ExpectedConditions.visibilityOf(element));
        String textElement = driver.findElement(By.cssSelector(successAlert)).getText();
        Assert.assertEquals("The form was successfully submitted!",textElement);
    }

}
