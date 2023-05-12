package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num1 = {3,2,11,4,6,7};
		int[] num2 = {1,2,8,4,9,7};
		
		List<Integer> nums =new ArrayList<Integer>();
		Set<Integer> nums1 =new HashSet<Integer>();
		
		
		for (int i = 0; i < num1.length; i++) {
		
	    for (int j = 0; j < num2.length; j++) {
	    	
	    	if (num1[i]== num2[j]) {
	    	nums.add(num1[i]);
	    	nums1.add(num2[j]);
	    	
	    	System.out.println(nums);
	    	
			
		}
			
		}
		
		}
		

	}

}
