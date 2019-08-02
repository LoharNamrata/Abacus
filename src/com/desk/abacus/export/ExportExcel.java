package com.desk.abacus.export;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExportExcel {
	@SuppressWarnings("deprecation")
	public void exportExcelFile() {
		try
		{
			HSSFWorkbook workbook = new HSSFWorkbook();
		    HSSFSheet sheet = workbook.createSheet("lawix10");
		    
		    HSSFRow rowhead = sheet.createRow((short) 0);
		    rowhead.createCell((short) 0).setCellValue("Employee ID");
		    rowhead.createCell((short) 1).setCellValue("Employee Name");
		    rowhead.createCell((short) 2).setCellValue("Employee Email");
		    rowhead.createCell((short) 3).setCellValue("Employee Password");
		    rowhead.createCell((short) 4).setCellValue("Employee Cell");
		    rowhead.createCell((short) 5).setCellValue("Employee Salary");
		    
		    
		    String file = "D:\\ABACUS\\test.xls";
		    FileOutputStream fileOut = new FileOutputStream(file);
		    workbook.write(fileOut);
		}
		catch(Exception e)
		{
			
		}
	}
}
