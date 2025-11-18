package configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger;
	
	public static WebDriver getDriver() throws IOException
	{
		logger= LogManager.getLogger(Base.class);
		logger= LogManager.getLogger("getDriver");
		logger= LogManager.getLogger();
		
		prop = new Properties();
		File f = new File(System.getProperty("user.dir")+"/src/test/java/configuration/global.properties");
		FileInputStream fis = new FileInputStream(f);
		prop.load(fis);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
	}
	

}
