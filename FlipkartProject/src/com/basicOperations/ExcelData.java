package com.basicOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData implements ConstantValues
{
    public static String exceldata(String sheet_name,int row_no,int column_no) throws EncryptedDocumentException, IOException
    {
    	FileInputStream fis=new FileInputStream(Excel_path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet(sheet_name);
		Row r=s.getRow( row_no);
	    Cell c=r.getCell(column_no);
		String Val=c.getStringCellValue();
		System.out.println(Val);
		return Val;
	
    }
}
