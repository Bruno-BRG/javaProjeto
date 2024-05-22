package mercadoLivre;

import java.util.Scanner;

// essa classe esta criando e inicializando o stack de itens
public class Item {
	String nomeItem;
	String descricaoItem;
	String precoItem;
	String quantidadeItem;
	String itemID;

	// construtor para inicializar os itens
	public Item(String nome, String descricao, String preco, String quantidade, String itemID) {
		this.nomeItem = nome;
		this.descricaoItem = descricao;
		this.precoItem = preco;
		this.quantidadeItem = quantidade;
		this.itemID = itemID;
	}

	// metodos para pegar os valores dos itens

	public String getNome() {
		return nomeItem;
	}

	public String getDescricao() {
		return descricaoItem;
	}

	public String getPreco() {
		return precoItem;
	}

	public String getQuantidade() {
		return quantidadeItem;
	}

	public String getItemID() {
		return itemID;
	}
}
