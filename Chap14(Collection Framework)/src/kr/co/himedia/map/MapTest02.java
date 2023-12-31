package kr.co.himedia.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
	
	public static void main(String[] args) {
		
		String str = "Hello, Himedia";
		
		Map<Character, Integer> countMap = new HashMap<>();
		
		char[] strArray = str.toCharArray();
		for (char c : strArray) {
			if(countMap.containsKey(c)) {
				countMap.put(c, countMap.get(c)+1);
			}else {
				countMap.put(c, 1);
			}
		}
		
		System.out.println("Character Counts");
		for (char c : countMap.keySet()) {
			System.out.println(c + " : "+countMap.get(c));
		}
		
	}

}
