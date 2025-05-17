import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MyTest {
	DesiredCapabilities caps=new DesiredCapabilities();
	AndroidDriver driver;
	
	@BeforeMethod
	public void  BeforeEachTest() throws MalformedURLException {
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);		
	}
	@BeforeTest
	public void MySetup() {
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "abc");
		File MyApplication=new File ("src/MyApplication/calculator.apk");
		caps.setCapability(MobileCapabilityType.APP, MyApplication.getAbsolutePath());		
	}
	
	@Test(enabled=false)
	public void MyTest () throws MalformedURLException {
		driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		String result=driver.findElement(By.id("com.google.android.calculator:id/result_preview")).getText();
		Assert.assertEquals(result, "45");
//		Assert.assertEquals(Integer.parseInt(result), 45);
	}
	@Test
	public void ClickOnlyOnTheNumbers ()  {
		List<WebElement> allButtons=driver.findElements(By.className("android.widget.ImageButton"));
		for(int i=0;i<allButtons.size();i++) {
			
			if(allButtons.get(i).getDomAttribute("resource-id").contains("digit")) {
				allButtons.get(i).click();
			}
			
		}
	
	}
}
