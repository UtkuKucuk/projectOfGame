package projectOfGame.concrete;

import projectOfGame.abstracts.CustomerCheckService;
import projectOfGame.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

}
