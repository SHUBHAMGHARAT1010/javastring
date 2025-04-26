package stringprograms;

import java.util.HashMap;
import java.util.Map;

public class OccOfCharacter {

	public static void main(String[] args) {

		String s = "Shubham";

		OccOfCharacter count = new OccOfCharacter();
		Map<Character, Integer> map = count.CountOccurrence(s);
		System.out.println(map);
	}

	public Map<Character, Integer> CountOccurrence(String s) {

		Map<Character, Integer> map = new HashMap<>();

		for (char c : s.toCharArray()) {

			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		return map;

	}
}
