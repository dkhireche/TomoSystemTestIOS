package testKonfiguration;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumSetup {

    public static AppiumDriver driver;
    public static String AppiumUrl = "http://0.0.0.0:4724/wd/hub";

    private static void iOSSetup() throws MalformedURLException, InterruptedException {

        // File f = new File("src");
        // File fs = new File(f, "tomo-debug.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();



        capabilities.setCapability("platformName", "iOS");
        //capabilities.setCapability("platformVersion", "12.0");
        //capabilities.setCapability("deviceName", "iPhone7 Plus");

        capabilities.setCapability("platformVersion", "12.0");
        capabilities.setCapability("deviceName", "iPhone7 Plus");
        //capabilities.setCapability("deviceName", "iPhone 5s");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("app", "/Users/sdptesting/Desktop/iosNeuTomo/t-online.de.app");
        //capabilities.setCapability("udid", "ac4f61961b6b155dada78c1c92d6031c4f87b9cb");

        capabilities.setCapability("udid", "3169a19e627d1e926385e6da49ebd81c4f082ca8");

        capabilities.setCapability("bundleId", "de.telekom.t-online-de");
        capabilities.setCapability("xcodeOrgId", "S587T6HBTW");
        capabilities.setCapability("xcodeSigningId", "iPhone Developer");



        driver = new AppiumDriver<MobileElement>(new URL(AppiumUrl), capabilities);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        Thread.sleep(10000);

    }

    public static void appStart() throws MalformedURLException, InterruptedException {
        iOSSetup();
    }

    public static void close(){
        driver.quit();
    }
}
