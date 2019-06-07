package com.vinay.synechron.ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public void display() 
	{
		File f1 = new File("c:\tempt.txt");
		//Thread.sleep(1000);
	}

	public static void main(String[] args)  {
		
		
			try {
				FileInputStream file = new FileInputStream("c:\temp.txt");
				System.out.println();
			} 
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		

		
	}

}
