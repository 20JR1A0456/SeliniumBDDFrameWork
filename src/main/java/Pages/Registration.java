package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	private WebDriver driver;
	//locators
	private By namefield = By.xpath("//input[@id='name']");
	private By emailfield = By.xpath("//input[@id='email']");
	private By genderfield = By.xpath("//label[normalize-space()='Gender:']");
	private By genderMale = By.xpath("//label[normalize-space()='Male']");
    private By genderFemale = By.xpath("//label[normalize-space()='Female']");
    private By genderOther = By.xpath("//label[normalize-space()='Other']");
	private By mobilefield = By.xpath("//input[@id='mobile']");
	private By dobfield = By.xpath("//input[@id='dob']");
	private By subjectfield = By.xpath("//input[@id='subjects']");
	private By hobbiesclick = By.xpath("//label[normalize-space()='Hobbies:']");
	private By hobbiesfield = By.xpath("//label[normalize-space()='Sports']");
	private By pictfield = By.xpath("//input[@id='picture']");
	private By caddrfield = By.xpath("//textarea[@id='picture']");
	private By statedrdwn = By.xpath("//select[@id='state']");
	private By citydrwn = By.xpath("//select[@id='city']");
	private By submit = By.xpath("//input[@value='Login']");
	
	
	public Registration(WebDriver driver) {
		this.driver = driver;
	}
	//page actions
	//actions
	
	public void entername(String name) {
		driver.findElement(namefield).sendKeys(name);
		
	}
	public void enteremail(String email) {
		driver.findElement(emailfield).sendKeys(email);
		
		
	}
	public void gender(String gender) throws InterruptedException {
		driver.findElement(genderfield).click();
		Thread.sleep(2000);
		 if (gender.equalsIgnoreCase("Male")) {
	            driver.findElement(genderMale).click();
	            Thread.sleep(2000);
	        } else if (gender.equalsIgnoreCase("Female")) {
	            driver.findElement(genderFemale).click();
	            Thread.sleep(2000);
	        } else {
	            driver.findElement(genderOther).click();
	            Thread.sleep(2000);
	        }
		
	}
	public void mobile(String mobile) {
		driver.findElement(mobilefield).sendKeys(mobile);
		
	}
	public void dob(String dob) {
		driver.findElement(dobfield).sendKeys(dob);
	}
	public void subjects(String subjects) {
		driver.findElement(subjectfield).sendKeys(subjects);
	}
	public void hobbies(String hobbies) throws InterruptedException {
		driver.findElement(hobbiesclick).click();
		Thread.sleep(2000);
		if (hobbies.contains("Sports")) driver.findElement(hobbiesfield).click();
		Thread.sleep(2000);
        if (hobbies.contains("Music")) driver.findElement(hobbiesfield).click();
        Thread.sleep(2000);
	}
	public void picture(String filepath) {
		driver.findElement(pictfield).sendKeys(filepath);
	}
	public void cuaddr(String adresss) {
		driver.findElement(caddrfield).sendKeys(adresss);
	}
	 public void selectStateAndCity(String state, String city) {
	        new Select(driver.findElement(statedrdwn)).selectByVisibleText(state);
	        new Select(driver.findElement(citydrwn)).selectByVisibleText(city);
	    }
	 public void submit() {
		 driver.findElement(submit).click();
		 
	 }


}
