package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class NameAndEmail {

	
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		map.put("Eli","Eli@gmail.com");
		map.put("Tea","tea@gmail.com");
		map.put("Martin","martin@gmail.com");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a username");
		String name=s.nextLine();
		if(map.containsKey(name)) {
			System.out.println(map.get(name));
		}else {
			System.out.println("Invalid name");
		}
	}
}
