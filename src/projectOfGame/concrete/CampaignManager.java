package projectOfGame.concrete;

import projectOfGame.abstracts.CampaignService;
import projectOfGame.entities.Campaign;

public class CampaignManager implements CampaignService{

	Campaign campaign;
	public CampaignManager(Campaign campaign)
	{
		this.campaign = campaign;
	}
	@Override
	public void addCampaign() {
		System.out.println(campaign.getName() + " added");
		
	}

	@Override
	public void deleteCampaign() {
		System.out.println(campaign.getName() + " deleted");		
	}

	@Override
	public void updateCampaign() {
		System.out.println(campaign.getName() + " updated");		
	}
	

}
