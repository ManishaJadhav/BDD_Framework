package pages;
        import org.openqa.selenium.*;


    public class Registration_Page extends BaseClass {
           private static WebElement element = null;
        
        public Registration_Page(WebDriver driver){
            	super(driver);
        }     
        public static WebElement txtbx_FristName() throws Exception{
        	try{
        		
      	      element =  driver.findElement(By.name("fname"));

        	}catch (Exception e){
         
           		throw(e);
           		}
           	return element;
            }
        
        public static WebElement txtbx_LastName() throws Exception{
        	try{
        		
      	      element =  driver.findElement(By.name("lname"));

        	}catch (Exception e){
         
           		throw(e);
           		}
           	return element;
            }
        public static WebElement txtbx_Mobile_Number() throws Exception{
        	try{
        		
      	      element = driver.findElement(By.name("mobile"));

        	}catch (Exception e){
         
           		throw(e);
           		}
           	return element;
            }
        
        public static WebElement txtbx_Email() throws Exception{
        	try{
        		
      	      element = driver.findElement(By.name("email"));

        	}catch (Exception e){
         
           		throw(e);
           		}
           	return element;
            }
        
        public static WebElement txtbx_Password() throws Exception{
        	try{
	        	element = driver.findElement(By.name("password1"));

        	}catch (Exception e){
        		
           		throw(e);
           		}
           	return element;
        }
        
        public static WebElement txtbx_ConfirmPassword() throws Exception{
        	try{
	        	element =  driver.findElement(By.name("password2"));

        	}catch (Exception e){
        		
           		throw(e);
           		}
           	return element;
        }
        
        public static WebElement btn_submit() throws Exception{
        	try{

	        	element = driver.findElement(By.id("submit"));

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
        
        public static WebElement Sucess_message() throws Exception{
        
        	try{
        		
        		element = driver.findElement(By.className("lead"));

        	}catch (Exception e){
        		
           		throw(e);
           		}
           	return element;
        }
    }
