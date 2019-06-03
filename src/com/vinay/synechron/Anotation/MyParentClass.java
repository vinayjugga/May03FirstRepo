package com.vinay.synechron.Anotation;

class MyParentClassEx {
	
	

    public void justaMethod() {
        System.out.println("Parent class method Shilpi");
    }
    
    @Deprecated
    public void display()
    {
    	System.out.println("this method is dpricatied");
    }
}


public class MyParentClass extends MyParentClassEx {

  @Override
    public void justaMethod() {
	   //super.justaMethod();
        System.out.println("Child class method abasdf");
    }
  
  public void display1()
  {
	  super.justaMethod();
	  System.out.println("Child method");
  }
    
   
    
    public static void main(String args[])
    {
    	    	
    	/*MyParentClass m2 = new MyParentClass();
    	m2.justaMethod();
    	*/
    	MyParentClassEx onj = new MyParentClass() ;
    	onj.justaMethod();
    	
    //	m2.display();
    	
		@SuppressWarnings("unused")
		int i =100 ;
		
		String obj3 ="java";
    	
    }
    
    
}
