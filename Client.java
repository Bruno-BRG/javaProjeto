package mercadoLivre;

import java.util.Scanner;

// essa clase inicializa os valores que serao guaradados e utilizados para a funcionalidade da lista
public class Client {
	String name;
	String email;
	String zip;
	String password;
	String username;
	Client next;
	Client previous;

	// construtor para inicializar os clientes
	public Client(String name, String email, String zip, String password, String username) {
		this.name = name;
		this.email = email;
		this.zip = zip;
		this.password = password;
		this.username = username;
		this.next = null;
		this.previous = null;
	}

	// metodos para pegar os valores dos clientes

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
		this.next = next;
	}

	public Client getPrevious() {
		return previous;
	}

	public void setPrevious(Client previous) {
		this.previous = previous;
	}
}
