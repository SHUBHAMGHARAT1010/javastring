package stringbuilder;

public class StringBuilderConstructor {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		StringBuilder sb1 = new StringBuilder("Shubham");

		StringBuilder sb2 = new StringBuilder(20);

		CharSequence cs = "Shubham Gharat";
		StringBuilder sb3 = new StringBuilder(cs);

		System.out.println("Default capacity : " + sb.capacity());
		System.out.println("length with no argument : " + sb.length());
		System.out.println("Capacity with the string as argument : " + sb1.capacity());
		System.out.println("length with stirng as argument : " + sb1.length());

		System.out.println("Capacity with the argument as char sequence :" + sb3.capacity());
		System.out.println("length with char sequence as argument : " + sb3.length());
		System.out.println(sb3);
	}
}
