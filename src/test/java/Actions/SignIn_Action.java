package Actions;
import org.testng.Reporter;


import pages.LogIn_Page;
import utility.Constant;
import utility.ExcelUtils;

     
    // This is called Modularization, when we club series of actions in to one Module
	// For Modular Driven Framework, please see http://www.toolsqa.com/modular-driven/   
    public class SignIn_Action {
    	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
    	// iTestcaseRow is passed as an Argument to this method, so that it can used inside this method
    	// For use of Functions & Parameters, please see http://www.toolsqa.com/function-parameters/
        public static void Execute(String arg1, String arg2) throws Exception{
        
        	LogIn_Page.txtbx_UserName().sendKeys(arg1);	
    		
    		LogIn_Page.txtbx_Password().sendKeys(arg2);
    		Thread.sleep(3000);
    		
    		LogIn_Page.btn_LogIn().click();
    	
    		Thread.sleep(3000);
    		
    		String ActualPage_title = LogIn_Page.pagetitle();
    		String EcpectedPage_title = "http://egifts.atlantickw.com/";
    		if(ActualPage_title.equals(EcpectedPage_title))
    		{
    			ExcelUtils.Write(Constant.login,"Pass","Login sucessfully");
    			//ExcelUtils.getCellData(1, 1);
    		}
    		else
    		{
    				ExcelUtils.Write(Constant.login,"Fail","Login unsucessfully");
    			//	ExcelUtils.getCellData(1, 1);
    		}
    			
            Reporter.log("SignIn Action is successfully perfomred");
            
        }
               }
 
