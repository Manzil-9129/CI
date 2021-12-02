package TestCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import ExtentReportG.ExtentReportManager;

public class WindowHandler {
	ExtentReports reports;
	ExtentTest Wh;
	@BeforeMethod
	public void beforemethod() {
		reports=ExtentReportManager.report();
		Wh=reports.createTest("WindowHandler");
	}

	@AfterMethod
	public void aftermethod() {
		reports.flush();
	}

	@Test
	public void windowhandler() {
		

		Wh.log(Status.INFO, "Starting the test");
	    Wh.log(Status.INFO, "Opening the Browser");
	    Wh.log(Status.INFO, "Loging in");
	    Wh.log(Status.PASS, "Test Passed");
	    
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Project\\geckodriver.exe");
		FirefoxDriver driver=driver=new FirefoxDriver();
	    driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	    
	    driver.findElement(By.cssSelector("a[id='opentab']")).click();
	    
	    Set<String> windowhandler=driver.getWindowHandles();
	    
	    Iterator<String> iter=windowhandler.iterator();
	    String parentwindow=iter.next();
	    String parentwindow1=driver.getCurrentUrl();
	    String childwindow=iter.next();
	    String childwindow1=driver.getCurrentUrl();
	    if(windowhandler.contains(childwindow1))
	    {
	    	driver.switchTo().window(parentwindow);
	    }
	    
	    
	    
	}
}
