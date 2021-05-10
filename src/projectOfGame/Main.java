package projectOfGame;
import java.rmi.RemoteException;

import projectOfGame.abstracts.BaseCustomerManager;
import projectOfGame.abstracts.BaseSaleManager;
import projectOfGame.abstracts.CustomerCheckService;
import projectOfGame.adapters.MernisServiceAdapter;
import projectOfGame.concrete.CampaignManager;
import projectOfGame.concrete.GameSaleManager;
import projectOfGame.concrete.GamerCustomerManager;
import projectOfGame.entities.Campaign;
import projectOfGame.entities.Customer;
import projectOfGame.entities.Game;
import projectOfGame.entities.Gamer;
import projectOfGame.entities.Product;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		
		Campaign campaign = new Campaign(1,"kis",10);
		CampaignManager campaignManager = new CampaignManager(campaign);
		
		Product game = new Game(1,"GTA 5",170,10);
		Customer gamer = new Gamer(1, "Muhammet Utku", "Küçük",1999, "19730393252",100);
		
		BaseSaleManager saleManager = new GameSaleManager(game, gamer, campaign);
		BaseCustomerManager customerManager = new GamerCustomerManager(new MernisServiceAdapter());
		customerManager.addCustomer(gamer);
		
		
		
		

	}

}
