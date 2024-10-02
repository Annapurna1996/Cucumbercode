package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test3 extends ChromeClass {
	@When("open amazon application")
	public void open_amazon_application() {
		driver.get("https://www.amazon.in/");
	    
	}
	
	@Then("close browser")
	public void close_browser() {
	    driver.close();
	}
	

}
