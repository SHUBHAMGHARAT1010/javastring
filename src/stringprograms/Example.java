package stringprograms;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {

		String s = "AShubham Gharat";
		char[] c = { 's', 'o' };
		System.out.println(s.charAt(0));
		System.out.println(s.length());
		System.out.println(s.isBlank());
		System.out.println(s.isEmpty());
		System.out.println(s.codePointAt(0));
		System.out.println(s.codePointBefore(1));
		System.out.println(s.codePointCount(0, 4));
		System.out.println(s.equalsIgnoreCase("SHUBHAM"));
		System.out.println(s.equals("Shubham"));
		System.out.println(s.compareTo("shubhsam3fetete"));
		System.out.println(s.compareToIgnoreCase("shubham"));
		System.out.println(s.concat(s));
		System.out.println(s.contains(s.concat(s)));
		System.out.println(s.contentEquals("bham"));
		System.out.println(s.startsWith("A"));
		System.out.println(s.startsWith("S", 1));
		System.out.println(s.endsWith("m"));
		System.out.println(s.copyValueOf(c));
		System.out.println(s.indexOf("S"));
		System.out.println(s.indexOf(s));
		System.out.println(s.indexOf("h", 3));
		System.out.println(s.lastIndexOf("m"));
		System.out.println(s.lastIndexOf("h", 4));
		System.out.println(s.substring(5));
		System.out.println(s.substring(0, 2));
		System.out.println(s.subSequence(1, 5));
		System.out.println(s.intern());
		System.out.println(s.indent(1));
		System.out.println(s.replace("A", "G"));
		System.out.println(s.replaceFirst("A", "S"));
		System.out.println(s.matches("SS"));
		System.out.println(s.trim());
		System.out.println(s.replaceAll(s, s));
		System.out.println(s.trim());
		System.out.println(s.split(" "));
		System.out.println(Arrays.toString(s.toCharArray()));
		System.out.println(s);
		System.out.println(String.join("8", "pd", "ggff"));
		System.out.println(s.indent(5));
	}
}
