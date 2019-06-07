package com.vinay.synechron.selenium.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetAttributeOFValue extends BasePage {

	public static void main(String[] args) {
		BasePage.openPage("https://www.wellsfargo.com/");
		String tooltip =driver.findElement(By.id("tabNavSmallBusiness")).getAttribute("title");
		System.out.println(tooltip);
		
		String name =driver.findElement(By.id("tabNavSmallBusiness")).getAttribute("name");
		System.out.println(name);	
		
		/*WebDriverWait wait = new WebDriverWait(driver, 60) ;
		wait.until(ExpectedConditions.titleIs("Online Banking - Online Savings & Checking Accounts - Wells Fargo"));
		*/
		WebElement accountsumListBox = driver.findElement(By.id("destination"));
		Select obj = new Select(accountsumListBox);
		obj.selectByIndex(4);
		
		
		
		
			
	}

}
