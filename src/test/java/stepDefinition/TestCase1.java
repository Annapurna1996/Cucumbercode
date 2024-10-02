package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCase1 extends ChromeClass {
	
	@Given("open browser")
	public void open_browser() {
	    
	    driver.manage().window().maximize();
	}

	@When("open orangeHrm application")
	public void open_orange_hrm_application() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
		
	    
	}

	@When("Login to the application")
	public void login_to_the_application() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	    
	}

	@When("click on admin")
	public void click_on_admin() {
	   driver.findElement(By.xpath("//span[text()='Admin']")).click();
	   driver.navigate().back();
	}

	@Then("close the browser")
	public void close_the_browser() {
		
		driver.close();
	    
	}




}
