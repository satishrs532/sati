package com.testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.basicOperations.BasicOperations;
import com.basicOperations.ExcelData;
import com.pageObjectModel.HomePage;

public class SearchingTv extends BasicOperations
{
@Test
public static void tv() throws EncryptedDocumentException, IOException 
{
	HomePage hp = new HomePage(driver);
	String search_value=ExcelData.exceldata("HomeScreen", 2, 0);
	hp.search(search_value);
	hp.button();
}
}
