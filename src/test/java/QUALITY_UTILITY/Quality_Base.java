package QUALITY_UTILITY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Quality_Base {
	
	
 // Constructor should not have any return value 
	// Constructor should have same name as class 
	
	public static WebDriver driver;
	public static Properties QPro;
	
	public Quality_Base() { // Constructor is handling config file
		try {
			FileInputStream Q_file = new FileInputStream(System.getProperty("user.dir")+ "//src//test//java//QUALITY_CONFIG//QConfig.Properties");
			QPro = new Properties(); 
			QPro.load(Q_file);
		} catch (FileNotFoundException e) {
			
			System.out.println("Please check the Constructor");
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	public void Quality_Browser() {// Browser Setup
		
		String QBrowser=  QPro.getProperty("QBrowser1");
		
		if(QBrowser.equalsIgnoreCase("Chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\nextt\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			System.setProperty("Webdriver.chrome.driver",(System.getProperty("user.dir") + "Chrome_Driver/chromedriver.exe"));
			ChromeOptions Chromeco = new ChromeOptions();
			Chromeco.addArguments("--remote-allow-origins=*");
	        driver = new ChromeDriver(); 
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Quality_Utility.pageLoadTimeout));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Quality_Utility.implicitlyWait));
			driver.manage().window().maximize(); 
			
			
		}
		else if(QBrowser.equalsIgnoreCase("Edge")) {
			
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+ "Edge_Driver/msedgedriver.exe");
			EdgeOptions Edgeco = new EdgeOptions();
			Edgeco.addArguments("--remote-allow-origins=*");
	        driver = new EdgeDriver(); 
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize(); 
			
			
		}
		
	}
	
	
       public static void  QualityLuanchingURL(String URL) { // Putting URL in browser 
    	   Quality_Utility.takeMyScreenshot(driver, "Home Page");
		driver.get(QPro.getProperty("QualityURL3"));
		
	}
	

}

