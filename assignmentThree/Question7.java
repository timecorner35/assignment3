package assignmentThree;

public class Question7 {

	public static void main(String[] args) {
		
		//quarter=25c, dime=10c, nickle=5p, payment=100c,
		
		int payment=100;
		int price=65;
		int change= payment-price;
		int quarters=change/25;
		change=change%25;
		int dimes=change/10;
		change=change%10;
		int nickles=(change/5);
		
		System.out.println("Price in cents: "+price);
		System.out.println("Your change is: "+quarters+" quarters, "+dimes+" dimes and "+nickles+" nickles");
		
	
		
		
		
		

	}

}
