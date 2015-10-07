package FW;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Datadriventesting2 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
	}
	@Test
	public void linkTest() throws IOException
	{
		FileInputStream f=new FileInputStream("E:\\Mystuff\\SELINUMWS\\Frameworks\\src\\com\\mbc\\excelfiles\\DataDrivenTesting2.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook(f);
        XSSFSheet ws=wb.getSheet("Sheet1");
        Iterator<Row> row=ws.iterator();
        row.next();
        while(row.hasNext());
        {
        	Row r=row.next();
        	driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
        	driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
        	driver.findElement(By.name("phone")).sendKeys(r.getCell(2).getStringCellValue());
        	driver.findElement(By.name("userName")).sendKeys(r.getCell(3).getStringCellValue());
        	driver.findElement(By.name("address")).sendKeys(r.getCell(4).getStringCellValue());
        	driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
        	driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
        	driver.findElement(By.name("postalcode")).sendKeys(r.getCell(7).getStringCellValue());
        	driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
        	driver.findElement(By.name("email")).sendKeys(r.getCell(9).getStringCellValue());
        	driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
        	driver.findElement(By.name("confirm password")).sendKeys(r.getCell(11).getStringCellValue());
        	driver.findElement(By.name("register")).click();
        	String x=driver.findElement(By.xpath("")).getText();
        	if(x.contains(r.getCell(9).getStringCellValue()))
        	{
        		r.createCell(12).setCellValue("Passed");
        	}
        	else
        	{
        		r.createCell(12).setCellValue("Failed");
        	}
        	driver.navigate().back();
        }
        FileOutputStream f1=new FileOutputStream("E:\\Mystuff\\SELINUMWS\\Frameworks\\src\\com\\mbc\\resultexcelfiles\\DataDrivenTesting2.xlsx");
        wb.write(f1);
        f1.close();
        driver.quit();
   	}
        	
 }
