package com.ohrm.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {
	
	public int getRowCount(String path,int sheetno) throws IOException
	{
		FileInputStream f=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheetAt(sheetno);
		int rowcount=ws.getLastRowNum();
		return rowcount;
	}
	
	public Row getRowData(String path,int sheetno,int rowno) throws IOException
	{
		FileInputStream f=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheetAt(sheetno);
		Row r=ws.getRow(rowno);
		return r;
		
	}
	
	public String getCellData(String path,int sheetno,int rowno,int colno) throws IOException
	{
		FileInputStream f=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheetAt(sheetno);
		String data=ws.getRow(rowno).getCell(colno).getStringCellValue();
		return data;
	}
	
	

}
