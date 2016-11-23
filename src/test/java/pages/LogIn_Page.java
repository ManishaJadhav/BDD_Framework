package pages;
        import org.openqa.selenium.*;


    public class LogIn_Page extends BaseClass {
           private static WebElement element = null;
        
        public LogIn_Page(WebDriver driver){
            	super(driver);
        }     
        public static WebElement txtbx_UserName() throws Exception{
        	try{
        		
      	      element = driver.findElement(By.name("email"));

        	}catch (Exception e){
         
           		throw(e);
           		}
           	return element;
            }
        
        public static WebElement txtbx_Password() throws Exception{
        	try{
	        	element = driver.findElement(By.name("password"));

        	}catch (Exception e){
        		
           		throw(e);
           		}
           	return element;
        }
        
        public static WebElement btn_LogIn() throws Exception{
        	try{

	        	element = driver.findElement(By.xpath("//*[@id='page']/div[2]/div[3]/div[2]/div/form/div[2]/div[3]/button"));

        	}catch (Exception e){
        		//Log.error("Submit button is not found on the Login Page");
           		throw(e);
           		}
           	return element;
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
    }
