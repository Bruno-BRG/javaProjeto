package mercadoLivre;

import java.util.Scanner;

// i want a main class and method that print the options on the screen but doesnt print them when the login is successful if it is successful it will print a different set of options//

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		if (option != 7) {
			System.out.println("1: add a new client");
			System.out.println("2: add a new buyer");
			System.out.println("3: Enter in your account");
			System.out.println("4: add a new product to sell");
			System.out.println("5: see list of available items");
			System.out.println("6: see list of bought items");
			System.out.println("7: exit");
			System.out.println("Enter an option: ");
			option = scanner.nextInt();
			switch (option) {
				case 1:
					System.out.println("Enter the name of the client: ");
					String nameClient = scanner.next();
					System.out.println("Enter the email of the client: ");
					String emailClient = scanner.next();
					System.out.println("Enter the zip code of the client: ");
					String zipClient = scanner.next();
					System.out.println("Enter the password of the client: ");
					String passwordClient = scanner.next();
					System.out.println("Enter the username of the client: ");
					String usernameClient = scanner.next();
					Client client = new Client(nameClient, emailClient, zipClient, passwordClient, usernameClient);
					break;

				case 2:
					System.out.println("Enter the name of the buyer: ");
					String nameBuyer = scanner.next();
					System.out.println("Enter the email of the buyer: ");
					String emailBuyer = scanner.next();
					System.out.println("Enter the zip code of the buyer: ");
					String zipBuyer = scanner.next();
					System.out.println("Enter the password of the buyer: ");
					String passwordBuyer = scanner.next();
					System.out.println("Enter the username of the buyer: ");
					String usernameBuyer = scanner.next();
					Buyer buyer = new Buyer(nameBuyer, emailBuyer, zipBuyer, passwordBuyer, usernameBuyer);
					break;
				case 3:
					System.out.println("Enter your username: ");
					String username = scanner.next();
					System.out.println("Enter your password: ");
					String password = scanner.next();
					ClientList clientList = new ClientList();
					BuyerList buyerList = new BuyerList();
					Client currentClient = clientList.head;
					Buyer currentBuyer = buyerList.head;
					while (currentClient != null) {
						if (currentClient.getUsername().equals(username)
								&& currentClient.getPassword().equals(password)) {
							System.out.println("Welcome " + currentClient.getName());
							break;
						}
						currentClient = currentClient.getNext();
					}
					while (currentBuyer != null) {
						if (currentBuyer.getUsername().equals(username)
								&& currentBuyer.getPassword().equals(password)) {
							System.out.println("Welcome " + currentBuyer.getName());
							break;
						}
						currentBuyer = currentBuyer.getNext();
					}

				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				default:
					System.out.println("Invalid option");
					break;
			}
		}
	}
}
