package com.vinay.synechron.selenium.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WellsFargoTest extends BasePage{

	public static void main(String[] args) {
		
		BasePage.openPage("https://www.wellsfargo.com/");
		WebElement element =driver.findElement(By.id("tabNavSmallBusiness")) ;
		WebElement element1 =driver.findElement(By.name("tabNavSmallBusiness")) ;
		WebElement element2 =driver.findElement(By.linkText("Small Business")) ;
		WebElement element11 =driver.findElement(By.partialLinkText("Small Business")) ;
		WebElement element3 =driver.findElement(By.xpath("//a[text()='Small Business']")) ;
		WebElement element4 =driver.findElement(By.xpath("//a[@id ='tabNavSmallBusiness']")) ;
		WebElement element5 =driver.findElement(By.xpath("//a[@name='tabNavSmallBusiness']")) ;
		WebElement element6 =driver.findElement(By.cssSelector("a[name='tabNavSmallBusiness']")) ;
		WebElement element7 =driver.findElement(By.cssSelector("a[id='tabNavSmallBusiness']")) ;
		//WebElement element8 =driver.findElement(By.tagName("a"));
		WebElement element8 =driver.findElement(By.xpath("//a[@href='/biz/']")) ;
		WebElement element9 =driver.findElement(By.xpath("//a[@title='Small Business. Serving businesses with up to $5 million in annual revenue.']")) ;
		WebElement element10 =driver.findElement(By.xpath("//a[contains(@title,'Small Business. Serving businesses']")) ;
				
		

	}

}
