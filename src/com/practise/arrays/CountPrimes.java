package com.practise.arrays;

import java.util.Arrays;

public class CountPrimes {

	public static void main(String[] args) {
		System.out.println(new CountPrimes().countPrimes(10));

	}

	public int countPrimes(int n) {
		int count = 0;
		boolean arr[] = new boolean[n];
		Arrays.fill(arr, true);
		arr[0] = false;
		arr[1] = false;

		System.out.println(Arrays.toString(arr));

		// i * i limits the number of time loop has to be run
		// there is no point in running loop for 7 when our limit is 20;
		for (int i = 2; i * i < arr.length; i++) {
			// check for multiples of outer loop
			if (arr[i] == true) {
				for (int j = 2; j * i < arr.length; j++) {
					arr[i * j] = false;

				}
			}

		}
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i])
				count++;	
		}
		return count;

	}

}
