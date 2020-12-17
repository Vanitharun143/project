package com.hrms.testScripts;
import org.apache.log4j.xml.DOMConfigurator;
import com.hrms.lib.General;
import org.testng.annotations.Test;

public class TC_001 {
	@Test
	public void tc001() {
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();

		
	}

}