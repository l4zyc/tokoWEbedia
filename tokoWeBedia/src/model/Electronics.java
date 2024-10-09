package model;

public class Electronics extends Item{
	
	private Integer warrantyPeriod;

	
	
	public Electronics(String iD, String itemName, String brandName, Integer price, Integer warrantyPeriod) {
		super(iD, itemName, brandName, price);
		this.warrantyPeriod = warrantyPeriod;
	}
	

	

	public Integer getWarrantyPeriod() {
		return warrantyPeriod;
	}




	public void setWarrantyPeriod(Integer warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}




	@Override
	public void printItem() {
		System.out.printf("%s %s %s %d %d\n",
				getID(), getItemName(), getBrandName(), getPrice(), getWarrantyPeriod()
				);
	}

	
	
}
