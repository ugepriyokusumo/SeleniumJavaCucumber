package hooks;

import base.DriverInstance;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks extends DriverInstance {

    @Before
    public void beforeScenario(Scenario scenario){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://formy-project.herokuapp.com/");
        WebDriver.Options manage = driver.manage();
        manage.timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        manage.window().maximize();
        System.out.print(driver.getTitle());
    }

    @After
    public void afterScenario(Scenario scenario){
        boolean failed = scenario.isFailed();
        if (failed) {
          byte[] screenshotAs =  driver.getScreenshotAs(OutputType.BYTES);
          scenario.attach(screenshotAs, "image/png","failedScreenShot");
        }
        driver.quit();
    }

    @BeforeStep
    public void beforeStep(Scenario scenario){

    }

    @AfterStep
    public void afterStep(Scenario scenario){

    }

}
