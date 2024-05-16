package mercadoLivre;

import java.util.Scanner;

public class BuyerList {

	public Buyer head;
	public Buyer tail;
	public int size;

	public BuyerList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public void addBuyer(String name, String email, String zip, String password, String username) {
		Buyer newBuyer = new Buyer(name, email, zip, password, username);
		if (head == null) {
			head = newBuyer;
			tail = newBuyer;
		} else {
			tail.setNext(newBuyer);
			newBuyer.setPrevious(tail);
			tail = newBuyer;
		}
		size++;
	}

	public void checkBuyer(String username, String password) {
		Buyer currentBuyer = head;
		while (currentBuyer != null) {
			if (currentBuyer.getUsername().equals(username) && currentBuyer.getPassword().equals(password)) {
				System.out.println("Welcome " + currentBuyer.getName());
				return;
			}
			currentBuyer = currentBuyer.getNext();
		}
		System.out.println("Username or password is incorrect.");
	}
}
