package projectOfGame.entities;

public class Campaign {

	private int campaignId;
	private String name;
	private int campaignDiscount;
	
	public Campaign()
	{
		
	}
	
	public Campaign(int campaignId, String name, int campaignDiscount) {
		super();
		this.campaignId = campaignId;
		this.name = name;
		this.campaignDiscount = campaignDiscount;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCampaignDiscount() {
		return campaignDiscount;
	}

	public void setCampaignDiscount(int campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}
	
	
}
