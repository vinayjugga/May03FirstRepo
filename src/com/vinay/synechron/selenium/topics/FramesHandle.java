package com.vinay.synechron.selenium.topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FramesHandle extends BasePage{

	public static void main(String[] args) {

		BasePage.openPage("http://www.naukri.com/");
		List<WebElement> numberframes= driver.findElements(By.tagName("//iframe"));
		System.out.println(numberframes.size());
		/*
		 * driver.switchTo().frame(0); driver.switchTo().frame(1);
		 * driver.switchTo().defaultContent();
		 */

	}

}
