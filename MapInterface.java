package Hashing;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapInterface {
public static void main(String[] args) {
	
	Map<String, String> map= new HashMap<String, String>();
	map.put("myName", "Tea");
	map.put("myAge", "24");
	map.put("myProfession", "Programmer");
	map.put("secondProfession","Psychologist");
	// It doesn'tprint the in order
	System.out.println(map);
	//How to get a specific value
	System.out.println(map.get("myName"));
	System.out.println(map.values());
	// how toget sorted map
	for (String string : map.keySet()) {
		System.out.println(string + " "+ map.get(string));
		
	}
	//HashTable
	Map<String, String> table= new Hashtable<>();
	
}
}
