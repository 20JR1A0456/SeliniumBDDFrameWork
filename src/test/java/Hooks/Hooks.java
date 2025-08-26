package Hooks;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.DriverFactory;

public class Hooks {
	// Inject WebDriver from DriverFactory
	 @Before
	 public void setUp() {
		 DriverFactory.getDriver();
		 System.out.println("Browser launched before scenario");
	 }
	 @After
	    public void tearDown(Scenario scenario) {
	        WebDriver driver = DriverFactory.getDriver();

	        if (driver != null && scenario.isFailed()) {
	            try {
	                // Attach screenshot to Extent report
	                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	                scenario.attach(screenshot, "image/png", "Failed Step Screenshot");

	                // Save screenshot file as well
	                File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	                String path = "target/screenshots/" + scenario.getName().replace(" ", "_") + ".png";
	                FileUtils.copyFile(srcFile, new File(path));
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
		 DriverFactory.quitDriver();
		 System.out.println("Browser closed after the scenario");



	 }





}
