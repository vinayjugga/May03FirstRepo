package com.vinay.synechron.selenium.topics;

public class LocatorsExamples extends BasePage{

	public static void main(String[] args) {
		
		BasePage.openPage("https://www.google.co.in/");		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());	
		//System.out.println(driver.getPageSource());
		

	}

}
