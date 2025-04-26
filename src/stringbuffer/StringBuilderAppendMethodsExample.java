package stringbuffer;

public class StringBuilderAppendMethodsExample {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		sb.append(false);
		System.out.println("Appending boolean value in exiting String Builder" + sb);
		sb.append('s');

		System.out.println("Appending character value in exiting String Builder" + sb);

		char[] c = { 's', 's' };
		sb.append(c);

		System.out.println("Appending character array value in exiting String Builder" + sb);

		CharSequence cs = "Shubham";

		sb.append(cs);

		System.out.println("Appending charsequence value in exiting String Builder" + sb);

		sb.append(10.29D);
		System.out.println("Appending double value in exiting String Builder" + sb);

		sb.append(10.10F);
		System.out.println("Appending float value in exiting String Builder" + sb);

		sb.append(10);
		System.out.println("Appending int value in exiting String Builder" + sb);

		sb.append(100L);
		System.out.println("Appending long value in exiting String Builder" + sb);

		Object obj = new String("Shubham");

		sb.append(obj);

		System.out.println("Appending object value in exiting String Builder" + sb);

		String str = new String("Gharat");

		sb.append(str);
		System.out.println("Appending String value in exiting String Builder" + sb);

		StringBuffer sbuffer = new StringBuffer("Dileep");
		sb.append(sbuffer);
		System.out.println("Appending StringBuffer value in exiting String Builder" + sb);

		sb.append(cs, 0, 7);

		System.out.println("Appending char array value in exiting String Builder : " + sb);

		sb.append(cs, 0, 7);
		System.out.println("Appending charSequence on specific index value in exiting String Builder : " + sb);
		
	System.out.println(sb.appendCodePoint('a'));
		
	}
}
