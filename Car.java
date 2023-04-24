package week1.day1;

public class Car {

	public void soundHorn() {
		System.out.println("sound horn");
		
	}
	
	public void applyBrake() {
		
		System.out.println("Applied Brake"); 
	}
	
	public static void main(String[] args) {
		//create object for the class Car
		
		Car obj=new Car();
		obj.soundHorn();
		obj.applyBrake();

	}

}
