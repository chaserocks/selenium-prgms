package com.orangehrm.TestSuite;

	import java.io.IOException;
	import org.apache.poi.ss.usermodel.Row;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.SkipException;
	import org.testng.annotations.Test;

	public class AddEmployee extends Constants{
		@Test
		public void addEmployeeTest() throws IOException, InterruptedException
		{
			String runMode=eo.getCellData(path2,0,2,2);
			if(runMode.equals("N"))
			{
				throw new SkipException("Add Emp test case skipped");
			}
			else
			{
				AddEmployeePage addemp=PageFactory.initElements(driver,AddEmployeePage.class);
				int rowCount=eo.getRowCount(path1,0);
				for(int i=1;i<=rowCount;i++)
				{
					Row r=eo.readRow(path1,0,i);
					addemp.menu.pim();
					Thread.sleep(6000);
					addemp.addEmployee.click();
					Thread.sleep(6000);
					addemp.addEmployee(r);
				}
			}
		}
	}

