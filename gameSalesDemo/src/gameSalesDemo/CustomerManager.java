package gameSalesDemo;

public class CustomerManager implements CustomerService{
	
	private CustomerCheckService customerCheckService;

	public CustomerManager(CustomerCheckService customerCheckService) {

		this.customerCheckService = customerCheckService;
	}

	public void add(Customer customer) {
		if(customerCheckService.CheckRealPerson(customer)) {
			System.out.println("Eklendi : "+customer.getFirstName());
		}else {
			System.out.println("Kiþi doðrulanamadý");
		}
	}

	public void update(Customer customer) {
		
		System.out.println("Güncellendi : "+customer.getFirstName());
	}
	public void delete(Customer customer) {
		System.out.println("Silindi : "+customer.getFirstName());
	}
}
