package com.ohrm.testsuite;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.ohrm.utility.ExcelOperations;
import com.ohrm.utility.Screenshots;

public class Constants {
	
	static RemoteWebDriver driver=null;
	ExcelOperations  eo=new ExcelOperations();
	String path1="E:\\Mystuff\\SELINUMWS\\OHRM\\src\\com\\ohrm\\dataengine\\DataEngine.xlsx";
	String path2="E:\\Mystuff\\SELINUMWS\\OHRM\\src\\com\\ohrm\\excelfiles\\EmployeeList.xlsx";
	Screenshots sc=new Screenshots();
}
