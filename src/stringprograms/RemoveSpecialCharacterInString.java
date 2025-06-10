package stringprograms;

import java.util.Scanner;
import java.util.logging.Logger;
import logger.AppLogger;

public class RemoveSpecialCharacterInString {

	static final private Logger log=AppLogger.getLogger(RemoveSpecialCharacterInString.class);
	
	
	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		
		log.info("Ente the your string :");
		String str=sn.next();
		log.info("User input stored into String str : "+str);
		
		StringBuilder sb=new StringBuilder();
		
		for (int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			if(ch>='A'&&ch<='Z' || ch>='a'&&ch<='z'||ch>='0'&&ch<='9'||ch==' ') {
				sb.append(ch);
			}
		}
		
		log.info("String with removing special character : "+ sb);
		
	}
}
