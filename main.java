package mercadoLivre;

import java.util.Scanner;
import mercadoLivre.Client;
import mercadoLivre.Item;
import mercadoLivre.itemList;
import mercadoLivre.purchaseTree;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		String itemID = null;
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

		// switch case para mostrar na tela as oprcoes que o usuario tem
		while (option != 6) {
			System.out.println("1: Make a new account");
			System.out.println("2: see list of available items");
			System.out.println("3: Make a purchase");
			System.out.println("4: Show all recent purchases");
			System.out.println("5: Give review to any recent bough products");
			System.out.println("6: exit");
			System.out.println("Enter an option: ");
			option = scanner.nextInt();
			switch (option) {

				// criar uma nova conta
				case 1:
					// aqui ele esta pedindo para o usuario digitar o nome, email, zip code,
					// password e username
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

					ClientList ClientList = new ClientList();
					ClientList.addClient(name, email, zip, password, username);
					ClientList.showClients();
					break;

				// Mostrar os items disponiveis na loja
				case 2:
					item.showItem();
					break;

				// fazer uma compra
				case 3:
					// aqui ele esta pedindo para o usuario digitar o itemID do item que ele quer
					// comprar
					System.out.println("Enter the itemID of the item you want to purchase: ");
					itemID = scanner.next();

					purchaseTree purchaseTree = new purchaseTree(itemID);
					purchaseTree.addPurchase(itemID);
					System.out.println("Purchase made successfully");
					purchaseTree.showPurchase();
					break;

				// mostrar todas as compras recentes
				case 4:
					purchaseTree purchaseTree1 = new purchaseTree(itemID);
					purchaseTree1.showPurchase();
					break;

				// dar review para um item comprado recentemente
				case 5:
					break;

				// sair do programa
				case 6:
					break;

				// caso o usuario digite uma opcao invalida
				default:
					System.out.println("Invalid option");
					break;
			}
		}
	}
}
