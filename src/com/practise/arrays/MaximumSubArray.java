package com.practise.arrays;

public class MaximumSubArray {

	public static void main(String[] args) {
		int input [] = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(new MaximumSubArray().maxSubArray(input));
	}
	
	
	 public int maxSubArray(int[] nums) {
	    int globalMax = nums[0];
	    int localmax = nums[0];
	    int prevValue = nums[0];
		 
		 for (int i = 1; i < nums.length; i++) {
			localmax = Integer.max(nums[i], localmax+nums[i]);
			globalMax = Integer.max(globalMax, localmax);
			
		}
		 
		 return globalMax;
		 
		// return 0;
	    }

}
