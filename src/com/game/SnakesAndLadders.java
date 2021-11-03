package com.game;

public class SnakesAndLadders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int position = 0;
		System.out.println(" Welcome player!! ");
		
		
		double dice = Math.floor( (Math.random() * 10) % 6 + 1); 
		System.out.println(" The dice was rolled to: " + dice);
		int option = (int)Math.floor(Math.random() * 3); 
		
		switch(option) {
		case 0: 
			System.out.println(" Player action: nothing");
			break;
		case 1: 
			System.out.println(" Player action: ladder");
			position += dice;
			break;
		case 2: 
			System.out.println(" Player action: snake");
			position -= dice;
			break;
						
		}
		
		System.out.println(" Current position: " + position);
	}

}
