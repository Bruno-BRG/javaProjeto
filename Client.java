package mercadoLivre;

import java.util.Scanner;

public class Client {
	String name;
	String email;
	String zip;
	String password;
	String username;
	Client next;
	Client previous;

	public Client(String name, String email, String zip, String password, String username) {
		this.name = name;
		this.email = email;
		this.zip = zip;
		this.password = password;
		this.username = username;
		this.next = null;
		this.previous = null;
	}

	public String getName() {
		return name;
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
		return next;
	}

	public void setNext(Client next) {
		this.nextClient = next;
	}

	public Client getPrevious() {
		return previous;
	}

	public void setPrevious(Client previous) {
		this.previousClient = previous;
	}
}
