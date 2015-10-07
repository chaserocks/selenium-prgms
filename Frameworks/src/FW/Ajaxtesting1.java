package FW;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ajaxtesting1 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://care.ideacellular.com");
		}
	@Test
	public void linkTest() throws IOException, Throwable
	{
		FileInputStream f=new FileInputStream("E:\\Mystuff\\SELINUMWS\\Frameworks\\src\\com\\mbc\\excelfiles\\ajaxtest.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook(f);
        XSSFSheet ws=wb.getSheet("Sheet1");
        Iterator<Row> row=ws.iterator();
        row.next();
        while(row.hasNext());
        {
        	Row r=row.next();
        	String phno=r.getCell(0).getStringCellValue();
        	driver.findElement(By.name("mobile number")).clear();
        	driver.findElement(By.name("mobile number")).sendKeys(phno);
        	driver.findElement(By.name("amount paid")).click();
        	Thread.sleep(1000);
        	//Xpath of the Ajax msg (error msg under the phne text field)
        	WebElement ajax=driver.findElement(By.xpath("//*[@id='errorHolder']/label"));
        	String actajax=null;
        	if(ajax.getText().isEmpty())
        	{
        		actajax="No Ajax";
        	}
        	else
        	{
        		actajax=ajax.getText();
        	}
       r.createCell(2).setCellValue(actajax);
       String expajax=r.getCell(1).getStringCellValue();
       if(actajax.equals(expajax))
       {
    	   r.createCell(3).setCellValue("Passed");
       }
       else
       {
    	   r.createCell(3).setCellValue("Failed");
       }
       FileOutputStream f1=new FileOutputStream("E:\\Mystuff\\SELINUMWS\\Frameworks\\src\\com\\mbc\\resultexcelfiles\\ajaxtest.xlsx");
       wb.write(f1);
       f1.close();
       driver.quit();
       }
        }
}
