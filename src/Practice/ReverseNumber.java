package Practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse:");
		int number = sc.nextInt();
		int reverseNumber = 0;
		int remainder = 0;
		System.out.println("Input: " + number);
		sc.close();

		for (; number != 0; number = number / 10) {
			// Get the last digit of the number
			remainder = number % 10;
			// Append the digit to the reversed number
			reverseNumber = reverseNumber * 10 + remainder;
		}
		// Print the reversed number
		System.out.println("Output: " + reverseNumber);
	}
}
