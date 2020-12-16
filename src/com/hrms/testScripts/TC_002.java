package com.hrms.testScripts;
import org.apache.log4j.xml.DOMConfigurator;
import com.hrms.lib.General;
import org.testng.annotations.Test;
public class TC_002 {
@Test
public void tc002() {
		// TODO Auto-generated method stub
	DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.addEmp();
		obj.delEmp();
		obj.logout();
		obj.closeApplication();
		

	}

}
