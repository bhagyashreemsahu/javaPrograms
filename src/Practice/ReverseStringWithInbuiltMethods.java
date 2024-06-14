package Practice;

public class ReverseStringWithInbuiltMethods {

	public static void main(String[] args) {
		String string1 = "Bhagyashree Sahu";
		String string2 = "Bhagyashree String Builder";

		// Display the original strings
		System.out.println("String Buffer Input: " + string1);
		System.out.println("String Builder Input: " + string2);

		// Using StringBuffer to reverse the string
		StringBuffer stringBuffer = new StringBuffer(string1);
		String reversedWithBuffer = stringBuffer.reverse().toString();
		System.out.println("Reversed With Buffer: " + reversedWithBuffer);

		// Using StringBuilder to reverse the string
		StringBuilder stringBuilder = new StringBuilder(string2);
		String reversedWithBuilder = stringBuilder.reverse().toString();
		System.out.println("Reversed With Builder: " + reversedWithBuilder);

	}

}
