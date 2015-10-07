package FW;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class GmailLoginusingReflections {
	KeywrdGmaillgnusingxlfile keys=new KeywrdGmaillgnusingxlfile();
	Method[] methods=keys.getClass().getMethods();
	@Test
	public void loginTest() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
	FileInputStream f=new FileInputStream("E:\\Mystuff\\SELINUMWS\\Frameworks\\src\\com\\mbc\\excelfiles\\LoginKeywordxlfile.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet ws=wb.getSheet("Sheet1");
	Iterator<Row> row=ws.iterator();
	row.next();
	while(row.hasNext())
	{
		Row r=row.next();
		String Action=r.getCell(3).getStringCellValue();
		executeMethods(Action);
		}
	}
public void executeMethods(String Action) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
{
	for(int i=0;i<=methods.length;i++)
	{
		if(Action.equals(methods[i].getName()))
		{
			methods[i].invoke(keys);
			break;
		}
	  }
   }
}
