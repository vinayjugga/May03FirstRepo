package com.vinay.synechron.selenium.topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateBack {

	public static void main(String[] args) {
		
		WebDriver driver =new FirefoxDriver();
		driver.get("http:\\www.google.com");
		driver.navigate().to("http:\\www.bing.com");
		driver.navigate().to("http:\\www.gmail.com");
		driver.navigate().back();
		String utl = driver.getCurrentUrl();
		if(utl.contains("bing")){
			System.out.println(utl);
			System.out.printf("Back page %s loaded successfully",utl);
		}else{
			System.out.println("bing page is not loaded");
		}
		driver.close();


	}

}
