package com.orangehrm.TestSuite;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.orangehrm.Utility.ExcelOperations;
import com.orangehrm.Utility.ScreenShot;

public class Constants {
	ExcelOperations eo=new ExcelOperations();
	String path1="E:\\Mystuff\\SELINUMWS\\OrangeHRM\\src\\com\\orangehrm\\ExcelFiles\\EmployeeList.xlsx";
	String path2="E:\\Mystuff\\SELINUMWS\\OrangeHRM\\src\\com\\orangehrm\\DataEngine\\DataEngine.xlsx";
	static RemoteWebDriver driver=null;
	ScreenShot screen=new ScreenShot();
}
