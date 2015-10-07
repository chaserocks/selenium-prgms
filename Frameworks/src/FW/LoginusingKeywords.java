package FW;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LoginusingKeywords {
		@Test
		public void loginTest() throws InterruptedException, IOException{
		KeywrdGmaillgnusingxlfile keys=new KeywrdGmaillgnusingxlfile(); // u can also use single \ fwrd slash instead // double back slash
		FileInputStream f=new FileInputStream("E:/Mystuff/SELINUMWS/Frameworks/src/com/mbc/excelfiles/LoginKeywordxlfile.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		row.next();
		while(row.hasNext())
		{
			Row r=row.next();
			String Action=r.getCell(3).getStringCellValue();
			if(Action.equals("launchBrowser"))
			{
				keys.launchBrowser();
			}
			else if(Action.equals("navigate"))
			{
				keys.navigate();
			}
			else if(Action.equals("enterUsername"))
			{
				keys.enterUsername();
			}
			else if(Action.equals("Next"))
			{
				keys.clickNext();
				Thread.sleep(1000);
			}
			else if(Action.equals("enterPassword"))
			{
				keys.enterPassword();
			}
			else if(Action.equals("Login"))
			{
				keys.clickSignin();
			}
	     }
	   }
	}

