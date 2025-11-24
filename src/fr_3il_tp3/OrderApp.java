package fr_3il_tp3;

public class OrderApp {

	// calcul de la facture totale d'un client toute taxe comprise
	public static double montant_tva(double priceHt,int quantity)
	{
		double total = priceHt * quantity * 1.2; 
		return total;
	}
	
	// affichage de la facture d'un client
	public static void affichage(String CustomerName,double UnitPrice, int Quantity,double TotalWithVat)
	{
		System.out.println("Client : " + CustomerName);
		System.out.println("Prix HT : " + UnitPrice);
		System.out.println("Quantité : " +  Quantity );
		System.out.println("Total TTC : " +  TotalWithVat);

		System.out.println("------------------------");
	}
	public static void main(String[] args) {
		
		String firstCustomerName = "Alice";
		double firstUnitPrice = 10;
		int  firstQuantity  = 2;
		double  firstTotalWithVat = montant_tva(firstUnitPrice,firstQuantity);

		String secondCustomerName = "Bob";
		double secondUnitPrice = 15;
		int secondQuantity = 1;
		double secondTotalWithVat = montant_tva(secondUnitPrice,secondQuantity);

		affichage(firstCustomerName, firstUnitPrice, firstQuantity, firstTotalWithVat);

		affichage(secondCustomerName, secondUnitPrice, secondQuantity,secondTotalWithVat);
		double totalOrder = firstTotalWithVat + secondTotalWithVat; 

		// réduction à appliquer
		
		if ( totalOrder> 30) {
			
			System.out.println("Réduction !");
			
		} else {
			
			if ( totalOrder > 20) {
				
				System.out.println("Petite réduction !");
				
			} else {
				
				System.out.println("Pas de réduction.");
			}
		}
	}

}
