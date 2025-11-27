package StepDefinitions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import configuration.Base;
import utility.ExcelDataUtility;
import utility.TestUtil;

public class Login extends Base{

	
	
    WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
    
    
    public void logintoliskart() throws Exception
    {
   	 driver.findElement(By.xpath(prop.getProperty("LoginLink"))).click();  // refer from global properties
   	 Thread.sleep(500);
   	 
   	 
   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

	WebElement productElement = wait.until(
	        ExpectedConditions.presenceOfElementLocated(
	                By.xpath(prop.getProperty("Welcome"))
	        )
	);
	System.out.println(productElement);

   	 driver.findElement(By.xpath(prop.getProperty("PhoneNumber"))).click();
   	 logger.info("Clicked to enter phone number");
   	 
   	 Thread.sleep(500);
    
   	 String path = System.getProperty("user.dir") + prop.getProperty("ExcelfilePath");  // refer from global properties
		ArrayList<HashMap<String, String>> data = ExcelDataUtility.storeExcelDataToHashMap(path,prop.getProperty("sheet_Liskart_Registration_Test_Data"));  // refer from global properties
		Iterator<HashMap<String, String>> i = data.iterator();
		//while (i.hasNext())
		
		{
			
			HashMap<String, String> dataset = i.next();
			
			//if (dataset.get("Run_Status").equalsIgnoreCase("Yes")) 
				
		 TestUtil.Entertext(driver.findElement(By.xpath(prop.getProperty("PhoneNumber"))), dataset.get("Phone_Number"));
   	 logger.info("Phone number entered");
   	 driver.findElement(By.xpath(prop.getProperty("SendOtp"))).click();
   	 logger.info("Clicked on send otp");
   	 Thread.sleep(1000);
   	 TestUtil.Entertext(driver.findElement(By.xpath(prop.getProperty("OTPEntered"))), dataset.get("OTP"));
   	 logger.info("OTP Entered");
   	 Thread.sleep(500);
   	 driver.findElement(By.xpath(prop.getProperty("Login"))).click();
   	 logger.info("Login Button Clicked");
   	 
   	 
   	 Thread.sleep(1000);
			//continue
   	 
    }
    }
}
