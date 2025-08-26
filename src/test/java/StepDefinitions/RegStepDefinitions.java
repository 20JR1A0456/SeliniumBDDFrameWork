package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.Registration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class RegStepDefinitions {
	WebDriver driver = DriverFactory.getDriver();
	Registration rp = new Registration(driver);
	
	@Given("the user opens the Registration Form")
	public void the_user_opens_the_registration_form() throws InterruptedException {
	    driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	}

	@When("the user enters name {string}")
	public void the_user_enters_name(String name) throws InterruptedException {
		rp.entername(name);
		Thread.sleep(2000);
	    
	}

	@When("user enters email {string}")
	public void user_enters_email1(String email) throws InterruptedException {
		rp.enteremail(email);
		Thread.sleep(2000);
	    
	}

	@When("user selects Gender {string}")
	public void user_selects_gender(String male) throws InterruptedException {
		Thread.sleep(2000);
		rp.gender(male);
		Thread.sleep(2000);
	   
	}

	@When("user enters Mobile Number {string}")
	public void user_enters_mobile_number(String mobile ) throws InterruptedException{
		rp.mobile(mobile);
		Thread.sleep(2000);
	  
	}

	@When("user selects Date of Birth {string}")
	public void user_selects_date_of_birth(String dob) throws InterruptedException {
		rp.dob(dob);
		Thread.sleep(2000);
		
	   
	}

	@When("user enters Subjects {string}")
	public void user_enters_subjects(String subjects) throws InterruptedException {
		rp.subjects(subjects);
		Thread.sleep(2000);
	   
	}

	@When("user selects Hobbies {string}")
	public void user_selects_hobbies(String hobbies) throws InterruptedException {
		rp.hobbies(hobbies);
		Thread.sleep(2000);
		
	    
	}

	@When("user uploads Picture {string}")
	public void user_uploads_picture(String filepath) throws InterruptedException {
		rp.picture(filepath);
		Thread.sleep(2000);
		
		
	    
	}

	@When("user enters Current Address {string}")
	public void user_enters_current_address(String adresses) throws InterruptedException {
		rp.cuaddr(adresses);
		Thread.sleep(2000);
	  
	}

	@When("user selects State {string} and City {string}")
	public void user_selects_state_and_city(String state, String city) throws InterruptedException {
		rp.selectStateAndCity(state, city);
		Thread.sleep(2000);

	    
	}

	@When("user clicks on Submit button")
	public void user_clicks_on_submit_button() throws InterruptedException {
		Thread.sleep(2000);
		rp.submit();
	   
	}

	@Then("registration form should be submitted successfully")
	public void registration_form_should_be_submitted_successfully() {
		Assert.assertTrue(driver.getPageSource().contains("Thanks for submitting the form"));
	    
	}

	@When("the user leaves Name empty")
	public void the_user_leaves_name_empty() {
	   
	}

	@When("user enters Email {string}")
	public void user_enters_email(String string) {
	    
	}

	@Then("an error message should be displayed for mandatory fields")
	public void an_error_message_should_be_displayed_for_mandatory_fields() {
		Assert.assertTrue(driver.getPageSource().contains("Please fill out this field"));
	}

}
