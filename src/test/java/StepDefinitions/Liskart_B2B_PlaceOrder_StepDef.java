package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import configuration.Base;
import io.cucumber.java.en.*;
import utility.JavaScriptUtility;

public class Liskart_B2B_PlaceOrder_StepDef extends Base {
	
	WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
	Login login;
	JavaScriptUtility javaScriptUtility;
	
	
	@Given("Login to Liskart")
	public void login_to_liskart() throws Exception {
	    Login login= new Login();
	    login.logintoliskart();
	    
	}

	@Then("Find the Product")
	public void find_the_product() throws InterruptedException {
		
		
		WebDriverWait scrollwait = new WebDriverWait(driver, Duration.ofSeconds(60));

		WebElement homeElement = scrollwait.until(
		        ExpectedConditions.presenceOfElementLocated(
		                By.xpath(prop.getProperty("Home"))
		        )
		);
		System.out.println(homeElement);
		
		javaScriptUtility =new JavaScriptUtility();
		javaScriptUtility.Scrollup1();
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		WebElement productElement = wait.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath(prop.getProperty("LiskartProduct"))
		        )
		);

		productElement.click();

	
		
		
		/*
		 * driver.findElement(By.xpath(prop.getProperty("LiskartProduct"))).click();
		 * logger.info("Clicked to the product");
		 */
		Thread.sleep(2000);
	}

	@Then("Click on buy now")
	public void Click_on_buy_now() throws InterruptedException {
		
		//driver.findElement(By.xpath(prop.getProperty("BuyNow"))).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		WebElement productElement = wait.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath(prop.getProperty("BuyNow"))
		        )
		);

		productElement.click();
		Thread.sleep(15000);
		
		WebDriverWait Incrwait = new WebDriverWait(driver, Duration.ofSeconds(180));

		WebElement IncrproductElement = Incrwait.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath(prop.getProperty("IncrementItem"))
		        )
		);

		System.out.println(IncrproductElement);
	}
	
	

	@Then("Click on Incement button to increase the amount of product")
	public void Click_on_Incement_button_to_increase_the_amount_of_product() throws InterruptedException {
		
		
		  for (int i = 0; i <2; i++) { //
		  driver.findElement(By.xpath(prop.getProperty("IncrementItem"))).click(); //
		  Thread.sleep(15000); // 500 ms pause, handle InterruptedException }
			/*
			 * WebDriverWait Incrwait = new WebDriverWait(driver, Duration.ofSeconds(20));
			 * 
			 * WebElement IncrproductElement = Incrwait.until(
			 * ExpectedConditions.elementToBeClickable(
			 * By.xpath(prop.getProperty("IncrementItem")) ) ); IncrproductElement.click();
			 */
		  logger.info("Clicked on Increment button to increase the amount of product");
		  }
		 
		/*
		 * for (int i = 0; i < 3; i++) {
		 * 
		 * By incrementBtn = By.xpath(prop.getProperty("IncrementItem"));
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		 * 
		 * wait.until(ExpectedConditions.elementToBeClickable(incrementBtn)).click();
		 * logger.info("Clicked on Increment button to increase the amount of product");
		 * 
		 * }
		 */
		
		 
	}
	
	@Then("Click on proceed to checkout")
	public void Click_on_proceed_to_checkout() throws InterruptedException {
		
		/*
		 * driver.findElement(By.xpath(prop.getProperty("ProceedToCheckout"))).click();
		 * logger.info("Clicked on proceed to checkout"); Thread.sleep(5000);
		 */
		  
		  
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

			WebElement productElement = wait.until(
			        ExpectedConditions.elementToBeClickable(
			                By.xpath(prop.getProperty("ProceedToCheckout"))
			        )
			);

			productElement.click();
			 logger.info("Clicked on proceed to checkout"); 
		  
			 Thread.sleep(5000);
		
	}
	
	@Then("Select a payment method")
	public void Select_a_payment_method() throws InterruptedException {
		
		javaScriptUtility =new JavaScriptUtility();
		javaScriptUtility.Scrollup();
		
		  driver.findElement(By.xpath(prop.getProperty("JioPayment"))).click();
		  logger.info("Clicked on a payment method"); 
		  TimeUnit.SECONDS.sleep(10); // 10 seconds
		 
		
	}
	
	
	@And("Place the order")
	public void Place_the_order() throws InterruptedException {
		
		/*
		 * driver.findElement(By.xpath(prop.getProperty("PlaceORder"))).click();
		 * logger.info("clicked on Place order"); Thread.sleep(2000);
		 */
		  
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

			WebElement productElement = wait.until(
			        ExpectedConditions.elementToBeClickable(
			                By.xpath(prop.getProperty("PlaceORder"))
			        )
			);

			productElement.click();
		 
		
	}
	
	
	@Then("Select how do you pay")
	public void Select_how_do_you_pay() throws InterruptedException {
		
		  
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

			WebElement productElement = wait.until(
			        ExpectedConditions.elementToBeClickable(
			                By.xpath(prop.getProperty("Netbanking"))
			        )
			);

			productElement.click();
		 
		
	}

	@Then("Select a bank to do your payment")
	public void Select_a_bank_to_do_your_payment() throws InterruptedException {
		
		  
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

			WebElement productElement = wait.until(
			        ExpectedConditions.elementToBeClickable(
			                By.xpath(prop.getProperty("SelectBank"))
			        )
			);

			productElement.click();
		 
		
	}
	
	@Then("Click on final pay button to pay")
	public void Click_on_final_pay_button_to_pay() throws InterruptedException {
		
		  
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

			WebElement productElement = wait.until(
			        ExpectedConditions.elementToBeClickable(
			                By.xpath(prop.getProperty("PayButton"))
			        )
			);

			productElement.click();
		 
		
	}

	@And("Click on success")
	public void Click_on_success() throws InterruptedException {
		
		  
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

			WebElement productElement = wait.until(
			        ExpectedConditions.elementToBeClickable(
			                By.xpath(prop.getProperty("Success"))
			        )
			);

			productElement.click();
		 
		
	}
	
	@Then("View the product")
	public void View_the_product() throws InterruptedException {
		
		  
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(180));

			WebElement productElement = wait.until(
			        ExpectedConditions.elementToBeClickable(
			                By.xpath(prop.getProperty("VeiwOrder"))
			        )
			);
			javaScriptUtility =new JavaScriptUtility();
			javaScriptUtility.Scrollup();
			 TimeUnit.SECONDS.sleep(5); // 5 seconds
			productElement.click();
		 
		
	}
	
	
	
	
}
