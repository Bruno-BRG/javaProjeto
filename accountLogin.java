package mercadoLivre;

import java.util.Scanner;

// i want this class to run through the client and buyer class check the node in their lists and compare the the inout from the user to see if there is a valid account matching the input is so tell that the login was sucesscfullif not that it was unsuccsefull

public class accountLogin {
	public void login() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your username: ");
		String username = scanner.next();
		System.out.println("Enter your password: ");
		String password = scanner.next();
		while (currentClient != null) {
			if (currentClient.getUsername().equals(username) && currentClient.getPassword().equals(password)) {
				System.out.println("Login successful");
				break;
			}
			currentClient = currentClient.getNext();
		}
		while (currentBuyer != null) {
			if (currentBuyer.getUsername().equals(username) && currentBuyer.getPassword().equals(password)) {
				System.out.println("Login successful");
				break;
			}
			currentBuyer = currentBuyer.getNext();
		}
		System.out.println("Login unsuccessful");
	}
}
