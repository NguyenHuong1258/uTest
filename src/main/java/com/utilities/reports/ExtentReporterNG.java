package com.utilities.reports;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.*;

/**
 * Create report by .html format
 */

public class ExtentReporterNG implements IReporter {
    static ExtentReports extent;
    static String reportFolder = "ExtentReport";


    public static ExtentReports extentReportGenerator() {
        String path = reportFolder + "/" + "index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Amazon automation test");
        reporter.config().setDocumentTitle("Test Result");
        reporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Windows", "10");
        return extent;

    }
}
