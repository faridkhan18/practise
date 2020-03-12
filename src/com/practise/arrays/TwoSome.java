package com.practise.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSome {
	
	public static void main(String[] args) {
		int[] input = { 2, 7, 11, 15};
		
		int r[] = new TwoSome().twoSum(input, 9);
		System.out.println(Arrays.toString(r));
	}
	
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        Map<Integer, Integer> prevMap = new HashMap<Integer, Integer>();
        for(int i =0; i < nums.length ; i++) {
        	int lookingFor = target - nums[i];
        	if(prevMap.containsKey(nums[i])) {
        		result[0] = prevMap.get(nums[i]);
        		result[1] = i;
        	}else {
        		prevMap.put(lookingFor, i);
        	} 	
        }
        return result;
    }

}
