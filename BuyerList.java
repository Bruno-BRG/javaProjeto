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

	public void showBuyers() {
		Buyer currentBuyer = head;
		while (currentBuyer != null) {
			System.out.println("Name: " + currentBuyer.getName());
			System.out.println("Email: " + currentBuyer.getEmail());
			System.out.println("Zip code: " + currentBuyer.getZip());
			System.out.println("Password: " + currentBuyer.getPassword());
			System.out.println("Username: " + currentBuyer.getUsername());
			currentBuyer = currentBuyer.getNext();
		}
	}

	public void removeBuyer(String username) {
		Buyer currentBuyer = head;
		while (currentBuyer != null) {
			if (currentBuyer.getUsername().equals(username)) {
				if (currentBuyer == head) {
					head = currentBuyer.getNext();
					head.setPrevious(null);
				} else if (currentBuyer == tail) {
					tail = currentBuyer.getPrevious();
					tail.setNext(null);
				} else {
					currentBuyer.getPrevious().setNext(currentBuyer.getNext());
					currentBuyer.getNext().setPrevious(currentBuyer.getPrevious());
				}
				size--;
				break;
			}
			currentBuyer = currentBuyer.getNext();
		}
	}
}
