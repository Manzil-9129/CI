package TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import ExtentReportG.ExtentReportManager;

public class AlertClass {

ExtentReports reports;
ExtentTest Al;


@BeforeMethod
public void initiate() {

	reports=ExtentReportManager.report();
    Al=reports.createTest("Alert Test");
}

@AfterMethod
public void quit() {
	reports.flush();
}




@Test
public void alertclass() throws InterruptedException {


	Al.log(Status.INFO, "Starting the test");
    Al.log(Status.INFO, "Opening the Browser");
    Al.log(Status.INFO, "Loging in");
    Al.log(Status.PASS,"Test Passed" );
   

	System.setProperty("webdriver.gecko.driver", "C:\\Selenium Project\\geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
    driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

    String url="https://www.rahulshettyacademy.com/AutomationPractice/";
    String url_actual=driver.getCurrentUrl();
 
    Assert.assertEquals(url, url_actual);
}
	
	
}
