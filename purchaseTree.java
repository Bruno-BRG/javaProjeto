package mercadoLivre;

import java.util.Scanner;

// i want a binary tree to store the purchases it will and the itemID of the item to the tree 

public class purchaseTree {
	public purchaseTree left;
	public purchaseTree right;
	public String itemID;

	public purchaseTree(String itemID) {
		this.itemID = itemID;
		this.left = null;
		this.right = null;
	}

	public void addPurchase(String itemID) {
		if (itemID.compareTo(this.itemID) < 0) {
			if (left == null) {
				left = new purchaseTree(itemID);
			} else {
				left.addPurchase(itemID);
			}
		} else {
			if (right == null) {
				right = new purchaseTree(itemID);
			} else {
				right.addPurchase(itemID);
			}
		}
	}

	public void showPurchase() {
		if (left != null) {
			left.showPurchase();
		}
		System.out.println(itemID);
		if (right != null) {
			right.showPurchase();
		}
	}
}
