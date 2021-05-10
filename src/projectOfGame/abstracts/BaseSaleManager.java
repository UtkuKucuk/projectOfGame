package projectOfGame.abstracts;

import projectOfGame.entities.Campaign;
import projectOfGame.entities.Customer;
import projectOfGame.entities.Product;

public class BaseSaleManager implements SaleService{

	@Override
	public void buyProduct(Product product, Customer customer, Campaign campaign) {
		int productPrice = product.getProductPrice();
		int newProductPrice = productPrice - (productPrice * campaign.getCampaignDiscount())/100;
		System.out.println("You bought the "+ product.getProductName() + " with " + campaign.getCampaignDiscount() + " discount for " + newProductPrice + ", "+ customer.getFirstName());
	}

	@Override
	public void sellProduct(Product product, Customer customer) {
		System.out.println("You sold the "+ product.getProductName()+ ", " + customer.getFirstName());
		
	}

	@Override
	public void buyProduct(Product product, Customer customer) {
		System.out.println("You bought the "+ product.getProductName()+ ", " + customer.getFirstName());
		
	}

	

}
