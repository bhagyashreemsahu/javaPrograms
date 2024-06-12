package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MissingIndices {

	public static void main(String[] args) {
		// Sample input string
		String input = "[()]([()][({";

		// List to store indices of unmatched opening brackets
		List<Integer> missingIndices = new ArrayList<>();
		// Stack to keep track of opening brackets
		Stack<Integer> stack = new Stack<>();

		// Iterate through the input string
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			// If the Character is an opening bracket, push its index onto the stack
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(i);
			}
			// If the Character is a closing bracket, and not empty then pop the top of 
			//the stack
			else if (ch == ')' || ch == ']' || ch == '}') {
				if (!stack.isEmpty())
					stack.pop();
			}
		}
		// All remaining indices in the stack are unmatched opening brackets
		while (!stack.isEmpty())
			missingIndices.add(stack.pop());
		// Print the missing indices
		System.out.println("Missing Indices:" + missingIndices);
	}
}
