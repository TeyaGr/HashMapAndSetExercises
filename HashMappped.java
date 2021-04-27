package Hashing;

import java.util.HashMap;

public class HashMappped {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> m = new HashMap<>();
for (int i = 1; i <=10; i++) {
	m.put(i, i*i);
}
		for(Integer i : m.keySet()) {
				System.out.println(i+" "+m.get(i));
		}
	
				
	}
}
