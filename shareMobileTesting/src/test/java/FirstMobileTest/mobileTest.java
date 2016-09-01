package FirstMobileTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class mobileTest
{
	static AndroidDriver	driver;
	

	@Test(enabled = true)
	public void test1() throws MalformedURLException
	{
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"Android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Emtiaz's Android");
		capabilities.setCapability(MobileCapabilityType.VERSION, "6.0");
		capabilities.setCapability("appPackage", "io.selendroid.testapp");
		capabilities.setCapability("appActivity", ".HomeScreenActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		WebDriver driver = new AndroidDriver(url, capabilities);
	}

	@Test(enabled = false)
	public void opengmail() throws MalformedURLException, Exception
	{
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"Android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Emtiaz's Android");
		capabilities.setCapability(MobileCapabilityType.VERSION, "6.0");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		Thread.sleep(5000);
		WebDriver driver = new AndroidDriver(url, capabilities);
		driver.get("https://mail.google.com/");
		//driver.quit();
	}

}
