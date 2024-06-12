package mercadoLivre;

import java.util.Scanner;

// essa classe serve para criar uma lista de itens que vai ser usada para adicionar os itens na loja
public class listaItens {
	public Item[] productStack;
	public int top;
	public int capacity;

	// construtor para inicializar a lista de itens
	public listaItens(int capacity) {
		this.capacity = capacity;
		productStack = new Item[capacity];
		top = -1;
	}

	// metodo para adicionar um produto na lista
	public void adicionarProduto(String nomeItem, String descricaoItem, String precoItem, String quantidadeItem,
			String itemID) {
		if (top < capacity - 1) {
			productStack[++top] = new Item(nomeItem, descricaoItem, precoItem, quantidadeItem, itemID);
			
		} else {
			System.out.println("Stack esta cheio! Nao foi possivel adicionar o produto: " + itemID);
		}
	}

	// metodo para ver um produto no stack(pilha)
	public Item verTopo() {
		if (top >= 0) {
			return productStack[top];
		} else {
			System.out.println("Nao a produtos para ver!");
			return null;
		}
	}

	// metodo para mostrar todos os itens do stack
	public void mostrarItens() {
		if (top >= 0) {
			System.out.println("Itens no stack:");
			for (int i = top; i >= 0; i--) {
				// i want to print all the name of all the items in the list
				System.out.println(productStack[i].nomeItem + " " + productStack[i].descricaoItem + " "
						+ productStack[i].precoItem + " " + productStack[i].quantidadeItem + " "
						+ productStack[i].itemID);

			}
		} else {
			System.out.println("Nao a itens para mostrar!");
		}
	}
}
