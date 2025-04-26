package stringprograms;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Shubham";
		String newStr = "";
		int j = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);

			System.out.println(c);
			newStr = newStr + c;

		}
		System.out.println(newStr);
	}
}
