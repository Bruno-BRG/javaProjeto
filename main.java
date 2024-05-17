package mercadoLivre;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		while (option != 4) {
			System.out.println("1: Make a new account");
			System.out.println("2: see list of available items");
			System.out.println("3: Give review in a product");
			System.out.println("4: exit");
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
					item.addProduct(new Item("item1", "description1", "price1", "quantity1"));
					item.addProduct(new Item("item2", "description2", "price2", "quantity2"));
					item.addProduct(new Item("item3", "description3", "price3", "quantity3"));
					item.addProduct(new Item("item4", "description4", "price4", "quantity4"));
					item.addProduct(new Item("item5", "description5", "price5", "quantity5"));
					item.addProduct(new Item("item6", "description6", "price6", "quantity6"));
					item.addProduct(new Item("item7", "description7", "price7", "quantity7"));
					item.addProduct(new Item("item8", "description8", "price8", "quantity8"));
					item.addProduct(new Item("item9", "description9", "price9", "quantity9"));
					item.addProduct(new Item("item10", "description10", "price10", "quantity10"));
					item.showItem();
					
					break;
				case 3:
					break;
				case 4:
					break;
				default:
					System.out.println("Invalid option");
					break;
			}
		}
	}
}
