package mercadoLivre;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		while (option != 5) {
			System.out.println("1: Make a new account");
			System.out.println("2: see list of available items");
			System.out.println("3: Make a purchase");
			System.out.println("4: give review on a product");
			System.out.println("5: exit");
			System.out.println("Enter an option: ");
			option = scanner.nextInt();
			switch (option) {
				case 1:
					System.out.println("Enter the name of the client: ");
					String name = scanner.next();
					System.out.println("Enter the email of the client: ");
					String email = scanner.next();
					System.out.println("Enter the zip code of the client: ");
					String zip = scanner.next();
					System.out.println("Enter the password of the client: ");
					String password = scanner.next();
					System.out.println("Enter the username of the client: ");
					String username = scanner.next();
					Client client = new Client(name, email, zip, password, username);
					break;

				case 2:
					// i want to print all the item in the list here
					itemList item = new itemList(10);
					item.addProduct(new Item("item1", "description1", "price1", "quantity1", "itemID1"));
					item.addProduct(new Item("item2", "description2", "price2", "quantity2", "itemID2"));
					item.addProduct(new Item("item3", "description3", "price3", "quantity3", "itemID3"));
					item.addProduct(new Item("item4", "description4", "price4", "quantity4", "itemID4"));
					item.addProduct(new Item("item5", "description5", "price5", "quantity5", "itemID5"));
					item.addProduct(new Item("item6", "description6", "price6", "quantity6", "itemID6"));
					item.addProduct(new Item("item7", "description7", "price7", "quantity7", "itemID7"));
					item.addProduct(new Item("item8", "description8", "price8", "quantity8", "itemID8"));
					item.addProduct(new Item("item9", "description9", "price9", "quantity9", "itemID9"));
					item.addProduct(new Item("item10", "description10", "price10", "quantity10", "itemID10"));
					item.showItem();
					break;
				case 3:
					purchaseTree purchase = new purchaseTree("itemID1");
					purchase.addPurchase("itemID2");
					purchase.addPurchase("itemID3");
					purchase.addPurchase("itemID4");
					purchase.addPurchase("itemID5");
					purchase.showPurchase();
					break;
				case 4:
					break;
				case 5:
					break;
				default:
					System.out.println("Invalid option");
					break;
			}
		}
	}
}
