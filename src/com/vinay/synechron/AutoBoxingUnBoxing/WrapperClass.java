package com.vinay.synechron.AutoBoxingUnBoxing;

public class WrapperClass {	
		
		public void display(Boolean status)
		{
			System.out.println("boolean primitive data type to Boolean object using Wrapper classs: "+status);
		}
		/*public void display(boolean status)
		{
			System.out.println("Primitive data type boolean value : " +status );
		}*/

		public static void main(String[] args) {
			
			boolean s1 = true ;
			WrapperClass autoboxing = new WrapperClass();
			autoboxing.display(s1);
			

		}


}
