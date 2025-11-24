package fr_3il_tp3;

public class OrderApp {

	public static void main(String[] args) {
		
		String firstCustomerName = "Alice";
		double firstUnitPrice = 10;
		int  firstQuantity  = 2;
		double  firstTotalWithVat = firstUnitPrice *  firstQuantity  +firstUnitPrice *  firstQuantity  * 0.2;

		String secondCustomerName = "Bob";
		double secondUnitPrice = 15;
		int secondQuantity = 1;
		double secondTotalWithVat =secondUnitPrice * secondQuantity + secondUnitPrice * secondQuantity * 0.2;

		System.out.println("Client : " + firstCustomerName);
		System.out.println("Prix HT : " + firstUnitPrice);
		System.out.println("Quantité : " +  firstQuantity );
		System.out.println("Total TTC : " +  firstTotalWithVat);

		System.out.println("------------------------");

		System.out.println("Client : " + secondCustomerName);
		System.out.println("Prix HT : " + secondUnitPrice);
		System.out.println("Quantité : " + secondQuantity);
		System.out.println("Total TTC : " + secondTotalWithVat);

		System.out.println("------------------------");

		if ( firstTotalWithVat +  secondTotalWithVat > 30) {
			
			System.out.println("Réduction !");
			
		} else {
			
			if ( firstTotalWithVat +  secondTotalWithVat > 20) {
				
				System.out.println("Petite réduction !");
				
			} else {
				
				System.out.println("Pas de réduction.");
			}
		}
	}

}
