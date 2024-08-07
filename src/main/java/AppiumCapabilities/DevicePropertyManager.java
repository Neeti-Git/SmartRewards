package AppiumCapabilities;

import java.io.IOException;
import java.util.Properties;

import Utilites.PropertyManager;

public class DevicePropertyManager {
	private static ThreadLocal<String> platformName = new ThreadLocal<String>();
	private static ThreadLocal<String> udid = new ThreadLocal<String>();
	private static ThreadLocal<String> deviceName = new ThreadLocal<String>();
	private static ThreadLocal<String> systemPort = new ThreadLocal<String>();
	private static ThreadLocal<String> chromeDriverPort = new ThreadLocal<String>();
	private static ThreadLocal<String> wdaLocalPort = new ThreadLocal<String>();
	private static ThreadLocal<String> webkitDebugProxyPort = new ThreadLocal<String>();

	public void setPlatformName(String platformName1) {
		platformName.set(platformName1);
	}

	public String getPlatformName() {
		return platformName.get();
	}

	public String getUDID() {
		return udid.get();
	}

	public void setUDID(String udid2) {
		udid.set(udid2);
	}

	public String getDeviceName() {
		return deviceName.get();
	}

	public void setDeviceName(String deviceName2) {
		deviceName.set(deviceName2);
	}

	public String getSystemPort() {
		return systemPort.get();
	}

	public void setSystemPort(String systemPort2) {
		systemPort.set(systemPort2);
	}

	public String getChromeDriverPort() {
		return chromeDriverPort.get();
	}

	public void setChromeDriverPort(String chromeDriverPort2) {
		chromeDriverPort.set(chromeDriverPort2);
	}

	public String getWdaLocalPort() {
		return wdaLocalPort.get();
	}

	public void setWdaLocalPort(String wdaLocalPort2) {
		wdaLocalPort.set(wdaLocalPort2);
	}

	public String getWebkitDebugProxyPort() {
		return webkitDebugProxyPort.get();
	}

	public void setWebkitDebugProxyPort(String webkitDebugProxyPort2) {
		webkitDebugProxyPort.set(webkitDebugProxyPort2);
	}

	public void initializeGlobalParams() throws IOException {
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
		params.setPlatformName(props.getProperty("platformName"));
		params.setUDID(props.getProperty(udid));
		params.setDeviceName(props.getProperty(deviceName));

		switch (params.getPlatformName()) {
		case "Android":
			params.setSystemPort(props.getProperty("systemPort"));
			params.setChromeDriverPort(props.getProperty("chromeDriverPort"));
			break;
		case "iOS":
			params.setWdaLocalPort(props.getProperty("wdaLocalPort"));
			params.setWebkitDebugProxyPort(props.getProperty("webkitDebugProxyPort"));
			break;
		default:
			throw new IllegalStateException("Invalid Platform Name!");
		}
	}
}
