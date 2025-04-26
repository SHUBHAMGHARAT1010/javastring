package stringbuffer;

public class TimeCalculationInString_StringBuilder_StringBuffer {

	public static void main(String[] args) {

		long startTime, endTime;

		startTime = System.currentTimeMillis();

		String s = "Shubham";

		for (int i = 0; i <= 100000; i++) {
			s += "Gharat";
		}

		endTime = System.currentTimeMillis();

		System.out.println("Total time taken by String is : " + (endTime - startTime) + "ms");

		startTime = System.currentTimeMillis();

		StringBuffer sb = new StringBuffer("Shubham");

		for (int i = 0; i <= 100000; i++) {
			sb.append("Gharat");
		}

		endTime = System.currentTimeMillis();

		System.out.println("Total time taken by String Buffer is : " + (endTime - startTime) + "ms");

		startTime = System.currentTimeMillis();

		StringBuilder sbb = new StringBuilder("Shubham");

		for (int i = 0; i <= 100000; i++) {
			sb.append("Gharat");
		}

		endTime = System.currentTimeMillis();

		System.out.println("Total time taken by String Builder is : " + (endTime - startTime) + "ms");

	}
}
