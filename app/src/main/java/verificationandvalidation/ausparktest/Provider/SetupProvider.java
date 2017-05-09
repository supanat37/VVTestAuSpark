package verificationandvalidation.ausparktest.Provider;

import org.junit.Test;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class SetupProvider {
    public DesiredCapabilities GetDesiredCapabilities() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");

        capabilities.setCapability("deviceName", "Nexus5X");

        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");

        capabilities.setCapability(CapabilityType.VERSION, "6.0");

        capabilities.setCapability("appPackage", "edu.au.auspark");

        capabilities.setCapability("appActivity","edu.au.auspark.SplashScreen");

        return capabilities;
    }

    public String GetAndroidDriverURL(){
        return "http://127.0.0.1:4723/wd/hub";
    }
}