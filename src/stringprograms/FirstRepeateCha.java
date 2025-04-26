package stringprograms;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeateCha {

	public static void main(String[] args) {
		
		String s="Shubham";
		
		FirstRepeateCha cc=new FirstRepeateCha();
		
		System.out.println(cc.getRepeate(s));
		
	}
	
	public char getRepeate(String s) {
		
		Map<Character, Integer> map=new HashMap<>();
		
		for (char c:s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> ent : map.entrySet()) {
			
			if(ent.getValue()>1) return ent.getKey();
		}
		return ' ';
		
	}
}
