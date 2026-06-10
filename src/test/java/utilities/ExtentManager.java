
package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    public static ExtentReports getReportObject() {

        String path = "ExtentReport.html";

        ExtentSparkReporter reporter =
                new ExtentSparkReporter(path);

        reporter.config().setReportName("API Automation Report");

        reporter.config().setDocumentTitle("REST Assured Results");

        ExtentReports extent = new ExtentReports();

        extent.attachReporter(reporter);

        extent.setSystemInfo("Tester", "Giri");

        return extent;
    }
}