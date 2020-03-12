package com.practise.arrays;

import java.util.HashSet;

import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		int input[] = {1,2,3,9};
		System.out.println(new Duplicates().containsDuplicate(input));

	}
	
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		
		for (Integer e : nums) {
			if(!set.add(e)) {
				return true;
			}
		}
		
		return false;
		
		
	}

}
