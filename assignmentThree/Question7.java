package assignmentThree;

public class Question7 {

	public static void main(String[] args) {
		
		//quarter=25c, dime=10c, nickle=5p, payment=100c,
		
		int payment=100;
		int price=95;
		int quarters=(payment-price)/25;
		int dimes=((payment-price-(25*quarters))/10); 
		int nickles=((payment-price-(25*quarters)-(10*dimes))/5);
		
		System.out.println("Price in cents: "+price);
		System.out.println("Your change is: "+quarters+" quarters, "+dimes+" dimes and "+nickles+" nickles");
		
	
		
		
		
		

	}

}
