package mercadoLivre;

import java.util.Scanner;

public class Client {
	String nameClient;
	String emailClient;
	String zipClient;
	String passwordClient;
	String usernameClient;
	Client nextClient;
	Client previousClient;

	public Client(String name, String email, String zip, String password, String username) {
		this.nameClient = name;
		this.emailClient = email;
		this.zipClient = zip;
		this.passwordClient = password;
		this.usernameClient = username;
		this.nextClient = null;
		this.previousClient = null;
	}

	public String getName() {
		return nameClient;
	}

	public String getEmail() {
		return email;
	}

	public String getZip() {
		return zip;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public Client getNext() {
		return nextClient;
	}

	public void setNext(Client next) {
		this.nextClient = next;
	}

	public Client getPrevious() {
		return previousClient;
	}

	public void setPrevious(Client previous) {
		this.previousClient = previous;
	}

}

private class ClientList {

	private Client head;
	private Client tail;
	private int size;

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

	public void removeClient(String username) {
		Client currentClient = head;
		while (currentClient != null) {
			if (currentClient.getUsername().equals(username)) {
				if (currentClient == head) {
					head = currentClient.getNext();
					head.setPrevious(null);
				} else if (currentClient == tail) {
					tail = currentClient.getPrevious();
					tail.setNext(null);
				} else {
					currentClient.getPrevious().setNext(currentClient.getNext());
					currentClient.getNext().setPrevious(currentClient.getPrevious());
				}
				size--;
				break;
			}
			currentClient = currentClient.getNext();
		}
	}

	public void editClient(String username) {
		Client currentClient = head;
		while (currentClient != null) {
			if (currentClient.getUsername().equals(username)) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the new name: ");
				String name = scanner.nextLine();
				System.out.println("Enter the new email: ");
				String email = scanner.nextLine();
				System.out.println("Enter the new zip code: ");
				String zip = scanner.nextLine();
				System.out.println("Enter the new password: ");
				String password = scanner.nextLine();
				System.out.println("Enter the new username: ");
				String newUsername = scanner.nextLine();
				currentClient.nameClient = name;
				currentClient.email = email;
				currentClient.zip = zip;
				currentClient.password = password;
				currentClient.username = newUsername;
				break;
			}
			currentClient = currentClient.getNext();
		}
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void showSize() {
		System.out.println("The size of the list is: " + size);
	}

	public void showHead() {
		System.out.println("The head of the list is: " + head.getName());
	}

	public void showTail() {
		System.out.println("The tail of the list is: " + tail.getName());
	}

	public void showEmpty() {
		if (isEmpty()) {
			System.out.println("The list is empty.");
		} else {
			System.out.println("The list is not empty.");
		}
	}

	public void showList() {
		if (isEmpty()) {
			System.out.println("The list is empty.");
		} else {
			showClients();
		}
	}

	public void showRemove(String username) {
		removeClient(username);
		showClients();
	}

	public void showEdit(String username) {
		editClient(username);
		showClients();
	}
}
