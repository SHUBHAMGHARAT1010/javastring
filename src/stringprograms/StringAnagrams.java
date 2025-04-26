package stringprograms;

import java.util.Arrays;

public class StringAnagrams {

	public static void main(String[] args) {
		
		String name="Shubham";
		String sirName="husmbha";
		
		StringAnagrams anagram = new StringAnagrams();
		
		if(anagram.checkStringAnagram(name,sirName)) System.out.println("String is anagram !!!");
		
		else System.out.println("String is not anagram !!!");
	}
	
	
	public boolean checkStringAnagram(String ...str) {
				
		if(str[0].length() != str[1].length()) return false;
		
		
		char [] char1=str[0].toLowerCase().toCharArray();
		
		char [] char2=str[1].toLowerCase().toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		
		return Arrays.equals(char1, char2);
	}
}
