package stringprograms;

public class CheckVowel {

	public int vowel(String s) {

		int count = 0;
		char[] c = s.toCharArray();

		for (char cc : c) {

//			if(Character.isLetter(cc)) {
			if ("aieouAEIOU".indexOf(cc) != -1)
				count++;
		}
		return count;
	}
//	}

	public static void main(String[] args) {
		CheckVowel c = new CheckVowel();
		String s = "Shubham";

		System.out.println(c.vowel(s));

	}
}
