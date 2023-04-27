package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

		int i =34343;
		int temp = i;
		int reverse = 0, rem;
		
		for (i = 34343; i > 0; i = i/10) {
			rem = i%10;
			reverse = reverse*10 + rem;
					
		}
		
		if (temp==reverse) {
			System.out.println("The given number"+ temp + "is a palindrome");
			
		}
		
		else {
			
			System.out.println("The given number"+ temp + "is not a palindrome");
		}
		
		

	}

}
