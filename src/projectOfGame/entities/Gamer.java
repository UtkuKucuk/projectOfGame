package projectOfGame.entities;

public class Gamer extends Customer{
	private int wallet;

	public Gamer()
	{
		
	}
	
	public Gamer(int id, String firstName, String lastName, int birthOfYear, String nationalityId, int wallet) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setBirthYear(birthOfYear);
		this.setNationalityId(nationalityId);
		this.setWallet(wallet);
	}


	public int getWallet() {
		return wallet;
	}



	public void setWallet(int wallet) {
		this.wallet = wallet;
	}



	

	
}
