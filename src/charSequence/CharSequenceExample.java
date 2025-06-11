package charSequence;

import java.util.logging.Logger;

import logger.AppLogger;

public class CharSequenceExample {
	private static final Logger log = AppLogger.getLogger(CharSequenceExample.class);

	public static void main(String[] args) {

		log.info("Main thread started.");

		log.info("processing the characters.");

		CharSequence c1 = new String("Shubham");
		CharSequence c2 = new StringBuffer("Shubham Gharat");
		CharSequence c3 = new StringBuilder("Shubham Dilip Gharat");

		getLength(c1);
		getLength(c2);
		getLength(c3);

		printCharSequence(c1);
		printCharSequence(c2);
		printCharSequence(c3);

	}

	public static void getLength(CharSequence ch) {
		log.info("The of the char sequence is : " + ch.length());
	}

	public static void printCharSequence(CharSequence ch) {
		log.info(": " + ch.toString());
	}

}
