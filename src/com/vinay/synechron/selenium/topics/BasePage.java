package com.vinay.synechron.selenium.topics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	
	public static WebDriver driver ;
	public static String url ;
	public static String currnetpath =System.getProperty("user.dir");
	
	public static void openPage(String url)
	{
		System.setProperty("webdriver.chrome.driver",currnetpath+"\\servers\\chromedriver.exe");
		driver = new ChromeDriver() ;
		driver.get(url);		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	
}
