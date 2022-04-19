package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelGetSet {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\karthikeyan\\eclipse-workspace\\Mavennew\\Book1.xlsx");
		
		FileInputStream fi=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fi);	
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(1);
		//create cell
		Cell newc = r.createCell(7);
		newc.setCellValue("new cell");
		//cell type
		String CellValue = c.getStringCellValue();
	if(CellValue.equals("DME")) {
		c.setCellValue("VIKARAM");
		System.out.println(c);
	}
	FileOutputStream fos=new FileOutputStream(f);
	w.write(fos);
	System.out.println("done");
	}
	


}
