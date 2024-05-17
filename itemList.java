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
			System.out.println("Added: " + Item);
		} else {
			System.out.println("Stack is full! Cannot add product: " + Item);
		}
	}

	// Method to remove a product from the stack
	public Item removeProduct() {
		if (top >= 0) {
			Item removedProduct = productStack[top--];
			System.out.println("Removed: " + removedProduct);
			return removedProduct;
		} else {
			System.out.println("No products to remove!");
			return null;
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
				System.out.println(productStack[i]);
			}
		} else {
			System.out.println("No items to show!");
		}
	}

	// method to add 10 standard items to the stack

	public void addStandardItems() {
		Item item1 = new Item("Item1", "description", "10", "1");
		Item item2 = new Item("Item2", "description", "20", "2");
		Item item3 = new Item("Item3", "description", "30", "3");
		Item item4 = new Item("Item4", "description", "40", "4");
		Item item5 = new Item("Item5", "description", "50", "5");
		Item item6 = new Item("Item6", "description", "60", "6");
		Item item7 = new Item("Item7", "description", "70", "7");
		Item item8 = new Item("Item8", "description", "80", "8");
		Item item9 = new Item("Item9", "description", "90", "9");
		Item item10 = new Item("Item10", "description", "100", "10");

		addProduct(item1);
		addProduct(item2);
		addProduct(item3);
		addProduct(item4);
		addProduct(item5);
		addProduct(item6);
		addProduct(item7);
		addProduct(item8);
		addProduct(item9);
		addProduct(item10);
	}
}
