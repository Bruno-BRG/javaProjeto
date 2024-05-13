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

	public void showClients() {
		Client currentClient = head;
		while (currentClient != null) {
			System.out.println("Name: " + currentClient.getName());
			System.out.println("Email: " + currentClient.getEmail());
			System.out.println("Zip code: " + currentClient.getZip());
			System.out.println("Password: " + currentClient.getPassword());
			System.out.println("Username: " + currentClient.getUsername());
			currentClient = currentClient.getNext();
		}
	}

	public int getSize() {
		return size;
	}

	public void showList() {
		if (isEmpty()) {
			System.out.println("The list is empty.");
		} else {
			showClients();
		}
	}
}
