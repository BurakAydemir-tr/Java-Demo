package gameSalesDemo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1=new Customer(1,"Burak","Aydemir","1234",
				LocalDate.of(1986, 02, 25));
		
		Campaign campaign1=new Campaign(1,"black friday",40);
		
		CustomerManager customerManager=new CustomerManager(new MernisManager());
		customerManager.add(customer1);
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign1);
		
		GameSalesManager gameSales=new GameSalesManager();
		gameSales.Sale(customer1, campaign1);
		
	}

}
