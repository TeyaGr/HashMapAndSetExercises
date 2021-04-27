package Hashing;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		
HashSet<String> set = new HashSet<>();
set.add("Apple");
set.add("Orange");
set.add("Mango");
set.add("Fig");
set.add("Grapes");


set.add("Apple");
set.add("fig");

for(String s :set) {
	System.out.println(s);
}


int[] array = {1,2,3,4,5,5,5,6,6};
HashSet <Integer> set2= new HashSet<>();
for (int i : array) {
	set2.add(i);
	
}
System.out.println(set2);
	}
}
