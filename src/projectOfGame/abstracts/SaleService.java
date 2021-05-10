package projectOfGame.abstracts;

import projectOfGame.entities.Campaign;
import projectOfGame.entities.Customer;
import projectOfGame.entities.Product;

public interface SaleService {
	public void buyProduct(Product product, Customer customer, Campaign campaign);
	
	public void buyProduct(Product product, Customer customer);
	public void sellProduct(Product product, Customer customer);
}
