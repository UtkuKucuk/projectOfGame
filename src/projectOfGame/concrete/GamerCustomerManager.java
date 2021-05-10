package projectOfGame.concrete;

import projectOfGame.abstracts.BaseCustomerManager;
import projectOfGame.abstracts.CustomerCheckService;
import projectOfGame.entities.Customer;

public class GamerCustomerManager extends BaseCustomerManager{
	CustomerCheckService customerCheckService;
	private String message;
	public GamerCustomerManager(CustomerCheckService customerCheckService)
	{
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void addCustomer(Customer customer) {
		
		message = customer.getFirstName() + " added to gamer db";
		trueOrFalse(customer,message);
	}

	@Override
	public void deleteCustomer(Customer customer) {
		message = customer.getLastName() + " deleted to gamer db";
		trueOrFalse(customer,message);
	}

	@Override
	public void updateCustomer(Customer customer) {

		message = customer.getFirstName() + " updated to gamer db";
		trueOrFalse(customer,message);
	}
	private void trueOrFalse(Customer customer, String message)
	{
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println(message);
		} 
		else {
			System.out.println("Not a valid person");
		}
	}
	

}
