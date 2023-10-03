package pages;

import base.DriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HomePage extends DriverInstance {

    private static String CompletedWebFormLink = "(//a[contains(text(),'Complete')])[2]";

    public static void userClickOnTheCompletedWebFormLink() {
        WebElement element = driver.findElement(By.xpath(CompletedWebFormLink));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }
}
