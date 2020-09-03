package com.testScripts;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.basicOperations.BasicOperations;
import com.basicOperations.ExcelData;
import com.pageObjectModel.HomePage;

public class SearchingMobile  extends BasicOperations
{
@Test
public static void tv() throws EncryptedDocumentException, IOException, InterruptedException 
{
	String expected = driver.getTitle();
	String actual = "Onlin Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	//Assert.assertEquals(expected,actual);
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(actual, expected);
	HomePage hp = new HomePage(driver);
	String search_value=ExcelData.exceldata("HomeScreen", 1, 0);
	hp.search(search_value);
	hp.button();
	Thread.sleep(5000);
	hp.poco();
	Set<String> winid = driver.getWindowHandles();
	for(String wh:winid)
	{
		driver.switchTo().window(wh);
	}
	Thread.sleep(5000);
	hp.cart();
}
}

