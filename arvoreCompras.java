package mercadoLivre;

import java.util.Scanner;

// essa classe serve para criar uma arvore binaria que vai salvar as compras feitas

public class arvoreCompras {
	arvoreCompras left;
	arvoreCompras right;
	String itemID;

	public arvoreCompras(String itemID) {
		this.itemID = itemID;
		this.left = null;
		this.right = null;
	}

	// metodo para adicionar uma compra na arvore
	public void adicionarCompra(String itemID) {
		if (itemID.compareTo(this.itemID) < 0) {
			if (left == null) {
				left = new arvoreCompras(itemID);
			} else {
				left.adicionarCompra(itemID);
			}
		} else {
			if (right == null) {
				right = new arvoreCompras(itemID);
			} else {
				right.adicionarCompra(itemID);
			}
		}
	}

	// metodo para mostrar as compras feitas
	public void mostrarCompras() {
		System.out.println(itemID);
		System.out.println("--------------------");
		if (left != null) {
			left.mostrarCompras();
		}
		if (right != null) {
			right.mostrarCompras();
		}
	}
}
