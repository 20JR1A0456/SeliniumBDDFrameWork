package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	private WebDriver driver;
	//locators
	private By firstfield = By.xpath("//input[@name='firstName']");
	private By lastfield = By.xpath("//input[@name='lastName']");
	private By phonefield = By.xpath("//input[@name='phone']");
	private By emailfield = By.xpath("//input[@id='userName']");
	private By addfield = By.xpath("//input[@name='address1']");
	private By cityfield = By.xpath("//input[@name='city']");
	private By provfield = By.xpath("//input[@name='state']");
	private By postalfield = By.xpath("//input[@name='postalCode']");
	private By coufiled = By.xpath("//select[@name='country']");
	private By Username = By.xpath("//input[@id='email']");
	private By passfeild = By.xpath("//input[@name='password']");
	private By confirm = By.xpath("//input[@name='confirmPassword']");
	private By submit = By.xpath("//input[@name='submit']");
	 private By successText = By.xpath("//font[contains(text(),'Dear')]");
	
	public Demo(WebDriver driver) {
		this.driver = driver;
	}
	
	public void first(String firstname) {
		driver.findElement(firstfield).sendKeys(firstname);
	}
	public void last(String lastname) {
		driver.findElement(lastfield).sendKeys(lastname);
	}
	public void phone(String phone) {
		driver.findElement(phonefield).sendKeys(phone);
	}
	public void email(String email) {
		driver.findElement(emailfield).sendKeys(email);
	}
	public void address(String adress) {
		driver.findElement(addfield).sendKeys(adress);
	}
	public void city(String city ) {
		driver.findElement(cityfield).sendKeys(city);
		
	}
	public void state(String State) {
		driver.findElement(provfield).sendKeys(State);
	}
	public void postal(String Postal) {
		driver.findElement(postalfield).sendKeys(Postal);
		
	}
	public void County(String country) {
		  new Select(driver.findElement(coufiled)).selectByVisibleText(country);
	}
	public void Username(String username ) {
		driver.findElement(Username).sendKeys(username);
	}
	public void password(String pass) {
		driver.findElement(passfeild).sendKeys(pass);
	}
	public void confirm(String confirmpass) {
		driver.findElement(confirm).sendKeys(confirmpass);
	}
	public void submit() {
		driver.findElement(submit).click();
	}
	public boolean isRegistrationSuccessful() {
        return driver.findElement(successText).isDisplayed();
    }
		
	
	

}
