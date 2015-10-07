package Sep14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Dropdwnlistwritedata {
	
	
	public static void main(String[] args) throws IOException, Throwable {
		FileInputStream f=new FileInputStream("E:\\Write.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyMozillaff");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		WebElement drop=driver.findElement(By.name("country"));
		List <WebElement> dropdown=drop.findElements(By.tagName("option"));
		
		for(int i=0;i<=dropdown.size();i++)
		{
			r=ws.createRow(i);
			c=r.createCell(0);
			c.setCellValue(dropdown.get(i).getText());
			dropdown.get(i).click();
			c=r.createCell(1);
			if(dropdown.get(i).isSelected())
			{
				c.setCellValue("Passed");
			}
			else
			{
				c.setCellValue("Failed");
			}
			FileOutputStream f1=new FileOutputStream("E:\\Work\\Read.xlsx");
			wb.write(f1);
			f1.close();
		}

	}
}


