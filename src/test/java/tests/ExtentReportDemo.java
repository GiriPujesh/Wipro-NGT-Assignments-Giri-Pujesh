
package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {

    @Test
    public void testReport() {

        // Report location
        ExtentSparkReporter spark =
                new ExtentSparkReporter("ExtentReport.html");

        // Main report object
        ExtentReports extent = new ExtentReports();

        extent.attachReporter(spark);

        // Create test
        ExtentTest test = extent.createTest("Login Test");

        // Logs
        test.pass("Browser launched");

        test.pass("Login successful");
        
        test.fail("Test Failed")
        .addScreenCaptureFromPath("screenshot.png");

        // Save report
        extent.flush();

        System.out.println("Report Generated");
    }
}