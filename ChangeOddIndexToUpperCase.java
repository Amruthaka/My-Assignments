package week3.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "changeme";
		
		char[] charArray = test.toCharArray();
		
		System.out.println(charArray);
		
		for (int i = 0; i < charArray.length; i++) {
			
		if(i%2 !=0) {
			
		charArray[i]= Character.toUpperCase(charArray[i]);
		
		System.out.println(charArray[i]);

		}
		
		else {
			
			System.out.println(charArray);
		}
		
		

	}

}
}
