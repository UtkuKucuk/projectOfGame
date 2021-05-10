package projectOfGame.abstracts;

import projectOfGame.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void addCustomer(Customer customer) {
		System.out.println(customer.getFirstName() + " added to db");
	}

	@Override
	public void deleteCustomer(Customer customer) {
		System.out.println(customer.getLastName() + " deleted to db");
	}

	@Override
	public void updateCustomer(Customer customer) {
		System.out.println(customer.getFirstName() + " updated to db");
	}
	
}
