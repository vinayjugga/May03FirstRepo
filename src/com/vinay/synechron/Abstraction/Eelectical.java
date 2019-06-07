package com.vinay.synechron.Abstraction;

public class Eelectical {
	
	public Fan fobj ;
	public Sport obj1 ;
	
	
	public void SellingFan(Object obj)
	{
		fobj.off();
		fobj.on();
	}
	
	public void startSports(Object ob)
	{
		obj1.play();
		obj1.run();
	}

	public static void main(String[] args) {
		
		Eelectical eleobj = new Eelectical() ;
		eleobj.fobj= new Usha() ;
		
		eleobj.SellingFan(eleobj.fobj);
		
		
		

	}

}
