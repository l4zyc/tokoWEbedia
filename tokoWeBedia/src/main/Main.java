package main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.Electronics;
import model.Item;
import util.func;

public class Main {

	private Scanner sc = new Scanner(System.in);
	private ArrayList<Item> items = new ArrayList<Item>();

	public void menu() {
		int choice = -1;
		
		do {
			System.out.println("1. Add Item");
			System.out.println("2. View");
			System.out.println("3. Delete");
			System.out.println("4. Exit");
			System.out.print(">> ");
			choice = sc.nextInt(); sc.nextLine();
			
			switch(choice) {
			case 1:
				add();
				break;
			case 2:
				view();
				break;
			case 3:
				break;
			}
			
		} while(choice != 4);
		
		System.out.print("Thank you for using this Program...");
		func.Enter();
	}
	
	public void add() {
		String category = null;
		String itemName = null;
		String brandName = null;
		Integer price = null;
		Item item = null;
		
		do {
			System.out.print("Input Category: ");
			category = sc.nextLine();
		} while(validateCategory(category));
		
		do {
			System.out.print("Input Item Name: ");
			itemName = sc.nextLine();
		} while(validateItemName(itemName));
		
		do {
			System.out.print("Input Brand Name: ");
			brandName = sc.nextLine();
		} while(validateBrandName(brandName));
		
		do {
			try {
				System.out.print("Input Price: ");
				price = sc.nextInt(); sc.nextLine();
			} catch(InputMismatchException e) {
				sc.next();
				System.out.println("Not a Number\n");
			}
		} while(validatePrice(price));
		
		String ID = func.generateID(category);
		
		switch(category) {
		case "Electronic":
			int period = electValid();
			item = new Electronics(ID, itemName, brandName, price, period);
			break;
		case "Clothing":
			String size = validSize();
			break;
		case "Home Appliances":
			break;
		}
		
		items.add(item);
	}
	
	public void view() {
		for (Item item : items) {
			item.printItem();
		}
	}
	
	public boolean validateCategory(String category) {
		if(category.equals("Electronic") || category.equals("Clothing") || category.equals("Home Appliances")) {
			return false;
		}
		
		return true;
	}
	
	public boolean validateItemName(String name) {
		if(name.length() < 3 || name.length() > 30) {
			return true;
		}
		
		return false;
	}
	
	public boolean validateBrandName(String name) {
		if(name.contains(" ")) {
			return true;
		}
		
		for(int i = 0; i < name.length(); i++) {
			char s = name.charAt(i);
			
			if(!Character.isAlphabetic(s)) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean validatePrice(int price) {
	
		if(price > 0) {
			return false;
		}
		
		return true;
	}
	
	public int electValid() {
		int period = -1;
		
		do {
			System.out.print("Input period: ");
			period = sc.nextInt(); sc.nextLine();
		} while(period < 0 || period > 12);
		
		return period;
	}
	
	public String validSize() {
		String size = "";
		
		do {
			System.out.print("Input Brand Name: ");
			size = sc.nextLine();
		} while(!size.equals("Small") && !size.equals("Medium") && !size.equals("Large"));
		
		return size;
	}
	
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		menu();
	}
}
