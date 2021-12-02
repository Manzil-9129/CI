package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import ExtentReportG.ExtentReportManager;

public class Hover {

ExtentReports reports;
ExtentTest hv;
	@BeforeMethod
	public void beforemethod() {

		reports=ExtentReportManager.report();
	    hv=reports.createTest("Hover Test");
	}

	@AfterMethod
	public void aftermethod() {
		reports.flush();
	}
	
	@Test
	public void hoverclass() throws InterruptedException {


		hv.log(Status.INFO, "Starting the test");
	    hv.log(Status.INFO, "Opening the Browser");
	    hv.log(Status.INFO, "Loging in");
	    hv.log(Status.PASS, "Test Passed");
	    
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Project\\geckodriver.exe");
		FirefoxDriver driver=driver=new FirefoxDriver();
	    driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	    
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,1000)");
	    
	    Thread.sleep(2000);
	    Actions al=new Actions(driver);
	    WebElement hover=driver.findElement(By.xpath("//button[@id='mousehover']"));
	    al.moveToElement(hover).build().perform();
	    List<WebElement> he=driver.findElements(By.xpath("//div[@class='mouse-hover-content']/a"));
	    System.out.println(he.size());
	    for(WebElement h:he) {
	    	System.out.println(h.getText());
	    }
	    
	    
	    
	    
	}
	
	
	
}
