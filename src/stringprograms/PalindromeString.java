package stringprograms;

public class PalindromeString {

	public String checkPalindrome(String str) {

		String s = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			s = s + str.charAt(i);
		}
		return s;
	}

	public static void main(String[] args) {

		PalindromeString palindrome = new PalindromeString();
		String s = "poop";

		if (s.equals(palindrome.checkPalindrome(s)))
			System.out.println("its palindrome !!!");

		else
			System.out.println("its not palindrome !!!");

	}
}
