package com.vinay.synechron.selenium.topics;

public class NavigationCommands extends BasePage {

	public static void main(String[] args) {
		
		BasePage.openPage("http:\\www.google.com");
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
