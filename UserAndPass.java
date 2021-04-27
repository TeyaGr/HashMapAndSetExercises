package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class UserAndPass {
public static void main(String[] args) {
	
	HashMap<String, String> up = new HashMap<>();
	
	up.put("TeyaGr", "Luni4ka");
	up.put("Tei4ka", "blablabla");
	up.put("Luni4ka", "bebence");
	up.put("Code", "Academy");
	up.put("User", "Password");
	Scanner s = new Scanner(System.in);

	System.out.println("How many users do u want?");
	int count = s.nextInt();
	for(int i=0;i<count;i++) {
		System.out.println("Enter your username");
		Scanner scan = new Scanner(System.in);

		String str=scan.next();
		if(up.containsKey(str)) {
			System.out.println("Enter your password");
			String pass=scan.next();
			if(up.get(str).equals(pass)){
				System.out.println("congrats");
			}else {
				System.out.println("Incorect pass");
			}
		}else {
			System.out.println("Enter a valid username");
		}
	}
}
}
