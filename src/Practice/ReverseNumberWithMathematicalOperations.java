package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseNumberWithMathematicalOperations {

	public static void main(String[] args) {

		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a number to reverse:");
			int number = sc.nextInt();
			if (number < 0) {
				System.out.println("Please enter a non-negative number.");
			} else {
				System.out.println("Input: " + number);

				int result = 0;
				int remainder = 0;
				while (number > 0) {
					remainder = number % 10;
					result = result * 10 + remainder;
					number = number / 10;
				}
				System.out.println("Reverse number is:" + result);
			}
		} catch (InputMismatchException e) {
			System.out.println("Please enter a valid integer.");

		} finally {
			sc.close();
		}

	}

}
