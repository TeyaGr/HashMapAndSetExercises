package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMap1 {
public static void main(String[] args) {
	
	Map<Integer, Integer> nums =new HashMap<Integer, Integer>();
	for (int i = 0; i <=10; i++) {
		nums.put(i, i);
		
	}
	for(Integer i: nums.keySet()) {
		System.out.println(i+" "+nums.get(i));
	}
	//banana ==== b-1
	// a-3
	//n-2 itn int
	
	Map<String, Integer> map = new HashMap<String, Integer>();
	Scanner s = new Scanner(System.in);
	String input= s.next();
	String [] array = input.split("");
	
	for(String c:array) {
		
	if(map.containsKey(c)) {
		map.put(c, map.get(c)+1);
	}else {
		map.put(c, 1);
	}
}
	for(String str :map.keySet()) {
		System.out.println(str+" "+ map.get(str));
	}
	/// Another methd for printing = ENTRYSET
	
	Set<Map.Entry<String, Integer>> es = map.entrySet();
	for(Map.Entry<String, Integer> e:es) {
		System.out.println(e.getKey()+":"+e.getValue());
	}
}
}