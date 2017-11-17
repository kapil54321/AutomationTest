package com.PrimusBank.Constant;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class PrimusBankConstant {
	//this is TestNg
	public static WebDriver driver=new FirefoxDriver();
	
    public static String Url="http://primusbank.qedgetech.com/";

    @BeforeSuite
    public static void launchapp()
    {
    
    	driver.get(Url);
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    	
    }
 
    public static void appclose()
    {
    	driver.close();
    }

}
