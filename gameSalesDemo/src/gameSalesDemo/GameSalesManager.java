package gameSalesDemo;

public class GameSalesManager {
	public void Sale(Customer customer,Campaign campaign) {
		System.out.println("Oyun "+customer.getFirstName()+" "+customer.getLastName()+
				" "+campaign.getRate()+" Oranýnda satýldý.");
	}
}
