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
				System.out.println("Item not foun.");
				break;
			}
		}
	}
	// add 10 items here for unit test of the class

	public static void main(String[] args) {
		itemList list = new itemList();
		list.addItem("item1", "description1", 10.0, 10);
		list.addItem("item2", "description2", 20.0, 20);
		list.addItem("item3", "description3", 30.0, 30);
		list.addItem("item4", "description4", 40.0, 40);
		list.addItem("item5", "description5", 50.0, 50);
		list.addItem("item6", "description6", 60.0, 60);
		list.addItem("item7", "description7", 70.0, 70);
		list.addItem("item8", "description8", 80.0, 80);
		list.addItem("item9", "description9", 90.0, 90);
		list.addItem("item10", "description10", 100.0, 100);
		list.showItems();
	}
}
