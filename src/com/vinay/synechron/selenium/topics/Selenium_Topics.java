package com.vinay.synechron.selenium.topics;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Selenium_Topics {

	@Test
	public void googleTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/vinay.l/workspace/Selenium_example/server/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		SoftAssert a1 = new SoftAssert();
		driver.get("https://www.google.co.in");
		System.out.println(driver.getCurrentUrl());
		a1.assertEquals(driver.getCurrentUrl(), "https://www.google.co.in/");
		driver.findElement(By.id("lst-ib")).sendKeys("Vinay");
		driver.findElement(By.name("btnG")).click();
		
		driver.close();
	}

	@Test
	public void emptytest()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/vinay.l/workspace/Selenium_example/server/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://www.google.co.in");
		String linklist =driver.findElement(By.id("als")).getText();
		System.out.println(linklist);

	}

	@Test
	public void emptytest1()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/vinay.l/workspace/Selenium_example/server/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		SoftAssert a1 = new SoftAssert();
		driver.get("https://www.wellsfargo.com/");		

	}


	@Test
	public void countlinks()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/vinay.l/workspace/Selenium_example/server/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		SoftAssert a1 = new SoftAssert();
		driver.get("https://www.google.co.in");
		driver.findElement(By.id("lst-ib")).sendKeys("vinay");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);

		List<WebElement> countlinks = driver.findElements(By.xpath("//h3/a"));
		System.out.println("Number of links :="+countlinks.size());
		int n =countlinks.size();
		for(int i=0; i< countlinks.size(); i++)
		{
			System.out.println("liks are:="+countlinks.get(i).getAttribute("href"));
			countlinks =driver.findElements(By.xpath("//h3/a"));
		}

	}

	@Test
	public void mouseactions()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/vinay.l/workspace/Selenium_example/server/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		SoftAssert a1 = new SoftAssert();
		driver.get("https://www.wellsfargo.com/");
		Actions act1 = new Actions(driver);
		WebElement elemnt = driver.findElement(By.id("bankingTab"));
		act1.moveToElement(elemnt).perform();

		WebElement el1 = driver.findElement(By.linkText("Online Banking"));
		act1.moveToElement(el1).click().perform();
		//act1.perform();				
	}

	@Test
	public void dateselection()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/vinay.l/workspace/Selenium_example/server/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert alertobjt =driver.switchTo().alert();
		//driver.switchTo().alert().accept();
		alertobjt.accept();
		alertobjt.dismiss();
		driver.findElement(By.id("BE_flight_depart_date")).click();

		List<WebElement> listdate =driver.findElements(By.xpath("tdOff activeTD clsDateCell"));
		int n = listdate.size();
		System.out.println("Activate data of this month:="+n);

	}

	@Test
	public void gamillogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/vinay.l/workspace/Selenium_example/server/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://mail.google.com");
		driver.findElement(By.id("Email")).sendKeys("vinay.synechron@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("synechron123");
		driver.findElement(By.id("signIn")).click();		

		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='COMPOSE']")));
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2[div[text()='New Message']]"))));

		driver.findElement(By.xpath("//textarea[@aria-label='To']")).sendKeys("vinay.synechron@gmail.com");
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("abcd123");
		driver.findElement(By.xpath("//div[text()='Send']")).click();

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='vh']//span[@id='link_vsm']"))));
		driver.findElement(By.xpath("//div[@class='vh']//span[@id='link_vsm']")).click();

		String expectedSubject =driver.findElement(By.xpath("//h2[text()='abcd123']")).getText();
		System.out.println(expectedSubject);
		Assert.assertEquals(expectedSubject, "abcd123");

		driver.findElement(By.linkText("Inbox")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='Cp']//tr[1]")).isDisplayed());
		String color1 =driver.findElement(By.xpath("//a[@title='Sent Mail']")).getCssValue("color");	
		System.out.println("Beofore click:="+color1);
		driver.findElement(By.xpath("//a[@title='Sent Mail']")).click();
		String color =driver.findElement(By.xpath("//a[@title='Sent Mail']")).getCssValue("color");	
		System.out.println("After click :="+color);
		driver.findElement(By.linkText("Inbox")).click();
		driver.findElement(By.xpath("//div[@class='Cp']//td[1]")).click();

		driver.findElement(By.xpath("//div[@aria-label='Delete']")).click();
		driver.close();
	}		

	@Test
	public void countrowsandcoloumn()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/vinay.l/workspace/Selenium_example/server/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-table/");
		String structureheader="Taipei 101";
		List<WebElement> numberofRows=driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tr"));
		System.out.println("Number of Row:="+numberofRows.size());
		int i=1;
		for(WebElement row:numberofRows)
		{
			List<WebElement> numberofColomnheader =row.findElements(By.xpath("//th")) ;
			for(WebElement Colomnheader:numberofColomnheader)
			{
				//System.out.println(Colomnheader.getText());
				if(Colomnheader.getText().equals(structureheader))
				{
					String build=driver.findElement(By.xpath("//th[text()=\'"+structureheader+"']/..//td[4]")).getText();
					System.out.println("Year of build "+structureheader+":="+build);
				}

				i++;
			}

		}
	}
	
	@Test
	public void calenderselectdate()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/vinay.l/workspace/Selenium_example/server/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HashMap<String,Integer> month1 = new HashMap<String,Integer>();
		month1.put("December 2016", 12);
	
		String selectedMonthFrom="December 2016";
		String dateselectedFrom= "20" ;
		String selectedMonthTo="March 2017";
		String dateselectedTo= "25" ;
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.partialLinkText("Bengaluru")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.partialLinkText("Ahmedabad")).click();
		
		driver.findElement(By.name("ctl00$mainContent$txt_Fromdate")).click();
		//driver.findElement(By.linkText("Next")).click();
		String month=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText() ;
		System.out.println(month);
		
		while(true){
			if(month.contains(selectedMonthFrom))
			{
				break;
				
			}
			driver.findElement(By.linkText("Next")).click();
			month=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText() ;
		}		
		
		List<WebElement> dateselect = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for(WebElement date1:dateselect)
		{
			if(date1.getText().equals(dateselectedFrom))
					{
				date1.click();
				break;
					}
		}
		
		driver.findElement(By.name("ctl00$mainContent$txt_Todate")).click();
		month=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText() ;
		System.out.println(month);
		
		while(true){
			if(month.contains(selectedMonthTo))
			{
				break;
				
			}
			driver.findElement(By.linkText("Next")).click();
			month=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText() ;
		}		
		
		dateselect = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for(WebElement date1:dateselect)
		{
			if(date1.getText().equals(dateselectedTo))
					{
				date1.click();
				break;
					}
		}		
		
	}
	
	@Test
	public void gamilloginread()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/vinay.l/workspace/Selenium_example/server/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://mail.google.com");
		driver.findElement(By.id("Email")).sendKeys("vinay.synechron@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("synechron123");
		driver.findElement(By.id("signIn")).click();		

		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='COMPOSE']")));
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2[div[text()='New Message']]"))));
		String subject ="abcd123"+Math.random();
		//String subject ="Farewell";
		String sub =subject.substring(8);
		driver.findElement(By.xpath("//textarea[@aria-label='To']")).sendKeys("vinay.synechron@gmail.com");
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys(sub);
		driver.findElement(By.xpath(("//div[@aria-label ='Message Body']"))).sendKeys(subject);
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		
		/*if(driver.switchTo().alert() !=null)
		{
			driver.switchTo().alert().accept();
		}*/
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("gbqfq")).sendKeys(subject);
		driver.findElement(By.id("gbqfq")).submit();
		
		List<WebElement> inboxrows =driver.findElements(By.xpath("//div[@class='Cp']//tr"));
		System.out.println(inboxrows.size());
		System.out.println(inboxrows.get(0).getText());
		
		inboxrows.get(0).click();
		
		String body =driver.findElement(By.xpath("//div[@role='listitem']//div[@class='adn ads']")).getText() ;
		System.out.println("Bodycontent:="+body);
			
		driver.close();
	}		
	
	@Test
	public void getxpathtypes()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/vinay.l/workspace/Selenium_example/server/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.wellsfargo.com/");
		
		String linktext=driver.findElement(By.xpath("//li[text()='Personal']")).getText() ;
		System.out.println("linktext :="+linktext);
		
		String linktext1=driver.findElement(By.xpath("//div[normalize-space()='Personal Small Business Commercial']")).getText() ;
		System.out.println("linktext1:= "+linktext1);	
		
		String linktext2=driver.findElement(By.xpath("//p[normalize-space()='Need online access?']")).getText() ;
		System.out.println("linktext2:= "+ linktext2);	
		
	}
	
	@Test
	public void dragandDrop()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/vinay.l/workspace/Selenium_example/server/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://demoqa.com/draggable/");
		
		WebElement from =driver.findElement(By.id("draggable")) ;
		Actions act = new Actions(driver);
		act.dragAndDropBy(from, 387, 75).perform();
			
	}
	
	@Test
	public void listboxselection()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/vinay.l/workspace/Selenium_example/server/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.wellsfargo.com/");
		
		WebElement listbox =driver.findElement(By.id("destination"));
		Select select = new Select(listbox);
		//select.selectByIndex(3);
		
		select.deselectByValue("MessageAlerts");
						
	}
	
	@Test
	public void statleElementException()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/vinay.l/workspace/Selenium_example/server/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.seleniumhq.org/projects/");	
		/*
		try{
		List<WebElement> linklist =driver.findElements(By.xpath("//div[@class='bigMenu']//h3/a"));
		System.out.println("size:="+linklist.size());
		for(WebElement links: linklist)
		{
			System.out.println(links.getText());
		
			links.click();
			System.out.println(driver.getTitle());
			driver.navigate().back();
		
			
		}
		}
		catch(StaleElementReferenceException e)
		{
			e.printStackTrace();
			System.out.println("Catched the Exception");
		}
		*/
		List<WebElement> linklist1 =driver.findElements(By.xpath("//div[@class='bigMenu']//h3/a"));
		System.out.println("size:="+linklist1.size());
		int i=linklist1.size();
		for(int j=0;j<i;j++)
		{
			System.out.println(linklist1.get(j).getText());		
			linklist1.get(j).click();
			System.out.println("Title of the page No:= "+ (j+1)+" "+ driver.getTitle());
			driver.navigate().back();
			linklist1 =driver.findElements(By.xpath("//div[@class='bigMenu']//h3/a"));		
			
		}
						
	}
	
	@Test
	public void getistqbexamtopics() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/vinay.l/workspace/Selenium_example/server/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://istqbexamcertification.com/");
		
		/*List<WebElement> istqbtopics = driver.findElements(By.xpath("//section[@id='advanced_text-4']//td/a"));
		for(WebElement topics: istqbtopics)
		{
			topics.click();
			driver.navigate().back();
			Thread.sleep(5000);
			
			istqbtopics = driver.findElements(By.xpath("//section[@id='advanced_text-4']//td/a"));
		}*/
		
		driver.findElement(By.xpath("(//td[a[normalize-space(.)='Internationalization testing and Localization testing']])[1]")).click();
		
		
		
	}

}	


