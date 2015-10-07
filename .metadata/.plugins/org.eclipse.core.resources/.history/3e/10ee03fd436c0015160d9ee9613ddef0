package com.orangehrm.testsuite;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AddEmployee  extends Constants{
	@Test
	public void addEmployeeTest() throws IOException, InterruptedException
	{
		String runmode=eo.getCellData(path2,0,2,2);
		if(runmode.equals("N"))
		{
			throw new SkipException("Skipped Add Employee Test");
		}
		else
		{
			AddEmployeePage aep=PageFactory.initElements(driver,AddEmployeePage.class);
			int rowcount=eo.getRowCount(path1, 0);
			for(int i=1;i<=rowcount;i++)
			{
			
				Row r=eo.getRowData(path1,0,i);
				Thread.sleep(10000);
				aep.menu.pim();
				Thread.sleep(10000);
				aep.addemployee.click();
				Thread.sleep(10000);
				aep.addEmployee(r);
			}
	      }
	}
	

}
