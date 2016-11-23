package stepDefinition;

import pages.BaseClass;
import utility.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Actions.Contact_US;
import Actions.Send_Mail;
import Actions.SignIn_Action;
import Actions.htmlreport;
 
public class Contact_us {
	static WebDriver driver;

	public void start()  {
		
	driver = Utils.OpenBrowser();
			new BaseClass(driver);  
			
	        }
	
	@Given("^user navigates to main \"([^\"]*)\"$")
	
	public void user_navigates_to(String arg1) throws Throwable {
		start();
		driver.get(arg1);
		driver.manage().window().maximize();

	}

	@When("^Click on logout$")
	public void click_on_logout() throws Throwable {
		Contact_US.Execute();
	
	}
	
	@Then("^contact_us should be successful$")
	public void contact_us_should_be_successful() throws Throwable {
		 driver.quit();
	 System.out.println("contact_us sucessfull");
	 Send_Mail.sendmail();   
	 htmlreport.html();
	}
	 
}