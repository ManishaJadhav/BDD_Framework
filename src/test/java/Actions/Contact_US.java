package Actions;
import org.testng.Reporter;

import pages.Contactus_Page;
import utility.Constant;
import utility.ExcelUtils;

     
    // This is called Modularization, when we club series of actions in to one Module
	// For Modular Driven Framework, please see http://www.toolsqa.com/modular-driven/   
    public class Contact_US {
    	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
    	// iTestcaseRow is passed as an Argument to this method, so that it can used inside this method
    	// For use of Functions & Parameters, please see http://www.toolsqa.com/function-parameters/
      

		public static void Execute() throws Exception {
			Contactus_Page.lnk_contact().click();
	    	
    		Thread.sleep(3000);
    		
    		String ActualPage_title = Contactus_Page.pagetitle();
    		String EcpectedPage_title = "http://egifts.atlantickw.com/contact-us";
    		if(ActualPage_title.equals(EcpectedPage_title))
    		{
    			ExcelUtils.Write(Constant.Contact_us,"Pass","Contact us page displayed sucessfully");
    			//ExcelUtils.getCellData(1, 1);
    		}
    		else
    		{
    				ExcelUtils.Write(Constant.Contact_us,"Fail","Contact us page is not displayed");
    			//	ExcelUtils.getCellData(1, 1);
    		}
    			
            Reporter.log("SignIn Action is successfully perfomred");
            
			
		}
               }
 
