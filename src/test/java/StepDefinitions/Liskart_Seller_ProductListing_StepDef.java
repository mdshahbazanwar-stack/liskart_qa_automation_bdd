package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import configuration.Base;
import io.cucumber.java.en.*;

public class Liskart_Seller_ProductListing_StepDef extends Base{
	
	
	@Then("Click on product list")
	public void click_on_product_list() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

		WebElement productElement = wait.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath(prop.getProperty("ProductList"))
		        )
		);

		productElement.click();
	   	 logger.info("Clicked on product list");
	}

	@Then("Enter Product name and submit")
	public void enter_product_name_and_submit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

		WebElement productElement = wait.until(
		        ExpectedConditions.elementToBeClickable(
		                By.id(prop.getProperty("ProductName"))
		        )
		);
		//productElement.click();
		productElement.sendKeys("QA Test Product");
		logger.info("Product name has entered");
		driver.findElement(By.xpath(prop.getProperty("Submit"))).click();
		logger.info("Submit button has been clicked");
		Thread.sleep(5000);
	}

	@Then("Click on update Inventory")
	public void click_on_update_inventory() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

		WebElement productElement = wait.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath(prop.getProperty("UpdateInventory"))
		        )
		);
		productElement.click();
		logger.info("Update Inventory has been clicked");
		Thread.sleep(500);
		
	}

	@Then("Enter new quantity and update")
	public void enter_new_quantity_and_update() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

		WebElement productElement = wait.until(
		        ExpectedConditions.elementToBeClickable(
		                By.id(prop.getProperty("Quantity"))
		        )
		);
		productElement.clear();
		productElement.sendKeys("150");
		driver.findElement(By.xpath(prop.getProperty("FinalUpdateInventory"))).click();
		logger.info("Invenotry has been updated");
		Thread.sleep(500);
	}

	@Then("Click on reset button")
	public void click_on_reset_button() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

		WebElement productElement = wait.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath(prop.getProperty("ResetButton"))
		        )
		);
		productElement.click();
		logger.info("Reset button has been clicked");
		Thread.sleep(500);
	}

	@Then("Enter the product SKU and submit")
	public void enter_the_product_sku_and_submit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

		WebElement productElement = wait.until(
		        ExpectedConditions.elementToBeClickable(
		                By.id(prop.getProperty("ProductSkuName"))
		        )
		);
		//productElement.click();
		productElement.sendKeys("QATP 001");
		logger.info("Product SKU has entered");
		driver.findElement(By.xpath(prop.getProperty("Submit"))).click();
		logger.info("Submit button has been clicked");
		
		Thread.sleep(500);
		
	}



}
