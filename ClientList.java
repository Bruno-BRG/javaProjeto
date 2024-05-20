package mercadoLivre;

import java.util.Scanner;

// essa clase server para inicializar a estrutura da lista encadeada que vai guardar os valores
public class ClientList {

	public Client head;
	public Client tail;
	public int size;

	// construtor para inicializar a lista
	public ClientList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	// metodo para adicionar um cliente na lista
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

	// metdodo para verificar se o cliente esta na lista
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

	public void showClients() {
		Client currentClient = head;
		while (currentClient != null) {
			System.out.println("Name: " + currentClient.getName());
			System.out.println("Email: " + currentClient.getEmail());
			System.out.println("Zip: " + currentClient.getZip());
			System.out.println("Password: " + currentClient.getPassword());
			System.out.println("Username: " + currentClient.getUsername());
			currentClient = currentClient.getNext();
		}
	}
}
