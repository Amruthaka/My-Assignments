package week3.day2;


import java.util.Set;
import java.util.TreeSet;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,7,6,8};
		int count = 0;
		
	   Set<Integer> ME =new TreeSet<Integer>();
	   
		System.out.println(ME);
		
		for (int i = 0; i < arr.length; i++) {
			
			ME.add(arr[i]);
			
			if (arr[i]==i+1) {
			count ++;
			}
			
			System.out.println(ME);
			
			System.out.println("The missing Element in arry is:" +count);
			
			
		}
		
		

}

}