package runner;

import AppiumCapabilities.DevicePropertyManager;
import AppiumServer.AppiumServerManager;
import DriverManager.DriverManager;
import Utilites.JvmReport;
import Utilites.ReportWeb;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.apache.logging.log4j.ThreadContext;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "json:Reports/JVM/cucumber.json", "summary" }, features = {
		"src/test/resources/features" }, glue = {
				"stepDefinitions" }, snippets = CAMELCASE, dryRun = false, monochrome = true, tags = "@paymentmethods")

public class MyRunnerTest {
	static ReportWeb report = new ReportWeb();
	static String start_time, formatWithoutSpace;

	@BeforeClass
	public static void initialize() throws Exception {
		LocalDateTime instance = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy kk:mm:ss");
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy_kk-mm-ss");

		start_time = format.format(instance);
		formatWithoutSpace = format1.format(instance);

		System.setProperty("start_time", start_time);
		System.setProperty("formatWithoutSpace", formatWithoutSpace);

		// DriverManager.first_test = "first";

		DevicePropertyManager params = new DevicePropertyManager();
		params.initializeGlobalParams();

		ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_" + params.getDeviceName());

		new AppiumServerManager().startServer();
		new DriverManager().initializeDriver();

	}

	@AfterClass
	public static void quit() throws IOException {
		DriverManager driverManager = new DriverManager();
		if (driverManager.getDriver() != null) {
			driverManager.getDriver().quit();
			driverManager.setDriver(null);
		}
		AppiumServerManager appiumServerManager = new AppiumServerManager();
		if (appiumServerManager.getServer() != null) {
			appiumServerManager.getServer().stop();
		}

		LocalDateTime instance = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy kk:mm:ss");
		String Endtime_time = format.format(instance);
		System.setProperty("Endtime_time", Endtime_time);
		JvmReport.generateReport(System.getProperty("user.dir") + "/Reports/JVM/cucumber.json");
		report.generateReport(System.getProperty("user.dir") + "/Reports/JVM/cucumber.json", formatWithoutSpace);

	}
}
