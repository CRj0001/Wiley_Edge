package AssignmentShoppingApp;

public class Product {
	
	private int prodID;
	private String prodName;
	private double rate;
	private String description;
	
	
	
	public Product(int prodID, String prodName, double rate, String description) {
		super();
		this.prodID = prodID;
		this.prodName = prodName;
		this.rate = rate;
		this.description = description;
	}

	public int getProdID() {
		return prodID;
	}

	public void setProdID(int prodID) {
		this.prodID = prodID;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	void addProduct() {};
	
	void deleteProduct() {};
	
	void viewProduct() {};

	void searchProduct() {};
}
