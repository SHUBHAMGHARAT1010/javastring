package stringprograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s = "Shubham";

		RemoveDuplicates rd= new RemoveDuplicates();
		
		System.out.println(rd.removeDuplicate(s));
	}

	public String removeDuplicate(String s) {
		StringBuffer sb = new StringBuffer();

		Set<Character> set = new HashSet<>();
//
		for (char c : s.toCharArray()) {

			if (set.add(c))
				sb.append(c);

		}
		return sb.toString();

	}
	
	
}
