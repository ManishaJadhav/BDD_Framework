package stepDefinition;

import pages.BaseClass;
import utility.Utils;
import org.openqa.selenium.WebDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Actions.Send_Mail;
import Actions.SignIn_Action;
 
public class login {
	static WebDriver driver;

	public void start()  {
		
	driver = Utils.OpenBrowser();
			new BaseClass(driver);  
			
	        }
	
	@Given("^user navigates to \"([^\"]*)\"$")
	
	public void user_navigates_to(String arg1) throws Throwable {
		start();
		driver.get(arg1);
		driver.manage().window().maximize();

	}

	@When("^user enter in using Username as \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_enter_in_using_Username_as_and_Password(String arg1, String arg2) throws Throwable {
		SignIn_Action.Execute(arg1, arg2);
	  
	}
	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
	 driver.quit();
	
	}

	 
}