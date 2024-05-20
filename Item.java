package mercadoLivre;

import java.util.Scanner;

// essa classe esta criando e inicializando o stack de itens
public class Item {
	String nameItem;
	String descriptionItem;
	String priceItem;
	String quantityItem;
	String itemID;

	// construtor para inicializar os itens
	public Item(String name, String description, String price, String quantity, String itemID) {
		this.nameItem = name;
		this.descriptionItem = description;
		this.priceItem = price;
		this.quantityItem = quantity;
		this.itemID = itemID;
	}

	// metodos para pegar os valores dos itens

	public String getName() {
		return nameItem;
	}

	public String getDescription() {
		return descriptionItem;
	}

	public String getPrice() {
		return priceItem;
	}

	public String getQuantity() {
		return quantityItem;
	}

	public String getItemID() {
		return itemID;
	}
}
