package Utilites;

import io.appium.java_client.screenrecording.CanRecordScreen;
import org.apache.commons.codec.binary.Base64;

import AppiumCapabilities.DevicePropertyManager;
import DriverManager.DriverManager;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class VideoManager {
	TestUtils utils = new TestUtils();

	public void startRecording() {
		((CanRecordScreen) new DriverManager().getDriver()).startRecordingScreen();
	}

	public void stopRecording(String scenarioName) throws IOException {
		DevicePropertyManager params = new DevicePropertyManager();

		Properties props = new PropertyManager().getProps();

		String executionDevice = props.getProperty("executionDevice");
		String udid = null;
		String deviceName = null;
		if (executionDevice.equalsIgnoreCase("realDevice")) {

			udid = props.getProperty("platformName") + "_real_udid";
			deviceName = props.getProperty("platformName") + "_real_deviceName";

		} else if (executionDevice.equalsIgnoreCase("emulatorDevice")) {
			udid = props.getProperty("platformName") + "_emulator_udid";
			deviceName = props.getProperty("platformName") + "_emulator_deviceName";
		} else {
			System.out.println("Error! -- Please check execution device property on configuratoin..!");
		}

		String media = ((CanRecordScreen) new DriverManager().getDriver()).stopRecordingScreen();
		File file = new File(System.getProperty("user.dir") + "/Reports/Videos/" + props.getProperty("platformName")
				+ "_" + props.getProperty(deviceName));
		file.mkdir();

		String dirPath = System.getProperty("user.dir") + "/Reports/Videos/" + props.getProperty("platformName") + "_"
				+ props.getProperty(deviceName) + File.separator + "Videos";

		File videoDir = new File(dirPath);

		synchronized (videoDir) {
			if (!videoDir.exists()) {
				videoDir.mkdirs();
			}
		}
		FileOutputStream stream = null;
		try {
			stream = new FileOutputStream(videoDir + File.separator + scenarioName + ".mp4");
			stream.write(Base64.decodeBase64(media));
			stream.close();
			utils.log().info("video path: " + videoDir + File.separator + scenarioName + ".mp4");
		} catch (Exception e) {
			utils.log().error("error during video capture" + e.toString());
		} finally {
			if (stream != null) {
				stream.close();
			}
		}
	}
}
