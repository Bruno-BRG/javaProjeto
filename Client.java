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
		return emailClient;
	}

	public String getZip() {
		return zipClient;
	}

	public String getPassword() {
		return passwordClient;
	}

	public String getUsername() {
		return usernameClient;
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
