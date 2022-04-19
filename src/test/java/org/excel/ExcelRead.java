package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		File local = new File("C:\\Users\\karthikeyan\\eclipse-workspace\\Mavennew\\Book1.xlsx");

		FileInputStream fi = new FileInputStream(local);

		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");

		Row r = s.getRow(2);
		
		Cell c = r.getCell(1);
		System.out.println(c);
		int NumberOfRows = s.getPhysicalNumberOfRows();
		System.out.println(NumberOfRows);
		int NumberOfCells = r.getPhysicalNumberOfCells();
		System.out.println(NumberOfCells);
		
		for(int i=0;i< s.getPhysicalNumberOfRows();i++) {
			Row row = s.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
			}
		}
		
		
		
	}
}
