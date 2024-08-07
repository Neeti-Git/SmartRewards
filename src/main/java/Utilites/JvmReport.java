package Utilites;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	static String platform;
	public static String build = null;
	static String platformVersion;
	static String deviceName;
	static Properties props;

	public static final Logger logger = LoggerFactory.getLogger(JvmReport.class);
	static {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Time totalTime() {
		String start_Time = System.getProperty("start_time");
		String endtime_Time = System.getProperty("Endtime_time");
		String start_modifiedTime = start_Time.substring(start_Time.lastIndexOf(" ") + 1);
		String end_modifiedTime = endtime_Time.substring(endtime_Time.lastIndexOf(" ") + 1);
		long difference;
		Time t1 = Time.valueOf(start_modifiedTime);
		Time t2 = Time.valueOf(end_modifiedTime);
		if (t2.getTime() >= t1.getTime()) {
			difference = t2.getTime() - t1.getTime() - 19800000;
		} else {
			difference = t1.getTime() - t2.getTime() - 19800000;
		}
		java.sql.Time time = new java.sql.Time(difference);
		return time;
	}

	public static void generateReport(String JsonFile) throws IOException {
		props = new PropertyManager().getProps();
		String executionDevice = props.getProperty("executionDevice");
		platform = props.getProperty("platformName");
		if (executionDevice.equalsIgnoreCase("realDevice")) {

			platformVersion = props.getProperty("platformName") + "_real_platformVersion";
			deviceName = props.getProperty("platformName") + "_real_deviceName";

		} else if (executionDevice.equalsIgnoreCase("emulatorDevice")) {
			platformVersion = props.getProperty("platformName") + "_emulator_platformVersion";
			deviceName = props.getProperty("platformName") + "_emulator_deviceName";

		} else {
			System.out.println("Error! -- Please check execution device property on configuratoin..!");
		}

		File file = new File(System.getProperty("user.dir") + "/Reports/Videos/" + props.getProperty("platformName")
				+ "_" + props.getProperty(deviceName));
		file.mkdir();

		if (platform != null && !platform.trim().isEmpty() && build != null && !build.trim().isEmpty()
				&& platformVersion != null && !platformVersion.trim().isEmpty() && deviceName != null
				&& !deviceName.trim().isEmpty()) {
			String time = totalTime().toString();
			File jvmpathFile = new File(System.getProperty("user.dir") + "/Reports/HTML/"+System.getProperty("formatWithoutSpace")+"/");
			jvmpathFile.mkdir();
			System.out.println(jvmpathFile);
			Configuration config = new Configuration(jvmpathFile, "SmartRewards");
			config.addClassifications("Platform	", platform);
			config.addClassifications("DeviceName", props.getProperty(deviceName));
			config.addClassifications("StartTime", System.getProperty("start_time"));
			config.addClassifications("EndTime", System.getProperty("Endtime_time"));
			config.addClassifications("ExecutionTime", time);
			config.addClassifications("PlatformVersion", props.getProperty(platformVersion));
			config.addClassifications("Build", build);
			List<String> JsonFiles = new ArrayList<String>();
			JsonFiles.add(JsonFile);
			ReportBuilder report = new ReportBuilder(JsonFiles, config);
			report.generateReports();
			
		} else {
			logger.info("JVM Report : ENV Variable is missing.Please verify......!");
		}
	}

}
