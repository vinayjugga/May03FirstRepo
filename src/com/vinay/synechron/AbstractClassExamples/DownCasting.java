package com.vinay.synechron.AbstractClassExamples;
class WebDriver2 
{
	public void test1() 
	{
		System.out.println("test1");
	}
	
	public void test2()
	{
		System.out.println("test2");
	}
	
	
	
}
public class DownCasting extends WebDriver2 {
	
	public void test3()
	{
		System.out.println("test3");
	}

	public static void main(String[] args) {

		WebDriver2 driver = new DownCasting();
		driver.test1();
		driver.test2();
		
		DownCasting dowbobj = (DownCasting)driver ;
		dowbobj.test3();
		

	}

}
