package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import com.hrms.utility.Log;

public class General extends Global {
	
//Re usable functions
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "D:\\jar files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");
		Reporter.log("Application opened");
		Log.info("Application opened");//log file
		
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application closed");
		Reporter.log("Application closed");
		Log.info("Application closed");
		
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(username);
		driver.findElement(By.name(txt_password)).sendKeys(password);
		driver.findElement(By.name( btn_login )).click();
		System.out.println("Login completed");
		Reporter.log("Login completed");
		Log.info("Login completed");
		
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");	
		Reporter.log("Logout completed");
		Log.info("Logout completed");
	}
	public void addEmp() {
		System.out.println("Adding new emp");	
		Reporter.log("Adding new emp");
		Log.info("Adding new emp");
	}
	public void delEmp() {
		System.out.println("Delete an emp");
		Reporter.log("Deleted emp");
		Log.info("Deleted emp");
		
	}

}