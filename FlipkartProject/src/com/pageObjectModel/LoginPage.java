package com.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basicOperations.BasicOperations;

public class LoginPage extends BasicOperations {

	
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement un;
	
	@FindBy(xpath="//input[@type='password']")
    private WebElement pw;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement login;
	
	@FindBy(xpath="//button[@class='_2ISNhP _3AOFWO']")
	private WebElement cancel;
	
	@FindBy(xpath="//span[.='Men']")
	private WebElement look;

//initialization of element
	
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//utilizations
	public void Username(String uin)
	{
		un.sendKeys(uin);
	}
	public void password(String pw1)
	{
		pw.sendKeys(pw1);
	}
	public void login() 
	{
		login.click();
	}
	public void cancel()
	{
		cancel.click();
	}
	public void browse() throws InterruptedException
	{
		 JavascriptExecutor js = ( JavascriptExecutor)driver;
		 Thread.sleep(5000);
    	 js.executeScript("window.scrollBy(0,500)");
    	 Thread.sleep(5000);
    	 JavascriptExecutor js1 = (JavascriptExecutor)driver;
    	 Thread.sleep(5000);
    	 js1.executeScript("window.scroll(0,-500)");
	}
	
	public void look()
	{
		look.click();
	}
}
