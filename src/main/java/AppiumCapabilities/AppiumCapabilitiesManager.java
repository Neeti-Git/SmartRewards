package AppiumCapabilities;

import org.openqa.selenium.remote.DesiredCapabilities;

import Utilites.PropertyManager;
import Utilites.TestUtils;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class AppiumCapabilitiesManager {
	TestUtils utils = new TestUtils();

	public DesiredCapabilities getCaps() throws IOException {
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

		try {
			utils.log().info("getting capabilities");
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("platformName", props.getProperty("platformName"));
			caps.setCapability("udid", props.getProperty(udid));
			caps.setCapability("deviceName", props.getProperty(deviceName));

			switch (params.getPlatformName()) {
			case "Android":
				caps.setCapability("automationName", props.getProperty("androidAutomationName"));
				caps.setCapability("appPackage", props.getProperty("androidAppPackage"));
				caps.setCapability("appActivity", props.getProperty("androidAppActivity"));
				caps.setCapability("systemPort", params.getSystemPort());
				caps.setCapability("chromeDriverPort", params.getChromeDriverPort());
				caps.setCapability("unicodeKeyboard", true);
				caps.setCapability("resetKeyboard", true);
				caps.setCapability("autoAcceptAlerts", true);
				caps.setCapability("autoDismissAlerts", true);
				String androidAppUrl = System.getProperty("user.dir") + props.getProperty("androidAppLocation");
				utils.log().info("appUrl is" + androidAppUrl);
				caps.setCapability("app", androidAppUrl);
				break;
			case "iOS":
				caps.setCapability("automationName", props.getProperty("iOSAutomationName"));
				// String iOSAppUrl =
				// getClass().getResource(props.getProperty("iOSAppLocation")).getFile();
				String iOSAppUrl = System.getProperty("user.dir") + props.getProperty("iOSAppLocation");
				utils.log().info("appUrl is" + iOSAppUrl);
				caps.setCapability("bundleId", props.getProperty("iOSBundleId"));
				caps.setCapability("wdaLocalPort", params.getWdaLocalPort());
				caps.setCapability("webkitDebugProxyPort", params.getWebkitDebugProxyPort());
				caps.setCapability("app", iOSAppUrl);
				break;
			}
			return caps;
		} catch (Exception e) {
			e.printStackTrace();
			utils.log().fatal("Failed to load capabilities. ABORT!!" + e.toString());
			throw e;
		}
	}
}
