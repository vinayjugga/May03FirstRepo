package com.vinay.synechron.selenium.topics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindows extends BasePage {

	public static void main(String[] args) {
		
		BasePage.openPage("http://www.naukri.com/");
		// It will return the parent window name as a String
		String mainWindow=driver.getWindowHandle();
		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> set =driver.getWindowHandles();
		// Using Iterator to iterate with in windows
		Iterator<String> itr= set.iterator();
		while(itr.hasNext()){
			String childWindow=itr.next();
			// Compare whether the main windows is not equal to child window. If not equal, we will close.
			if(!mainWindow.equals(childWindow)){
				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				driver.close();
			}
		}
		
		//BasePage.openPage("http://www.naukri.com/");
		driver.findElement(By.xpath("//div[@id='geoLocPopUp']//span[@id='block']")).click();
		List<WebElement> numberframes= driver.findElements(By.tagName("//iframe"));
		System.out.println(numberframes.size());
	}


}
