package mercadoLivre;

import java.util.Scanner;

public class itemList {
	public Item[] productStack;
	public int top;
	public int capacity;

	public itemList(int capacity) {
		this.capacity = capacity;
		productStack = new Item[capacity];
		top = -1;
	}

	// Method to add a product to the stack
	public void addProduct(Item Item) {
		if (top < capacity - 1) {
			productStack[++top] = Item;
			// System.out.println("Added: " + Item.nameItem + " " + Item.descriptionItem + "
			// " + Item.priceItem + " "
			// + Item.quantityItem + " " + Item.itemID);
		} else {
			System.out.println("Stack is full! Cannot add product: " + Item);
		}
	}

	// Method to view the product on top of the stack
	public Item peekProduct() {
		if (top >= 0) {
			return productStack[top];
		} else {
			System.out.println("No products to view!");
			return null;
		}
	}

	// Method to check if the stack is empty
	public boolean isEmpty() {
		return top == -1;
	}

	// method to show all items on the stack
	public void showItem() {
		if (top >= 0) {
			System.out.println("Items in the stack:");
			for (int i = top; i >= 0; i--) {
				// i want to print all the name of all the items in the list
				System.out.println(productStack[i].nameItem + " " + productStack[i].descriptionItem + " "
						+ productStack[i].priceItem + " " + productStack[i].quantityItem + " "
						+ productStack[i].itemID);

			}
		} else {
			System.out.println("No items to show!");
		}
	}
}
