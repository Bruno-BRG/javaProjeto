package mercadoLivre;

import java.util.Scanner;

public class Item {
	String nameItem;
	String descriptionItem;
	String priceItem;
	String sellerItem;
	Item nextItem;
	Item previousItem;

	public Item(String name, String description, String price, String seller) {
		this.nameItem = name;
		this.descriptionItem = description;
		this.priceItem = price;
		this.sellerItem = seller;
		this.nextItem = null;
		this.previousItem = null;
	}

	public String getName() {
		return nameItem;
	}

	public String getDescription() {
		return descriptionItem;
	}

	public String getPrice() {
		return priceItem;
	}

	public String getSeller() {
		return sellerItem;
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
