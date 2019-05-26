package com.vinay.synechron.nonStaticMethods;
/* What is the sequence of the execution of the blocks */
public class DifferentBlocks {	
		
		public int i; // This is Non Static variable
		
		static {
			System.out.println("This is static block");
		}
		
		{
			System.out.println("This is ananuymous block");
		}
		
		DifferentBlocks() {
			
			System.out.println("This is constructor");
		}
		void method() {
			
			System.out.println("This is method");
		}
		
		public static void main(String[] args) {
			DifferentBlocks obj = new DifferentBlocks(); 
			obj.method();			
			
		}

}
