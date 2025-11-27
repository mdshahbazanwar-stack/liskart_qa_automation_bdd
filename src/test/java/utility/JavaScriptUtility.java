package utility;

import org.openqa.selenium.JavascriptExecutor;

import configuration.Base;

public class JavaScriptUtility extends Base {
	
	public void Scrollup() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200);");
		Thread.sleep(500);
	}
	
	public void Scrollup1() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000);");
		Thread.sleep(500);
	}
	
	
	public void ScrollDown() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, -200);");
		Thread.sleep(500);
	}
	

}
