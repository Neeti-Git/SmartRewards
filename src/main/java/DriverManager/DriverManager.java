package DriverManager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.io.IOException;

import AppiumCapabilities.AppiumCapabilitiesManager;
import AppiumCapabilities.DevicePropertyManager;
import AppiumServer.AppiumServerManager;
import Utilites.PropertyManager;
import Utilites.TestUtils;

public class DriverManager {
    private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
    TestUtils utils = new TestUtils();

    public AppiumDriver getDriver(){
        return driver.get();
    }

    public void setDriver(AppiumDriver driver2){
        driver.set(driver2);
    }

    public void initializeDriver() throws Exception {
        AppiumDriver driver = null;
        DevicePropertyManager params = new DevicePropertyManager();
        PropertyManager props = new PropertyManager();

        if(driver == null){
            try{
                utils.log().info("initializing Appium driver");
                switch(params.getPlatformName()){
                    case "Android":
                        driver = new AndroidDriver(new AppiumServerManager().getServer().getUrl(), new AppiumCapabilitiesManager().getCaps());
                        break;
                    case "iOS":
                        driver = new IOSDriver(new AppiumServerManager().getServer().getUrl(), new AppiumCapabilitiesManager().getCaps());
                        break;
                }
                if(driver == null){
                    throw new Exception("driver is null. ABORT!!!");
                }
                utils.log().info("Driver is initialized");
                this.driver.set(driver);
            } catch (IOException e) {
                e.printStackTrace();
                utils.log().fatal("Driver initialization failure. ABORT !!!!" + e.toString());
                throw e;
            }
        }

    }

}
