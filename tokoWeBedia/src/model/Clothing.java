package model;

public class Clothing extends Item{

	private String size;


	public Clothing(String iD, String itemName, String brandName, Integer price, String size) {
		super(iD, itemName, brandName, price);
		this.size = size;
	}

	


	public String getSize() {
		return size;
	}




	public void setSize(String size) {
		this.size = size;
	}




	@Override
	public void printItem() {
		System.out.printf("%s %s %s %d %s\n",
				getID(), getItemName(), getBrandName(), getPrice(), getSize()
				);
	}
	
	
}
