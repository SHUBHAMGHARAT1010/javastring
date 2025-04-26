package stringbuffer;

public class StringBufferExample {

	public static void main(String[] args) {

		// 1. Construction & Capacity

		StringBuffer defaultCapacity = new StringBuffer();
		StringBuffer capacity = new StringBuffer(20);
		StringBuffer stringCapacity = new StringBuffer("Shubham");

		CharSequence ch = "Shubham";

		StringBuffer c = new StringBuffer();

		c.append(ch).append(" ").append("Gharat").indexOf("S");
		
		System.out.println(c);
		
		System.out.println(defaultCapacity.capacity());
//
//		System.out.println("Default Capacity :"+defaultCapacity.capacity());
//		System.out.println(defaultCapacity.length());
//		System.out.println("with capacity :"+capacity.capacity());
//		System.out.println(capacity.length());
//		System.out.println("String Capacity : "+stringCapacity.capacity());
//		System.out.println(stringCapacity.length());
//		
//		System.out.println("Charactor Capacity : "+chaS.capacity());
//		System.out.println(chaS.length());
//
//		stringCapacity.append("Gharat");
//		System.out.println(stringCapacity);
//		System.out.println(stringCapacity.capacity());
//		System.out.println(stringCapacity.length());
//		
//		stringCapacity.append("ShubhamGharat");
//		System.out.println(stringCapacity);
//		System.out.println(stringCapacity.capacity());
//		System.out.println(stringCapacity.length());
//		System.out.println(stringCapacity.capacity());
//		stringCapacity.setLength(0);
//		System.out.println(stringCapacity.length());
//		System.out.println(stringCapacity.capacity());
//		System.out.println(stringCapacity.append(true));
//		System.out.println(stringCapacity.append('!'));
//		System.out.println(stringCapacity.append(new char[] { 'A', 'B' }));
//
//		char[] ccc = { 'a', 'b', 'c' };
//		System.out.println(stringCapacity.append(ccc, 0, 3));
//
//		System.out.println(stringCapacity.append(ch, 0, 6));
//		System.out.println(stringCapacity.append(1));
//
//		System.out.println(stringCapacity.append(stringCapacity));
//
//		System.out.println(stringCapacity.appendCodePoint(10));
//
//		System.out.println(stringCapacity.charAt(0));
//		System.out.println(stringCapacity.codePointAt(0));
//		System.out.println(stringCapacity.codePointCount(0, 2));
//
//		System.out.println(stringCapacity.delete(0, 2));
//		System.out.println(stringCapacity.deleteCharAt(0));
//		stringCapacity.getChars(0, 3, ccc, 0);
//		System.out.println(ccc);
//		System.out.println(stringCapacity.indexOf("true"));
//
//		System.out.println(stringCapacity.insert(0, true));
//		System.out.println(stringCapacity.insert(0, 's'));
//		System.out.println(stringCapacity.lastIndexOf("1"));
//		System.out.println(stringCapacity.length());
//		System.out.println(stringCapacity.replace(0, 9, "Shubham"));
//		System.out.println(stringCapacity.reverse());
//		System.out.println(stringCapacity.reverse());
//
//		CharSequence s = stringCapacity.subSequence(0, 10);
//		System.out.println(s);
//
//		System.out.println(stringCapacity.substring(10));
//	
//		System.out.println("Shubham".repeat(3));
//		
//		

	}
}
