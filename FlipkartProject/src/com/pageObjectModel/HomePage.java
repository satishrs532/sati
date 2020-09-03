package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	 @FindBy(xpath="//input[@type='text']")
     private WebElement search;
     
     @FindBy(xpath="//button[@class='vh79eN']")
     private WebElement button;
     
     @FindBy(xpath="//div[text()='POCO M2 Pro (Out of the Blue, 64 GB)']")
     private WebElement poco;
     
     @FindBy(xpath="//span[text()='Cart']")
     private WebElement cart;
     
     public HomePage(WebDriver driver)
     {
  	   PageFactory.initElements(driver, this);
     }
     
     public void search(String value)
     {
  	   search.sendKeys(value);
  	   
     }
     public void button()
     {
  	   button.click();
     }
     public void poco()
     {
    	 poco.click();
     }
     public void cart()
     {
  	   cart.click();
     }

}
