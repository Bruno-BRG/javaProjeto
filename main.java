package mercadoLivre;

import java.util.Scanner;
import mercadoLivre.cliente;
import mercadoLivre.listaCliente;
import mercadoLivre.Item;
import mercadoLivre.itemList;
import mercadoLivre.purchaseTree;

public class Main {
	public static void main(String[] args) {

		// inicializando as variaveis
		Scanner scanner = new Scanner(System.in);
		int option = 0;

		String nome = null;
		String email = null;
		String cep = null;
		String senha = null;
		String username = null;
		String itemID = null;
		String itemIDReview = null;
		int nota = 0;
		String review = null;

		purchaseTree purchaseTree = new purchaseTree("root");
		reviewQueue reviewQueue = new reviewQueue();
		listaCliente listaCliente = new listaCliente();
		itemList item = new itemList(100);
		item.addProduct("item1", "description1", "price1", "quantity1", "itemID1");
		item.addProduct("item2", "description2", "price2", "quantity2", "itemID2");
		item.addProduct("item3", "description3", "price3", "quantity3", "itemID3");
		item.addProduct("item4", "description4", "price4", "quantity4", "itemID4");
		item.addProduct("item5", "description5", "price5", "quantity5", "itemID5");

		// switch case para mostrar na tela as oprcoes que o usuario tem
		while (option != 6) {
			System.out.println("1: Criar uma conta ");
			System.out.println("2: Mostrar lista de itens disponiveis na loja");
			System.out.println("3: Fazer uma compra");
			System.out.println("4: Mostrar todas as compras recentes");
			System.out.println("5: Dar review para um item comprado recentemente");
			System.out.println("6: Sair do programa");
			System.out.println("Enter an option: ");
			option = scanner.nextInt();
			switch (option) {

				// criar uma nova conta
				case 1:
					// aqui ele esta pedindo para o usuario digitar o nome, email, zip code,
					// password e username
					System.out.println("Digite seu nome: ");
					nome = scanner.next();
					System.out.println("Digite seu email: ");
					email = scanner.next();
					System.out.println("Digite seu CEP: ");
					cep = scanner.next();
					System.out.println("Digite sua senha: ");
					senha = scanner.next();
					System.out.println("Digite seu nome de usuario: ");
					username = scanner.next();

					listaCliente.addClient(nome, email, cep, senha, username);
					listaCliente.showClients();
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
					nota = scanner.nextInt();
					System.out.println("Enter the review: ");
					review = scanner.next();
					System.out.println("Review added successfully");
					reviewQueue.addReview(itemIDReview, nota, review);
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
