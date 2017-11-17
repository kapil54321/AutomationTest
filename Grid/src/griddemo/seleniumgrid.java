package griddemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

//import com.sun.jna.Platform;

public class seleniumgrid {

	
	@Test
	public void logintest() throws MalformedURLException
	{
  

		DesiredCapabilities cap=null;
		
		//cap=DesiredCapabilities.firefox();
		
		cap=DesiredCapabilities.chrome();
		
		cap=DesiredCapabilities.internetExplorer();
		
		
		cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
		
		//cap.setPlatform(.LINUX);
		
		RemoteWebDriver rdriver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		
		
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("https://gmail.com");

	    driver=new ChromeDriver();
		
	    System.setProperty("webdriver.chrome.driver","C:/Users/user/Downloads/chromedriver.exe");
	    
		driver.get("https://gmail.com");

	}
	
	
	
	
	

}
