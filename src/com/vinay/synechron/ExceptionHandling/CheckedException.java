package com.vinay.synechron.ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public void display() throws Exception
	{
		File f1 = new File("c:\tempt.txt");
		Thread.sleep(1000);
	}

	public static void main(String[] args) {
		
		try {
			FileInputStream file = new FileInputStream("c:\temp.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
