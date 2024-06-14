package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial_Recursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a non-negative number:");
			int number = sc.nextInt();
			sc.close();
			if (number < 0) {
				System.out.println("Factorial is not defined for negative numbers.");
			} else if (number == 0) {
				System.out.println("Factorial of 0 is 1");
			} else if (number > 0) {
				int result = factorial(number);
				System.out.println("Factorial of " + number + " is " + result);
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a valid integer.");
		}
	}

	public static int factorial(int num) {
		if (num == 1)
			return 1;
		return num * factorial(num - 1);
	}
}
