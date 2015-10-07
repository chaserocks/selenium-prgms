package Sep14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwritedata {

		public static void main(String[] args) throws IOException  {
			FileInputStream f=new FileInputStream("E:\\Work\\Read.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(f);
			XSSFSheet ws=wb.getSheet("Sheet1");
			// Modify an existing cell
				Row r=null;
				Cell c=null;
				r=ws.getRow(0);
				c=r.getCell(1);
				c.setCellValue("mbchhhh");
				//Create a new cell in an existing row and write into it
				r=ws.getRow(1);
				c=r.createCell(2);
				c.setCellValue("the");
				//Create a new row and create a new cell and write into it
				r=ws.createRow(4);
				c=r.createCell(0);
				c.setCellValue("nice");
				//To save the File
				FileOutputStream f1=new FileOutputStream("E:\\Work.xlsx");
				wb.write(f1);
				f1.close();
		}
	}

