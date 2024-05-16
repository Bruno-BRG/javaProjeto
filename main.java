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
