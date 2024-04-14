package introduction;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rn = new Random();

		boolean playAgain = true;
		while (playAgain) {
			int maxattempts = 8;
			int randnum = rn.nextInt(1, 100);
			int userGuess;
			int finals = 0;
			int attempts = 0;
			boolean hasguessedCorrectly = false;
			System.out.println("Welcome to the guessing game💕");
			System.out.println("Try to guess secret number correctly between 1 to 100 :");
			System.out.println("you have only " + maxattempts + " chances to win the game...");
			while (attempts < maxattempts && !hasguessedCorrectly) {
				System.out.println("Enter your guess : ");
				userGuess = scanner.nextInt();
				attempts++;
				if (userGuess == randnum) {
					hasguessedCorrectly = true;
					finals += 1;
					System.out.println("Congrats!...You guessed The Correct Answer🤩🤩🤩");
					break;

				} else if (userGuess > randnum) {
					System.out.println("TOO HIGH.....Try Again.");
				} else {
					System.out.println("TOO LOW.....Try Again.");
				}

			}
			if (attempts >= maxattempts) {
				System.out.println("Sorryy!!!...You are out of the Guess.The correct answer is :" + randnum);

			}
			System.out.println("Do you wish to continue?(yes/no):");
			String ans = scanner.next();
			playAgain = ans.equalsIgnoreCase("yes");
			if (ans != "yes") {
				System.out.println("Thank You for Playing this game😊❤️....Here is your Score:  " + finals);
				scanner.close();
			}
		}

	}

}
