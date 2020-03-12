package com.practise.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(new ProductOfArrayExceptSelf().productExceptSelf(nums)));

	}

	public int[] productExceptSelf(int[] nums) {
		int result[] = new int[nums.length];
		int left[] = new int[nums.length];
		int right[] = new int[nums.length];
		
		
		Arrays.fill(result, 1);
		Arrays.fill(left, 1);
		Arrays.fill(right, 1);
		
		for (int i = 1,  j = right.length - 2; i < left.length; i++,j--) {
			left[i] = left[i-1] * nums[i-1];
			right[j] = right[j+1] * nums[j+1];
		}		
		
		for (int i = 0; i < right.length; i++) {
			result[i] = left[i] * right[i];
		}
	
		return result;
	}

}
