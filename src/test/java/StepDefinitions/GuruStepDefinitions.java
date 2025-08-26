package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Pages.Demo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class GuruStepDefinitions {
	WebDriver driver = DriverFactory.getDriver();
	Demo d = new Demo(driver);
	
	@Given("the user opens the information page")
	public void the_user_opens_the_information_page() throws InterruptedException {
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    
	}

	@When("the user enters First Name {string} and Last Name {string}")
	public void the_user_enters_first_name_and_last_name(String firstname, String lastname) throws InterruptedException {
		d.first(firstname);
		Thread.sleep(2000);
		d.last(lastname);
		Thread.sleep(2000);
		
	  
	}

	@When("user enters Phone {string}")
	public void user_enters_phone(String phone) throws InterruptedException {
		d.phone(phone);
		Thread.sleep(2000);
	    
	}

	@When("user enters Address {string}")
	public void user_enters_address(String adress) throws InterruptedException {
		d.address(adress);
		Thread.sleep(2000);
	   
	}

	@When("user enters City {string}")
	public void user_enters_city(String city) throws InterruptedException {
		d.city(city);
		Thread.sleep(2000);
	    
	}

	@When("user enters State {string}")
	public void user_enters_state(String State) {
		d.state(State);
	    
	}

	@When("user enters Postal Code {string}")
	public void user_enters_postal_code(String Postal) {
		d.postal(Postal);
	}
	    
	

	@When("user selects Country {string}")
	public void user_selects_country(String country) {
		d.County(country);
	}
	    
	

	@When("user enters Username {string}")
	public void user_enters_username(String Username) {
		d.Username(Username);
	    
	}

	@When("user enters Password {string}")
	public void user_enters_password(String Pass) {
		d.password(Pass);
	}
	    
	

	@When("user confirms Password {string}")
	public void user_confirms_password(String confirm) {
		d.confirm(confirm);
	}
	
	   
	

	@When("user clicks on Register button")
	public void user_clicks_on_register_button() {
		
	}
	   
	

	@Then("registration should be successful")
	public void registration_should_be_successful() {
	   
	}


}
