package util;

import java.util.Random;
import java.util.Scanner;

public interface func {
	public static void Enter() {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
	}
	
	public static String generateID(String type) {
		Random rand = new Random();
		String typeID = "";
		
		switch(type) {
		case "Electronic":
			typeID = "EL";
			break;
		case "Clothing":
			typeID = "CL";
			break;
		case "Home Appliances":
			typeID = "HA";
			break;
		default:
			System.out.println("Unknown");
		}
		
		Integer randNum = rand.nextInt(999);
		
		String ID = String.format("%s%03d", typeID, randNum);
		
		return ID;
	}
}
