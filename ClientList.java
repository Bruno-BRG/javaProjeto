package mercadoLivre;

import java.util.Scanner;

public class ClientList {

	public Client head;
	public Client tail;
	public int size;

	public ClientList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public void addClient(String name, String email, String zip, String password, String username) {
		Client newClient = new Client(name, email, zip, password, username);
		if (head == null) {
			head = newClient;
			tail = newClient;
		} else {
			tail.setNext(newClient);
			newClient.setPrevious(tail);
			tail = newClient;
		}
		size++;
	}

	public void checkClient(String username, String password) {
		Client currentClient = head;
		while (currentClient != null) {
			if (currentClient.getUsername().equals(username) && currentClient.getPassword().equals(password)) {
				System.out.println("Welcome " + currentClient.getName());
				break;
			} else {
				System.out.println("Username or password is incorrect.");
				break;
			}
		}
	}

}
