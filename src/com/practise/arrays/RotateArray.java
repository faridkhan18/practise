package com.practise.arrays;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int arr []= {1,2,3,4,5,6,7};
		new RotateArray().rotate(arr, 2);

	}
	
	
	 public void rotate(int[] nums, int k) {
		 for (int i = 0; i < nums.length; i++) {
			int newIndex = (i + k) %  nums.length;
			System.out.println(i);
			int temp =  nums[newIndex];
			nums[newIndex] = nums[i];
			nums[i] = temp;
		}
		 
		 System.out.println(Arrays.toString(nums));
	  }

}
