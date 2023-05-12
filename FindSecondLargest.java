package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {3,2,11,4,6,7};
	
		List<Integer> Secondlargest  =new ArrayList<Integer>();
		
		for (int i = 0; i < data.length; i++) {
		
	
			Secondlargest.add(data[i]);
			
		}
			
		Collections.sort(Secondlargest);
		
		System.out.println(Secondlargest);
		
		System.out.println(Secondlargest.get(Secondlargest.size()-2));
		
		
			
		}
	
	}
	



