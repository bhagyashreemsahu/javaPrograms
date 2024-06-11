package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintNumbersRecursion {
	static int maxLimit;

	// Print Numbers from 1 to 10(maxLimit) without using loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter max limit till which number should be printed: ");
			maxLimit = sc.nextInt();

			if (maxLimit <= 0) {
				System.out.println("Please enter a positive integer.");
			} else {
				printNumbers(1);
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input.Please enter a valid integer.");
		} finally {
			sc.close(); // Ensure the Scanner is closed
		}
	}

	public static void printNumbers(int n) {
		// Base case
		if (n > maxLimit)
			return;

		System.out.println(n); // Print the current number
		printNumbers(n + 1); // Recursive call to print the next number
	}
}
