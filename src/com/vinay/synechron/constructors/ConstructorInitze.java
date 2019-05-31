package com.vinay.synechron.constructors;

import com.vinay.synechron.Acess_Modifiers.DefaultModifier;
//import com.vinay.synechron.Acess_Modifiers.obj;

public class ConstructorInitze {

	int modelno ;
	String modelName ;
	double costmobile ;
	
	ConstructorInitze(int modelno, String modelName, double costmobile)
	{
		this.modelno =modelno ;
		this.costmobile=costmobile;
		this.modelName = modelName;
		display();
	}
	
	void display()
	{
		System.out.println("Modleno:="+modelno +"Modlename:="+modelName+ "MobileCost:="+costmobile);
	}

	public static void main(String[] args) {
		
		ConstructorInitze fourty40 = new ConstructorInitze(920, "Nokia Lumia" , 20000);
		//fourty40.display();

		//outside of the package not allowed for default modfieres
		/*DefaultModifier obj = new DefaultModifier() ;
		obj.display();*/
		
	}

}
