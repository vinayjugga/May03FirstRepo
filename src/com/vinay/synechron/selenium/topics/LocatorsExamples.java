package com.vinay.synechron.selenium.topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorsExamples extends BasePage{

	public static void main(String[] args) throws InterruptedException {
		
		BasePage.openPage("https://www.google.co.in/");		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());	
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("selenium");	
		Thread.sleep(2000);
		List<WebElement> prepoplatedSearch = driver.findElements(By.cssSelector("ul[role='listbox']"));		
		for(WebElement el: prepoplatedSearch)
		{
			System.out.println(el.getText());
			
		}
		System.out.println(prepoplatedSearch.size());
		driver.close();

	}

}
