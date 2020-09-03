package com.basicOperations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenShot extends BasicOperations
{
	 public static void sreenshot() throws IOException
	{
	 TakesScreenshot ts = (TakesScreenshot)driver;
   	 File f1 = ts.getScreenshotAs(OutputType.FILE);
   	 File f2 = new File("c://takescreenshot//flipkart,jpeg");
   	 FileUtils.copyFile(f1, f2);
   	 
}}
