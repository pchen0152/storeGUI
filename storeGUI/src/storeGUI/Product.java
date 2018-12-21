package storeGUI;

public class Product {			
	//declaring the variables in the product object
	private String prodName;
	private double prodPrice;
	private int numOfItem;
	
	//Constructor - Initializes product objects
	/*
	 * public Product(String prodName, double prodPrice, int numOfItem) {
	 * this.prodName = prodName; this.prodPrice = prodPrice; this.numOfItem =
	 * numOfItem; }
	 */

	public String toString() {
		return "\nProduct Name: " + prodName + "\nPrice: " + prodPrice + "\nNumber in storage: " + numOfItem;
		
	}
	
	//Get and Set Methods for variables

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getProdPrice() {
		return prodPrice;
	}
	
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

	public int getNumOfItem() {
		return numOfItem;
	}

	public void setNumOfItem(int numOfItem) {
		this.numOfItem = numOfItem;
	}

}