package mercadoLivre;

import java.util.Scanner;

// essa classe serve para criar uma arvore binaria que vai salvar as compras feitas

public class purchaseTree {
	purchaseTree left;
	purchaseTree right;
	String itemID;

	public purchaseTree(String itemID) {
		this.itemID = itemID;
		this.left = null;
		this.right = null;
	}

	// metodo para adicionar uma compra na arvore
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

	// metodo para mostrar as compras feitas
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
