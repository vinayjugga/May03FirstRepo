package com.vinay.synechron.collections;

import java.util.ArrayList;

public class ListArrayListEx {

	public static void main(String args[]){  
		
	      ArrayList<String> alist=new ArrayList<String>();  
	      alist.add("vinay");
	      alist.add("gopi");
	      alist.add("Hetal Shah");
	      alist.add("Sudheendra ");
	      alist.add("Yugandhar");
	      alist.add("Raghupathi");
	  
	      //displaying elements
	      System.out.println(alist);
	  
	      //Adding "Steve" at the fourth position
	      alist.add(3, "Steve");	  
	      //displaying elements
	      System.out.println(alist);
	      
	      alist.remove("vinay");
	      alist.remove(2);
	      System.out.println(alist);
	      
	      for(String str:alist)  {
	          System.out.println(str);  
	       } 
	      
	   }  

}
