package mercadoLivre;

import java.util.Scanner;

public class Client {
	public String name;
	public String lastName;
	public String email;
	public String zip;
	public String password;
	public String username;
	public Client next;
	public Client previous;
	
	public Client(String name, String lastName, String email,String zip, String password, String username) {
		this.name = name;
		this.lastName = lastName;
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
	
	public String getLastName() {
		return lastName;
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
		this.next = next;
	}

	public Client getPrevious() {
		return previous;
	}

	public void setPrevious(Client previous) {
		this.previous = previous;
	}

}
