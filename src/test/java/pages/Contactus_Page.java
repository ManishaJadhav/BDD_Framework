package pages;
        import org.openqa.selenium.*;


    public class Contactus_Page extends BaseClass {
           private static WebElement element = null;
        
        public Contactus_Page(WebDriver driver){
            	super(driver);
        }     
           
        
        
      
        
        public static String pagetitle() throws Exception{
        	String Pagetitle;
        	try{
        		
        		Pagetitle = driver.getCurrentUrl();

        	}catch (Exception e){
        		
           		throw(e);
           		}
           	return Pagetitle;
        }
		public static WebElement lnk_contact() throws Exception {
			try{

	        	element = driver.findElement(By.linkText("CONTACT US"));

        	}catch (Exception e){
        		//Log.error("Submit button is not found on the Login Page");
           		throw(e);
           		}
           	return element;
		}
    }
