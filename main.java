package mercadoLivre;

import java.util.Scanner;

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

		arvoreCompras compras = new arvoreCompras("raiz");
		filaReview filaReview = new filaReview();
		listaCliente cliente = new listaCliente();
		listaItens item = new listaItens(10);
		item.adicionarProduto("item1", "description1", "price1", "quantity1", "itemID1");
		item.adicionarProduto("item2", "description2", "price2", "quantity2", "itemID2");
		item.adicionarProduto("item3", "description3", "price3", "quantity3", "itemID3");
		item.adicionarProduto("item4", "description4", "price4", "quantity4", "itemID4");
		item.adicionarProduto("item5", "description5", "price5", "quantity5", "itemID5");

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
					System.out.println("Conta criada com sucesso!");
					System.out.println("-----------------------------");

					cliente.adicionarCliente(nome, email, cep, senha, username);
					cliente.mostrarClientes();
					break;

				// Mostrar os items disponiveis na loja
				case 2:
					item.mostrarItens();
					break;

				// fazer uma compra
				case 3:
					// aqui ele esta pedindo para o usuario digitar o itemID do item que ele quer
					// comprar
					System.out.println("Digite o Id do item que deseja comprar(itemID1): ");
					itemID = scanner.next();

					compras.adicionarCompra(itemID);
					System.out.println("Compra registrada com sucesso!");
					System.out.println("-----------------------------");
					compras.mostrarCompras();
					break;

				// mostrar todas as compras recentes
				case 4:
					System.out.println("-----------------------------");
					System.out.println("Compras recentes: ");
					System.out.println(" ");
					compras.mostrarCompras();
					break;

				// dar review para um item comprado recentemente
				case 5:
					System.out.println("Digite a Id do item que deseja fazer a review: ");
					itemIDReview = scanner.next();
					System.out.println("Digite uma note de 1 a 5");
					nota = scanner.nextInt();
					System.out.println("Escreva sua review: ");
					review = scanner.next();
					System.out.println("Review adicionada com sucesso!");
					filaReview.adicionarReview(itemIDReview, nota, review);
					System.out.println("-----------------------------");
					filaReview.mostrarReviews();
					break;

				// sair do programa
				case 6:
					break;

				// caso o usuario digite uma opcao invalida
				default:
					System.out.println("Opcao invalida!");
					break;
			}
		}
	}
}
