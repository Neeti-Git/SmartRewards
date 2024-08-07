package stepDefinitions;

import DriverManager.DriverManager;
import Utilites.VideoManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.BasePage;

import org.openqa.selenium.OutputType;

import java.io.IOException;

public class Hooks {

    @Before
    public void initialize() throws Exception {
        BasePage basePage = new BasePage();
        basePage.closeApp();
        basePage.launchApp();

/*        DevicePropertyManager params = new DevicePropertyManager();
        params.initializeGlobalParams();

        ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_"
                + params.getDeviceName());

        new AppiumServerManager().startServer();
        new DriverManager().initializeDriver();*/
        new VideoManager().startRecording();
    }

    @After
    public void quit(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            byte[] screenshot = new DriverManager().getDriver().getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        new VideoManager().stopRecording(scenario.getName());
/*        DriverManager driverManager = new DriverManager();
        if(driverManager.getDriver() != null){
            driverManager.getDriver().quit();
            driverManager.setDriver(null);
        }
        AppiumServerManager serverManager = new AppiumServerManager();
        if(serverManager.getServer() != null){
            serverManager.getServer().stop();
        }*/
    }
}
