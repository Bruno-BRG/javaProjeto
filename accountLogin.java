package mercadoLivre;

import java.util.Scanner;

// i want this class to go though the list of clients and buyers and check if the username and password match

public class accountLogin {
	ClientList clientList = new ClientList();
	BuyerList buyerList = new BuyerList();
	Scanner input = new Scanner(System.in);

	public void login() {
		System.out.println("Enter your username: ");
		String username = input.nextLine();
		System.out.println("Enter your password: ");
		String password = input.nextLine();
		Client currentClient = clientList.head;
		Buyer currentBuyer = buyerList.head;
		while (currentClient != null) {
			if (currentClient.getUsername().equals(username) && currentClient.getPassword().equals(password)) {
				System.out.println("baubuinos dancantes " + currentClient.getName());
				break;
			}
			currentClient = currentClient.getNext();
		}
		while (currentBuyer != null) {
			if (currentBuyer.getUsername().equals(username) && currentBuyer.getPassword().equals(password)) {
				System.out.println("Welcome " + currentBuyer.getName());
				break;
			}
			currentBuyer = currentBuyer.getNext();
		}
	}
}
