package Practice;

public class StringsComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Using String literals(Stored in the Constant Pool)
		String s1 = "Bhagyashree";
		// Using String objects (Stored in the Heap Memory)
		String s2 = new String("Bhagyashree");

		// Comparing address references
		System.out.println("Address refrence Comparison: " + (s1 == s2));
		// Comparing values
		System.out.println("Value Comparison: " + s1.equals(s2));

	}

}
