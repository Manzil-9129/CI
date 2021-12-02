package ExtentReportG;


import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
	
	static ExtentReports reports;
    public static ExtentReports report() {
    	
       if(reports==null)
    	{	
        //Generate the Report
        reports=new ExtentReports();
    	
        Date D=new Date();
        String foldername=D.toString().replaceAll(":","-");
        String Rlocation=System.getProperty("user.dir")+"//ReportsG//"+foldername;
        
     	File F=new File(Rlocation);
     	F.mkdirs();   
        
    	//Reporter set the configuration of the report
    	ExtentSparkReporter reporter=new ExtentSparkReporter(Rlocation);
    	reporter.config().setDocumentTitle("Practice Testing");
    	reporter.config().setReportName("Automation Testing");
    	reporter.config().setTheme(Theme.STANDARD);
    	
    	//Attach the report given by the reporter
    	reports.attachReporter(reporter);
    	}
    	
    	return reports;
    	
    	
    	
    	
    	
    	
    }
	
	
	
	
	
	

}
