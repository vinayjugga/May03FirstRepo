package com.vinay.synechron.programs;

public class BankApp {
	
	int balance ;
	void balance()
	{
		System.out.println("Balance in your save account: ="+balance);
	}
	
	void deposit(int depositAmount)
	{
		balance = balance + depositAmount ;
		System.out.println("DepositAmount:= "+depositAmount);
		System.out.println("Current Balance:= " + balance);
	}
	
	void withDraw(int withdrawAmount)
	{
		if(withdrawAmount<=balance && withdrawAmount >0)
		{
			balance =balance-withdrawAmount;
			System.out.println("Withdraw Amount:= " +withdrawAmount);
			System.out.println("Current Balce after wihdraw:="+balance);
		}
		else
		{
			System.out.println("Your Account has insuffeient Balace");

		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome to WellsFargo Bank");
		BankApp vinayaccount = new BankApp() ;
		vinayaccount.deposit(5000);
		vinayaccount.balance();
		vinayaccount.withDraw(6000);		
		vinayaccount.withDraw(4000);
		vinayaccount.balance();
		
		System.out.println("-----Raghu-------");
		BankApp raghuAccount = new BankApp() ;
		raghuAccount.deposit(10000);
		raghuAccount.balance();
		raghuAccount.withDraw(5000);
		raghuAccount.balance();
		
		

	}

}
