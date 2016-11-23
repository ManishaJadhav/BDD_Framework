package stepDefinition;

import pages.BaseClass;
import pages.Registration_Page;
import utility.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Actions.Registration_Action;
import Actions.Send_Mail;
import Actions.SignIn_Action;
 
public class Registration {
	static WebDriver driver;

	public void start()  {
		
	driver = Utils.OpenBrowser();
			new BaseClass(driver);  
			
	        }
	

	@Given("^user navigates to Registration URL \"([^\"]*)\"$")
	public void user_navigates_to_Registration_URL(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		start();
	 driver.get(arg1);
	    

	}

	@When("^user enter valid data as firstname as \"([^\"]*)\", Lastname as \"([^\"]*)\", Mobilenumber as \"([^\"]*)\",Email as \"([^\"]*)\", Password \"([^\"]*)\" and ConfirmPassword \"([^\"]*)\"$")
	public void user_enter_valid_data_as_firstname_as_Lastname_as_Mobilenumber_as_Email_as_Password_and_ConfirmPassword(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
		Registration_Action.Execute(arg1, arg2, arg3, arg4, arg5, arg6);
		
	}

	@Then("^Registration should be successful$")
	public void Registration_should_be_successful() throws Throwable {
	 driver.quit();
	
	}

	 
}