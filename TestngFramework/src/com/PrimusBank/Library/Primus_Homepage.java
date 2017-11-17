package com.PrimusBank.Library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.PrimusBank.Constant.PrimusBankConstant;

public class Primus_Homepage extends PrimusBankConstant {

	
	
	
	public boolean AdminLoginFunction(String uid,String pass)
	{
		
		driver.findElement(By.id("txtuId")).sendKeys(uid);
		driver.findElement(By.id("txtPword")).sendKeys(pass);
		driver.findElement(By.id("login")).click();
		
		String acturl,expurl;
		
		
		expurl="adminflow.aspx";
		
		acturl=driver.getCurrentUrl();
		
		if(acturl.toLowerCase().contains(expurl.toLowerCase()))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

    public boolean bankerLogin(String brnm,String pwd,String uid)
    {
    	
    	WebElement branches=driver.findElement(By.id("drlist"));
    	
    	Select branch=new Select(branches);
    	branch.selectByVisibleText("Ananthapur");
    	driver.findElement(By.id("txtuId")).sendKeys(uid);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		
		String acturl,expeurl;
		expeurl=
		
		acturl=driver.getCurrentUrl();
		
		if(acturl.toLowerCase().contains(expeurl.toLowerCase()))
		{
			
			return true;
		}
		else
		{
			return false;
		}
       
    }


}
