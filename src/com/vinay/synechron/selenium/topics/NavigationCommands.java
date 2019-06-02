package com.vinay.synechron.selenium.topics;

public class NavigationCommands extends BasePage {

	public static void main(String[] args) {
		
		BasePage.openPage("http:\\www.google.com");
		driver.navigate().to("http:\\www.bing.com");	
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();		
		driver.close();

	}

}
