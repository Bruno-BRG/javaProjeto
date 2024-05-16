package mercadoLivre;

import java.util.Scanner;

//i want a class that will store the list of items in a stack

public class itemList {
	public Item head;
	public Item tail;
	public int size;

	public itemList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public void addItem(String name, String description, double price, int quantity) {
		Item newItem = new Item(name, description, price, quantity);
		if (head == null) {
			head = newItem;
			tail = newItem;
		} else {
			tail.setNext(newItem);
			newItem.setPrevious(tail);
			tail = newItem;
		}
		size++;
	}

	public void showItems() {
		Item currentItem = head;
		while (currentItem != null) {
			System.out.println("Name: " + currentItem.getName());
			System.out.println("Description: " + currentItem.getDescription());
			System.out.println("Price: " + currentItem.getPrice());
			System.out.println("Quantity: " + currentItem.getQuantity());
			currentItem = currentItem.getNext();
		}
	}

	public int getSize() {
		return size;
	}

	public void checkItem(String name) {
		Item currentItem = head;
		while (currentItem != null) {
			if (currentItem.getName().equals(name)) {
				System.out.println("Item found: " + currentItem.getName());
				break;
			} else {
				System.out.println("Item not found.");
				break;
			}
		}
	}
}

// fill the stack with 10 random items
