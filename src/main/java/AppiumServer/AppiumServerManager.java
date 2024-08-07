package AppiumServer;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import AppiumCapabilities.DevicePropertyManager;
import Utilites.PropertyManager;
import Utilites.TestUtils;

public class AppiumServerManager {
	private static ThreadLocal<AppiumDriverLocalService> server = new ThreadLocal<>();
	TestUtils utils = new TestUtils();
	static Properties props;

	static String deviceName = null;

	public AppiumDriverLocalService getServer() {
		return server.get();
	}

	public void startServer() throws IOException {
		File file = new File(System.getProperty("user.dir") + "/Reports/Videos/");
		file.mkdir();

		props = new PropertyManager().getProps();

		String executionDevice = props.getProperty("executionDevice");

		if (executionDevice.equalsIgnoreCase("realDevice")) {

			deviceName = props.getProperty("platformName") + "_real_deviceName";

		} else if (executionDevice.equalsIgnoreCase("emulatorDevice")) {
			deviceName = props.getProperty("platformName") + "_emulator_deviceName";

		} else {
			System.out.println("Error! -- Please check execution device property on configuratoin..!");
		}

		utils.log().info("starting appium server");
		AppiumDriverLocalService server = WindowsGetAppiumService();
		server.start();
		if (server == null || !server.isRunning()) {
			utils.log().fatal("Appium server not started. ABORT!!!");
			throw new AppiumServerHasNotBeenStartedLocallyException("Appium server not started. ABORT!!!");
		}
		server.clearOutPutStreams(); // -> Comment this if you want to see server logs in the console

		this.server.set(server);
		utils.log().info("Appium server started");
	}

	public AppiumDriverLocalService getAppiumServerDefault() {
		return AppiumDriverLocalService.buildDefaultService();
	}

	public AppiumDriverLocalService WindowsGetAppiumService() {
		DevicePropertyManager params = new DevicePropertyManager();
		File file = new File(System.getProperty("user.dir") + "/Reports/Videos/" + props.getProperty("platformName")
				+ "_" + props.getProperty(deviceName));
		file.mkdir();
		return AppiumDriverLocalService
				.buildService(
						new AppiumServiceBuilder().usingAnyFreePort().withArgument(GeneralServerFlag.SESSION_OVERRIDE)
								.withLogFile(new File(System.getProperty("user.dir") + "/Reports/Videos/"
										+ props.getProperty("platformName") + "_" + props.getProperty(deviceName)
										+ File.separator + "Server.log")));
	}

	public AppiumDriverLocalService MacGetAppiumService() {

		DevicePropertyManager params = new DevicePropertyManager();
		HashMap<String, String> environment = new HashMap<String, String>();
		environment.put("PATH", "enter_your_path_here" + System.getenv("PATH"));
		environment.put("ANDROID_HOME", "enter_your_android_home_path");
		environment.put("JAVA_HOME", "enter_your_java_home_path");
		File file = new File(System.getProperty("user.dir") + "/Reports/Videos/" + props.getProperty("platformName")
				+ "_" + props.getProperty(deviceName));
		file.mkdir();
		return AppiumDriverLocalService
				.buildService(new AppiumServiceBuilder().usingDriverExecutable(new File("/usr/local/bin/node"))
						.withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
						.usingAnyFreePort().withArgument(GeneralServerFlag.SESSION_OVERRIDE)
						.withEnvironment(environment).withLogFile(new File(props.getProperty("platformName") + "_"
								+ props.getProperty(deviceName) + File.separator + "Server.log")));
	}
}
