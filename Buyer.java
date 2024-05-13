package mercadoLivre;

import java.util.Scanner;

public class Buyer {
	public String nameBuyer;
	public String emailBuyer;
	public String zipBuyer;
	public String passwordBuyer;
	public String usernameBuyer;
	public Buyer nextBuyer;
	public Buyer previousBuyer;

	public Buyer(String name, String email, String zip, String password, String username) {
		this.nameBuyer = name;
		this.emailBuyer = email;
		this.zipBuyer = zip;
		this.passwordBuyer = password;
		this.usernameBuyer = username;
		this.nextBuyer = null;
		this.previousBuyer = null;
	}

	public String getName() {
		return nameBuyer;
	}

	public String getEmail() {
		return emailBuyer;
	}

	public String getZip() {
		return zipBuyer;
	}

	public String getPassword() {
		return passwordBuyer;
	}

	public String getUsername() {
		return usernameBuyer;
	}

	public Buyer getNext() {
		return nextBuyer;
	}

	public void setNext(Buyer next) {
		this.nextBuyer = next;
	}

	public Buyer getPrevious() {
		return previousBuyer;
	}

	public void setPrevious(Buyer previous) {
		this.previousBuyer = previous;
	}
}
