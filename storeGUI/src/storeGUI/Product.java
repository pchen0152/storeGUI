package storeGUI;

public class Product {
	String prodCode;			//declaring the variables in the product object
	String prodName;
	String prodDescription;
	String prodPrice;
	String prodAvailability;
	int numOfProducts;
	
	//Constructor - Initializes product objects
	public Product(String prodCode, String prodName, String prodDescription, String prodPrice, String prodAvailability,
			String numOfProducts) {
		this.prodCode = prodCode;
		this.prodName = prodName;
		this.prodDescription = prodDescription;
		this.prodPrice = prodPrice;
		this.prodAvailability = prodAvailability;
		//this.numOfProducts = numOfProducts;
	}

	public String toString() {
		return "Product Code: " + prodCode + "Product Name: " + prodName;
		
	}
	
	//Get and Set Methods for variables
	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDescription() {
		return prodDescription;
	}

	public void setProdDescription(String prodDescription) {
		this.prodDescription = prodDescription;
	}

	/*public int getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
	public boolean isProdAvailability() {
		return prodAvailability;
	}
	public void setProdAvailability(boolean prodAvailability) {
		this.prodAvailability = prodAvailability;
	}*/

	public int getNumOfProducts() {
		return numOfProducts;
	}

	public void setNumOfProducts(int numOfProducts) {
		this.numOfProducts = numOfProducts;
	}

}