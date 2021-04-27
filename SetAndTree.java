package Hashing;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetAndTree {
public static void main(String[] args) {
	
	Set<Integer> nums = new HashSet<Integer>();
	nums.add(4);
	nums.add(5);
	nums.add(6);
	nums.add(55);
	nums.add(1);
	System.out.println(nums);
	
	Set<Integer> sn = new TreeSet<>();
	sn.add(58);
	sn.add(45);
	sn.add(88);
	System.out.println(sn);
}
}
