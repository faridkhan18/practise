package com.practise.arrays;

import java.util.HashSet;

public class MaxProfit {

	public static void main(String[] args) {
		int[] input = { 7,1,5,3,6,4 };
		System.out.println(new MaxProfit().betterWay(input));

	}

	public int maxProfit(int[] prices) {
		int max = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				int temp = prices[j] - prices[i];
				if (max < temp) {
					max = temp;
				}
			}
		}
		return max;

	}

	public int betterWay(int[] prices) {
		int minBuyPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for (int i = 0; i < prices.length; i++) {
			if(prices[i] < minBuyPrice) {
				minBuyPrice = prices[i];
			}
			//if we are not buying then try selling
			else if(prices[i]- minBuyPrice > maxProfit) {
				maxProfit = prices[i] - minBuyPrice;
			}
		}
		
		
		
		
		return maxProfit;
	}

}
