package Practice;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit up to which the pattern should be printed:");
		int limit = sc.nextInt();
		sc.close();
		System.out.println("Pattern Number 1: ");
		pattern1(limit);
		System.out.println("Pattern Number 2: ");
		pattern2(limit);
	}

	public static void pattern1(int n) {
		// Pattern 1: Prints increasing sequences of numbers
		for (int i = 1; i <= n; i++) { // rows
			for (int j = 1; j <= i; j++) { // column
				System.out.print(j);
			}
			System.out.println("");
		}
	}

	public static void pattern2(int n) {
		// Pattern 2: Prints repeated numbers in each line
		for (int i = 1; i <= n; i++) { // rows
			for (int j = 1; j <= i; j++) { // column
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}
