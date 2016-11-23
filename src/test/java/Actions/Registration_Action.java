package Actions;
import org.testng.Reporter;


import pages.LogIn_Page;
import pages.Registration_Page;
import utility.Constant;
import utility.ExcelUtils;

     
    // This is called Modularization, when we club series of actions in to one Module
	// For Modular Driven Framework, please see http://www.toolsqa.com/modular-driven/   
    public class Registration_Action {
    	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
    	// iTestcaseRow is passed as an Argument to this method, so that it can used inside this method
    	// For use of Functions & Parameters, please see http://www.toolsqa.com/function-parameters/
        public static void Execute(String arg1, String arg2,  String arg3, String arg4, String arg5,  String arg6 ) throws Exception{
        
        	Registration_Page.txtbx_FristName().sendKeys(arg1);
    		Registration_Page.txtbx_LastName().sendKeys(arg2);
    		Registration_Page.txtbx_Mobile_Number().sendKeys(arg3);
    		Registration_Page.txtbx_Email().sendKeys(arg4);
    		Registration_Page.txtbx_Password().sendKeys(arg5);
    		Registration_Page.txtbx_ConfirmPassword().sendKeys(arg6);
    		Registration_Page.btn_submit().click();
    		Thread.sleep(1000);
    		String ActualPage_title = Registration_Page.pagetitle();
    		String EcpectedPage_title = "http://egifts.atlantickw.com/index.php/my-account";
    		String sucess_message = Registration_Page.Sucess_message().getText();
    		
    		if(ActualPage_title.equals(EcpectedPage_title))
    		{
    			ExcelUtils.Write(Constant.Registration,"Pass",sucess_message);
    			//ExcelUtils.getCellData(1, 1);
    		}
    		
    		else
    		{
    				ExcelUtils.Write(Constant.Registration,"Fail","Registration unsucessfully");
    			//	ExcelUtils.getCellData(1, 1);
    		}
    			
            Reporter.log("Registration Action is successfully perfomred");
            
        }
               }
 
