package model;

public abstract class Item {
	private String ID;
	private String itemName;
	private String brandName;
	private Integer price;

	public Item(String iD, String itemName, String brandName, Integer price) {
		super();
		ID = iD;
		this.itemName = itemName;
		this.brandName = brandName;
		this.price = price;
	}
	
	


	public String getID() {
		return ID;
	}




	public void setID(String iD) {
		ID = iD;
	}




	public String getItemName() {
		return itemName;
	}




	public void setItemName(String itemName) {
		this.itemName = itemName;
	}




	public String getBrandName() {
		return brandName;
	}




	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}




	public Integer getPrice() {
		return price;
	}




	public void setPrice(Integer price) {
		this.price = price;
	}




	public abstract void printItem();
}
