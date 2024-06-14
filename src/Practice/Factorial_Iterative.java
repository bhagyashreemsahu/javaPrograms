package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial_Iterative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a non-negative number:");
			int number = sc.nextInt();
			sc.close();

			if (number < 0) {
				System.out.println("Factorial is not defined for negative numbers and Zero.");
			} else if (number == 0) {
				System.out.println("Factorial of 0 is 1");
			} else {
			int factorial = 1;
			for (int i = number; i >= 1; i--) {
				factorial *= i;
			}
			System.out.println("Factorial of " + number + " is " + factorial);
		}
		}catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a valid integer.");
		}

	}
}
