package projectOfGame.entities;

public class Game extends Product{
	private int productReleaseDate;

	public Game()
	{
		
	}
	
	public Game(int productId, String productName, int productPrice, int productReleaseDate) {
		this.setProductId(productId);
		this.setProductName(productName);
		this.setProductPrice(productPrice);
		this.setProductReleaseDate(productReleaseDate);
		
	}

	public int getProductReleaseDate() {
		return productReleaseDate;
	}

	public void setProductReleaseDate(int productReleaseDate) {
		this.productReleaseDate = productReleaseDate;
	}
	
	
	
}
