package week1.day1;

public class Mobile {
	
	public void makeCall() {
		
		System.out.println("call is made");
	}

		private void sendMsg() {
			
			System.out.println("Msg is sent");
		}
			
		public void mobileModel() {
			
		String mobileModel ="apple";
		
		System.out.println(mobileModel);
		
		}

		public void mobileWeight() {
			
		float mobileWeight =25.15f;
		
		System.out.println(mobileWeight);
		
		}
		
		public void fullyCharged() {
			
		boolean fullyCharged =true;
		
		System.out.println("fullyCharged="+fullyCharged);
		 
		}
		
		public void mobileCost() {
			
			int mobileCost = 30000;
			
			System.out.println("mobileCost="+mobileCost);
		}
			
		
	   public static void main(String[] args) {
		
		// Create object for class
			
			Mobile obj =new Mobile();
			obj.makeCall();
			obj.sendMsg();
			obj.mobileModel();
			obj.mobileWeight();
			obj.fullyCharged();
			obj.mobileCost();
			
			
			
		
		
	}
	
}
