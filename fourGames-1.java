/*
 * Aditya Yadav
 * 9/21/2017
 * Current Version
 * 
 * Game 1
 * Get users choice for rock or paper or scissor by assigning rock to 0, paper to 1, and scissor to 2
 * Generate a random number between 0 and 2 and use that as the computer choice
 * Use RPS rules to see who won and display the result
 * 
 * Game 2
 * Tell user that the computer is generating a value
 * Get computer to generate a value between specified range
 * Ask user to guess value and put that value into scanner
 * Compare that value with the random value generate 
 * Display result
 * 
 * Game 3
 * Too much psuedocode
 * 
 * Game 4
 * Assign integers for interest rate, initial amount, interest amount and total amount
 * Get the user's initial amount and interest rate in decimal
 * Calculate interest amount (Initial amount times interest rate and total (Add interest amount to initial amount)
 * Display result
 */
package assignment1;

import java.util.*;

public class fourGames {
	static Scanner sc = new Scanner(System.in);
	static Random random = new Random();

	public static void main(String[] args) {
		// Ask for game choice
		System.out.println("1: Rock Paper Scissor Game");
		System.out.println("2: Guessing Game");
		System.out.println("3: Calculator Game");
		System.out.println("4: Interest Amount Game");
		// Get user choice; create an int variable for choice
		int choice = sc.nextInt();
		// Use user choice to start selected game

		// User chooses Rock Paper Scissor
		if (choice == 1) {
			System.out.println("You chose the Rock Paper Scissor Game");
			// Create variables for user choice and computer choice
			int userChoice, computerChoice;
			System.out.println("Enter your move (0 = Rock, 1 = Paper, 2 = Scissor): ");

			// Get users choice
			userChoice = sc.nextInt();

			// Get computer choice
			computerChoice = random.nextInt(3);

			// Check if users choice is valid or not
			if (userChoice < 0 || userChoice > 2) {
				System.out.println("Invalid choice, please enter a valid number.");
				System.exit(0);
			}
			if (userChoice == computerChoice) {
				System.out.println("It's a tie.");
				System.exit(0);
			}
			// User is Rock
			if (userChoice == 0) {
				if (computerChoice == 1) {
					System.out.println("You chose rock and the computer chose paper. Computer wins");
				} else if (computerChoice == 2) {
					System.out.println("You chose rock and the computer chose scissor. You win");
				}
			}
			// User is Paper
			else if (userChoice == 1) {
				if (computerChoice == 0) {
					System.out.println("You chose paper and the computer chose rock. You win");
				} else if (computerChoice == 2) {
					System.out.println("You chose paper nand the computer chose scissor. Computer wins");
				}
			}
			// User is Scissor
			else if (userChoice == 2) {
				if (computerChoice == 0) {
					System.out.println("You chose scissor and the computer chose rock. You lose");
				} else if (computerChoice == 1) {
					System.out.println("You chose scissor and the computer chose paper. You win");
				}
			}
		}
		// User chooses guessing game
		else if (choice == 2) {
			System.out.println("You chose the Guessing Game");
			// Create integers for user choice and computer choice
			int userChoice, computerChoice;

			// Tell user that the computer is generating a random integer
			System.out.println("The computer generated a random integer");

			// Get random value for computer choice
			computerChoice = random.nextInt(10) + 1;
			System.out.println("Please enter your guess: ");
			userChoice = sc.nextInt();

			// Check to see if user entered a number between 1 and 10
			if (userChoice < 1 || userChoice > 10) {
				System.out.println("Please resart the program and enter a valid number.");
				System.exit(0);
			}

			if (userChoice == computerChoice) {
				System.out.println("Good job, you guessed the correct number");
			} else
				System.out.println("Sorry, you guessed the wrong number.");
		} else if (choice == 3) {
			System.out.println("You chose the Calculator Game");

			// Create variables
			double numOne, numTwo;
			int option;
			// Display Menu
			System.out.println("1: Add");
			System.out.println("2: Subtract");
			System.out.println("3: Multiply");
			System.out.println("4: Divide");
			System.out.println("5: 1+1=11 Calculator (Only use if you are amazing at meth)");
			// Get user choice
			System.out.println("Choice: ");
			option = sc.nextInt();

			// Get user input
			System.out.println("Enter the first number");
			numOne = sc.nextDouble();
			System.out.println("Enter the second number");
			numTwo = sc.nextDouble();

			// Perform the selected calculation
			if (option == 1) {
				System.out.println(numOne + " " + numTwo + " = " + (numOne + numTwo));
			} else if (option == 2) {
				System.out.println(numOne + " - " + numTwo + " = " + (numOne - numTwo));
			} else if (option == 3) {
				System.out.println(numOne + " * " + numTwo + " = " + (numOne * numTwo));
			} else if (option == 4) {
				System.out.println(numOne + " / " + numTwo + " = " + (numOne / numTwo));
			} else if (option == 5) {
				System.out.println("According the 1+1=11 theory, your numbers add up to " + (int)numOne + (int)numTwo);
			}
			
		}
		else if (choice == 4) {
			System.out.println("You chose the interest finder game");
			double initialAmount, interestRate, interestAmount, total;
			
			// Get the initial amount
			System.out.println("Enter the amount of money being interested: ");
			initialAmount = sc.nextDouble();
			System.out.println("Enter the interest rate in decimal (For example an interest rate to 10 percent would be 0.10 in decimal): ");
			interestRate = sc.nextDouble();
			
			// Calculate the amount of interest and total 
			interestAmount = (initialAmount * interestRate);
			total = (interestAmount + initialAmount);
			
			// Display both interest amount and total
			System.out.println("Amount of interest added is " + interestAmount);
			System.out.println("Total amount is " + total);
		}

	}
}
