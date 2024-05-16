package mercadoLivre;

import java.util.Scanner;

public class Item {
	String nameItem;
	String descriptionItem;
	double priceItem;
	int quantityItem;
	Item nextItem;
	Item previousItem;

	public Item(String name, String description, double price, int quantity) {
		this.nameItem = name;
		this.descriptionItem = description;
		this.priceItem = price;
		this.quantityItem = quantity;
		this.nextItem = null;
		this.previousItem = null;
	}

	public String getName() {
		return nameItem;
	}

	public String getDescription() {
		return descriptionItem;
	}

	public double getPrice() {
		return priceItem;
	}

	public int getQuantity() {
		return quantityItem;
	}

	public Item getNext() {
		return nextItem;
	}

	public void setNext(Item next) {
		this.nextItem = next;
	}

	public Item getPrevious() {
		return previousItem;
	}

	public void setPrevious(Item previous) {
		this.previousItem = previous;
	}
}
