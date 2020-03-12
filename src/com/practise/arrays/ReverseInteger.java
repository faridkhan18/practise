package com.practise.arrays;

public class ReverseInteger {
		public static void main(String[] args) {
			System.out.println(new ReverseInteger().reverse(123));
		}
		
	    public int reverse(int x) {
	        if(0 ==  x)
	        	return 0;
	    	
	        
	        int rev = 0;
	        while(x != 0) {
	        	int pop  = x % 10;
	        	x = x /10;
	        	rev = rev *10 +pop;
	        }
	        
	    	
	    	return rev;
	    }
}
