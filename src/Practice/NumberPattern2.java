package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberPattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter limit up to which the pattern should be printed:");
			int limit = sc.nextInt();
			System.out.println("Print Pattern : ");
			printPattern(limit);
		} catch (InputMismatchException e) {
			System.out.println("Invalid input.Please enter a valid Integer.");
		} finally {
			sc.close();
		}
	}

	public static void printPattern(int n) {
		// Prints repeated numbers for even rows and a single instance of the number for
		// odd rows
		for (int i = 1; i <= n; i++) { // rows
			for (int j = 1; j <= i; j++) { // column
				if (i % 2 == 0) {
					System.out.print(i);
				} else {
					System.out.print(i);
					break;
				}
			}
			System.out.println("");
		}
	}
}
