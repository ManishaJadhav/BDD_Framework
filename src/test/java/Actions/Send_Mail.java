package Actions;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import utility.Constant;
import utility.ExcelUtils;

     
    // This is called Modularization, when we club series of actions in to one Module
	// For Modular Driven Framework, please see http://www.toolsqa.com/modular-driven/   
    public class Send_Mail {
    	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
    	// iTestcaseRow is passed as an Argument to this method, so that it can used inside this method
    	// For use of Functions & Parameters, please see http://www.toolsqa.com/function-parameters/
    	 public static void sendmail() throws Exception
  	   {

  	      // Recipient's email ID needs to be mentioned.
  	      String to = ExcelUtils.getCellData(Constant.iTestCaseRow,Constant.to);
  	      final String username = ExcelUtils.getCellData(Constant.iTestCaseRow,Constant.username);
  	      final String password = ExcelUtils.getCellData(Constant.iTestCaseRow,Constant.password);
  	      		

  	      Properties props = new Properties();
  	      	    
  	    
  	      props.put("mail.smtp.auth", "true");
  	      props.put("mail.smtp.starttls.enable", "true");
  	      props.put("mail.smtp.host", "smtp.gmail.com");
  	      props.put("mail.smtp.port", "587");
  	      final   Authenticator auth = new Authenticator() {
                //override the getPasswordAuthentication method
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            };
  	      Session session = Session.getInstance(props, auth);
  	     

  	      try{
  	         // Create a default MimeMessage object.
  	         MimeMessage message = new MimeMessage(session);
  	         // Set From: header field of the header.
  	         message.setFrom(new InternetAddress(username));
  	         // Set To: header field of the header.
  	         message.addRecipient(Message.RecipientType.TO,
  	                                  new InternetAddress(to));

  	         // Set Subject: header field
  	         message.setSubject(ExcelUtils.getCellData(Constant.iTestCaseRow,Constant.subject));

  	         // Create the message part 
  	         BodyPart messageBodyPart = new MimeBodyPart();

  	         // Fill the message
  	         messageBodyPart.setText("Below is the Test Report \n\n Regards, \n\n Manisha");

  	         // Create a multipar message
  	         Multipart multipart = new MimeMultipart();

  	         // Set text message part
  	         multipart.addBodyPart(messageBodyPart);

  	         // Part two is attachment
  	         messageBodyPart = new MimeBodyPart();
  	         String filename = "D:\\final_framework\\index.html";
  	         DataSource source = new FileDataSource(filename);
  	         messageBodyPart.setDataHandler(new DataHandler(source));
  	         messageBodyPart.setFileName(filename);
  	         multipart.addBodyPart(messageBodyPart);
  	        // addAttachment(multipart, "E:\\Workspace\\final_framework\\index.html");
  	         // Send the complete message parts
  	         message.setContent(multipart );

  	         Transport.send(message);
  	         //System.out.println("Sent message successfully....");
  	      }catch (MessagingException mex) {
  	         mex.printStackTrace();
  	      }
  	   }
  	   
  	   @SuppressWarnings("unused")
	private static void addAttachment(Multipart multipart, String filename) throws MessagingException
  	   {
  	       DataSource source = new FileDataSource(filename);
  	       BodyPart messageBodyPart = new MimeBodyPart();        
  	       messageBodyPart.setDataHandler(new DataHandler(source));
  	       messageBodyPart.setFileName(filename);
  	       multipart.addBodyPart(messageBodyPart);
  	   }
               }
 
