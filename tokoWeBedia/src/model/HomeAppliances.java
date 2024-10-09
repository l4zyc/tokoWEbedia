package model;

public class HomeAppliances extends Item{
	private Integer powerUsage;

	
	
	public HomeAppliances(String iD, String itemName, String brandName, Integer price, Integer powerUsage) {
		super(iD, itemName, brandName, price);
		this.powerUsage = powerUsage;
	}

	
	

	public Integer getPowerUsage() {
		return powerUsage;
	}




	public void setPowerUsage(Integer powerUsage) {
		this.powerUsage = powerUsage;
	}




	@Override
	public void printItem() {
		System.out.printf("%s %s %s %d %d\n",
				getID(), getItemName(), getBrandName(), getPrice(), getPowerUsage()
				);
	}

}
