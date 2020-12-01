package com.puopolo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		String Playagain = "n"; //Creates "Playagain?" variable

		do {// Can make a do while loop here to restart game if the user wants to play again. --------------------

			Computer cpu = new Computer();
			Code solution = cpu.makeSolution();
			Board gameBoard = new Board(10, solution);
			int count = 0;
			do {

				System.out.println("Valid Colors -> (R, G, B, Y, P, O)");
				System.out.println("Guess: " + (count + 1));
				User User = new User();
				gameBoard.printTextBoard();
				System.out.print("Enter Guess: ");	// Let the player start guessing
				String UserGuess = myObj.nextLine();
				Code UserGuessCode = User.MakeGuess(UserGuess);
				gameBoard.AddGuess(UserGuessCode);
				System.out.println(UserGuessCode);
				count++;
				//System.out.println(gameBoard.DoesitMatch()); // for me to check if it matches
			} while (gameBoard.Getguesses() < 10 && (gameBoard.DoesitMatch() == 0));

			if (gameBoard.DoesitMatch() == 1)
			{
				System.out.println("You win");
			}

			if (gameBoard.DoesitMatch() == 0)
			{
				System.out.println("You Loose!");
			}

			System.out.println("Would you like to play again?   (I will do this at some later point)");

			String WanttoPlayagain = myObj.nextLine();
			Playagain=WanttoPlayagain;		// Set the end of the do while loop here. Ask if the user would like to play again. ------------------

		}while (Playagain.equals("Y"));


	}

}
