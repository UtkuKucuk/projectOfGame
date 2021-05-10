package projectOfGame.concrete;

import projectOfGame.abstracts.BaseSaleManager;
import projectOfGame.entities.Campaign;
import projectOfGame.entities.Customer;
import projectOfGame.entities.Product;

public class GameSaleManager extends BaseSaleManager{

	public GameSaleManager()
	{
		
	}
	public GameSaleManager(Product product, Customer customer, Campaign campaign)
	{
		
	}
	@Override
	public void buyProduct(Product product, Customer customer, Campaign campaign) {
		int productPrice = product.getProductPrice();
		int newProductPrice = productPrice - (productPrice * campaign.getCampaignDiscount())/100;
		System.out.println("You bought the 	Game: "+ product.getProductName() + " with " + campaign.getCampaignDiscount() + " discount for " + newProductPrice + ", "+ customer.getFirstName());
	}

	@Override
	public void sellProduct(Product product, Customer customer) {
		System.out.println("You sold the Game: "+ product.getProductName()+ ", " + customer.getFirstName());
		
	}

	@Override
	public void buyProduct(Product product, Customer customer) {
		System.out.println("You bought the Game: "+ product.getProductName()+ ", " + customer.getFirstName());
		
	}
}
