package com.vinay.synechron.selenium.topics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;

public class JavaExecutorEx extends BasePage  {

	public static void main(String[] args) {
		
		Alert aobj = driver.switchTo().alert();
		aobj.accept();
		aobj.dismiss();
		
		String parentwindow = driver.getWindowHandle() ;		
		Set<String> l1= driver.getWindowHandles() ;		
		Iterator a1 =l1.iterator() ;
				
		while(a1.hasNext())
		{
			String nextwindow = a1.next().toString();
			driver.switchTo().window(nextwindow) ;			
			
		}
		
		
		
		

	}

}
