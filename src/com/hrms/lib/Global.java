package com.hrms.lib;
import org.openqa.selenium.WebDriver;

public class Global {
	
	public WebDriver driver;
//Test data
		public String url = "http://127.0.0.1/orangehrm-2.6/index.php";
		public String username = "admin";
		public String password = "admin";
	
//objects				text box name		find element by name
		public String txt_loginname = "txtUserName";
		public String txt_password  = "txtPassword"; 
		public String btn_login 	= "Submit";
		public String link_logout 	= "Logout";
	
}

