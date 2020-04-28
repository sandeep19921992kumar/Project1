package Package1;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


public class First {

	
	/*
	 * public static void main(String[] args) throws InterruptedException { // TODO
	 * System.setProperty("webdriver.gecko.driver",
	 * "C:\\Users\\MY PC\\Desktop\\Sandeep\\SoftwaresAndJars\\All_Drivers\\geckodriver.exe"
	 * ); DesiredCapabilities capability = DesiredCapabilities.firefox();
	 * capability.setBrowserName("firefox"); capability.setVersion("75.0.0.7398");
	 * capability.setPlatform(Platform.WINDOWS); WebDriver driver=new
	 * FirefoxDriver(capability); driver.get("https://www.facebook.com/");
	 * Thread.sleep(2000); driver.quit();
	 * 
	 * }
	 */
	 
	@Test
	public void m1()
	{
		System.out.println("Hello First Test Execute in TestNg-Sucessfully imp commit msg");
	}

}
