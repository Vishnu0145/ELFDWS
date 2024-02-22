package com.Demoworkshop.GenericLibraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead implements FrameworkConstants{

	public static String readStringValue(String sheetName,int row, int cell) throws EncryptedDocumentException, IOException {
		File file=new File(EXCEL_PATH);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		return sheet.getRow(row).getCell(cell).toString();
	}

	public static double readNumericValue(String sheetName,int row, int cell) throws EncryptedDocumentException, IOException {
		File file=new File(EXCEL_PATH);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		return sheet.getRow(row).getCell(cell).getNumericCellValue();
	}

	public static  boolean readBooleanValue(String sheetName,int row, int cell) throws EncryptedDocumentException, IOException {
		File file=new File(EXCEL_PATH);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		return sheet.getRow(row).getCell(cell).getBooleanCellValue();
	}

	public static Date readDataValue(String sheetName,int row, int cell) throws EncryptedDocumentException, IOException {
		File file=new File(EXCEL_PATH);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		return sheet.getRow(row).getCell(cell).getDateCellValue();
	}




	public static String[][] multipleRead() throws Throwable, IOException  
	{
		File file = new File(EXCEL_PATH);
		FileInputStream fis=new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Credentials");
		int rowSize=sh.getPhysicalNumberOfRows();
		int colSize=sh.getRow(1).getPhysicalNumberOfCells();
		String [][] data=new String [rowSize][colSize];

		for (int i = 0; i < rowSize; i++) 
		{
			for (int j = 0; j < colSize; j++) 
			{
				data[i][j]=sh.getRow(i).getCell(j).toString();
			}

		}
		for (int i = 1; i < rowSize; i++) 
		{
			for (int j = 0; j < colSize; j++) 
			{
				System.out.println(data[i][j]);
			}

		}
		return data;
	}

	public static  String[][] MultipleR(String sheetName) throws Throwable, IOException {
		File file = new File(EXCEL_PATH);
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		int rowNumber = sheet.getPhysicalNumberOfRows();

		int collNumber = sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] data = new String[rowNumber-1][collNumber];
		for (int i = 0; i < rowNumber-1; i++) {
			for (int j = 0; j < collNumber; j++) {
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
				System.out.println(data[i][j]);
			}
			
		}
		
		return data;

	}
}
//public static void singleRead() throws Throwable {
//	File file = new File(EXCEL_PATH);
//	FileInputStream fis=new FileInputStream(file);
//	Workbook wb = WorkbookFactory.create(fis);
//	Sheet sh = wb.getSheet("Credentials");
//	int numRows = sh.getPhysicalNumberOfRows();
//	 int cellNum = sh.getRow(0).getPhysicalNumberOfCells();
//	Row row = sh.getRow(0);
//	Cell cell = row.getCell(0);
//	System.out.println(cell.toString());
//	 System.out.println(numRows);
//	 System.out.println(cellNum);
//}




//
//for (int i =0 ; i < rowNumber-1; i++) {
//	for (int j = 0; j < collNumber; j++) {
//System.out.println(data[i][j]);

