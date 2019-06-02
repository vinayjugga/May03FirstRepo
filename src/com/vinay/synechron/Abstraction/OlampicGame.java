package com.vinay.synechron.Abstraction;

public class OlampicGame {

	public Sport startGame ;
	
	public void startGame(Object game)
	{
		startGame.play();
		startGame.run();			
	}
	
	public static void main(String[] args) {
		
		OlampicGame findGame = new OlampicGame();
		findGame.startGame= new Cricket();		
		findGame.startGame(findGame.startGame);
				
		findGame.startGame= new FootBall();
		findGame.startGame(findGame.startGame);		

	}

}
