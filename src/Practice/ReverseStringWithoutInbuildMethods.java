package Practice;

public class ReverseStringWithoutInbuildMethods {

	public static void main(String[] args) {
		String str = "Bhagyashree Sahu";
		System.out.println("Input String:   " + str);
		StringBuilder reverseString = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {
			reverseString.append(str.charAt(i));
		}
		System.out.print("Reverse String: " + reverseString.toString());

	}

}
