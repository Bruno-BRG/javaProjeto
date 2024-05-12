
package mercadoLivre;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		while (option != 7) {
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
					// i want to add a new client to the Client class if this option is picked
					System.out.println("Enter the name of the client: ");			
					String name = scanner.next();
					System.out.println("Enter the last name of the client: ");
					String lastName = scanner.next();
					System.out.println("Enter the email of the client: ");
					String email = scanner.next();
					System.out.println("Enter the zip code of the client: ");
					String zip = scanner.next();
					System.out.println("Enter the password of the client: ");
					String password = scanner.next();
					System.out.println("Enter the username of the client: ");
					String username = scanner.next();
					Client client = new Client(name, lastName, email, zip, password, username);
					break;
				case 2:
					break;
				case 3:	
					break;
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

