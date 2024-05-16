package mercadoLivre;

import java.util.Scanner;

public class itemList {
	public Item[] productStack;
	public int top;

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
	public Product removeProduct() {
		if (top >= 0) {
			Product removedProduct = productStack[top--];
			System.out.println("Removed: " + removedProduct);
			return removedProduct;
		} else {
			System.out.println("No products to remove!");
			return null;
		}
	}

	// Method to view the product on top of the stack
	public Product peekProduct() {
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

	public static void main(String[] args) {
		Store store = new Store(3);

		// Adding products to the store
		store.addProduct(new Item(1, "Laptop", 999.99));
		store.addProduct(new Item(2, "Smartphone", 499.99));
		store.addProduct(new Item(3, "Tablet", 299.99));
		store.addProduct(new Itemt(4, "Smartwatch", 199.99)); // Should print "Stack is full!"

		// Peeking the top product
		System.out.println("Top product: " + store.peekProduct());

		// Removing products from the store
		store.removeProduct();
		store.removeProduct();
		store.removeProduct();
		store.removeProduct(); // Trying to remove from an empty stack
	}
}
