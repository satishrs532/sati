package com.basicOperations;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pageObjectModel.LoginPage;

public class BasicOperations implements ConstantValues
{
  public  static WebDriver driver;
    @BeforeMethod
    public void login() throws EncryptedDocumentException, IOException, InterruptedException
    {
    	System.setProperty(key,value);
    	driver = new ChromeDriver();
    	driver.get("http://www.flipkart.com");
    	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
    	String un = ExcelData.exceldata("Login1", 1,0);
    	String pw = ExcelData.exceldata("Login1", 1,1);
    	LoginPage lp = new LoginPage(driver);
        lp.Username(un);
    	lp.password(pw);
    	lp.login();
    	Thread.sleep(5000);
    	lp.browse();
		lp.look();
		Thread.sleep(5000);
		
    }
    @AfterMethod
    public static void logout() throws IOException
    {
    	TakeScreenShot.sreenshot();
    	driver.quit();
    }
}