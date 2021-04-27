package Hashing;

import java.util.HashMap;

public class AppearanceOfLetter {

	public static void main(String[] args) {
		
		String word = "Ana eat banana eat apple and banana";
		HashMap<String, Integer> h = new HashMap<>();
		String [] s1 = word.split(" ");
		int counter=1;
		for(String s:s1) {
			if(h.containsKey(s)) {
			h.put(s, h.get(s)+1);
			
		
	
		}else {
			h.put(s, 1);
		}

	}
		for(String key:h.keySet()) {
			System.out.println(key+h.get(key));
		}
	}
}
