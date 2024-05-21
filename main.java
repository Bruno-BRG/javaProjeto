package mercadoLivre;

import java.util.Scanner;
import mercadoLivre.Client;
import mercadoLivre.Item;
import mercadoLivre.itemList;
import mercadoLivre.purchaseTree;

public class Main {
	public static void main(String[] args) {

		// inicializando as variaveis
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		
		String name = null;
		String email = null;
		String zip = null;
		String password = null;
		String username = null;
		String itemID = null;
		String itemIDReview = null;
		int rating = 0;
		String review = null;

		purchaseTree purchaseTree = new purchaseTree("root");
		reviewQueue reviewQueue = new reviewQueue();	
		ClientList ClientList = new ClientList();
		itemList item = new itemList(100);
		item.addProduct("item1", "description1", "price1", "quantity1", "itemID1");
		item.addProduct("item2", "description2", "price2", "quantity2", "itemID2");
		item.addProduct("item3", "description3", "price3", "quantity3", "itemID3");
		item.addProduct("item4", "description4", "price4", "quantity4", "itemID4");
		item.addProduct("item5", "description5", "price5", "quantity5", "itemID5");

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
					name = scanner.next();
					System.out.println("Enter the email of the client: ");
					email = scanner.next();
					System.out.println("Enter the zip code of the client: ");
					zip = scanner.next();
					System.out.println("Enter the password of the client: ");
					password = scanner.next();
					System.out.println("Enter the username of the client: ");
					username = scanner.next();

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

					// purchaseTree = new purchaseTree(itemID);
					purchaseTree.addPurchase(itemID);
					System.out.println("Purchase made successfully");
					purchaseTree.showPurchase();
					break;

				// mostrar todas as compras recentes
				case 4:
					purchaseTree.showPurchase();
					break;

				// dar review para um item comprado recentemente
				case 5:
					System.out.println("Enter the itemID of the item you want to review: ");
					itemIDReview = scanner.next();
					System.out.println("Enter the rating from 1 to 5");			
					rating = scanner.nextInt();
					System.out.println("Enter the review: ");
					review = scanner.next();
					System.out.println("Review added successfully");
					reviewQueue.addReview(itemIDReview, rating, review);	
					reviewQueue.showReviews();
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
