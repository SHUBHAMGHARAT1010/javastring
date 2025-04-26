package stringbuilder;

public class StringBuilderInsertMethods {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Shubham");

		System.out.println(sb.indexOf("m"));

		System.out.println(sb.indexOf("bham", 0));

		sb.insert(7, false);
		System.out.println(sb);

		sb.insert(0, 'A');
		System.out.println(sb);

		sb.insert(0, new char[] { 'a', 'b' });
		System.out.println(sb);

		CharSequence cs = "Gharat";
		sb.insert(sb.length(), cs);
		System.out.println(sb);

		sb.insert(sb.length(), 10D).insert(sb.length(), 10.22F).insert(sb.length(), 505).insert(sb.length(), "Vikki")
				.insert(sb.length(), new char[] { 'Q', 'W', 'E', 'R' }, 0, 2);
		System.out.println(sb);

	}
}
