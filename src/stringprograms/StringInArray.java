package stringprograms;

import java.util.Arrays;

public class StringInArray {

	public static void main(String[] args) {
		String str="My Name Is Shubham";
		String [] toArr=str.split(" ");
		
		for (String s : toArr) {
			System.out.println(s);
		}
		
		System.out.println(Arrays.toString(toArr));
	}
}
