package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCase2 extends ChromeClass {
	
	 //chrome
	
	@Given("user is on the facebook Login Page")
	public void user_is_on_the_facebook_login_page() {
		
		  driver.get("https://www.facebook.com/login/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	}

	@When("user enter username {string}")
	public void user_enter_username(String uname) {
		driver.findElement(By.id("email")).sendKeys(uname);
	    
	}

	@When("enter password {string}")
	public void enter_password(String pwd ) {
	    driver.findElement(By.id("pass")).sendKeys(pwd);

		
	    
	}

	@And("click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.name("login")).click();
	    
	    
	}
	

	




}
