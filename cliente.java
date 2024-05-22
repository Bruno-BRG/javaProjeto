package mercadoLivre;

import java.util.Scanner;

// essa clase inicializa os valores que serao guaradados e utilizados para a funcionalidade da lista
public class cliente {
	String nome;
	String email;
	String cep;
	String senha;
	String username;
	cliente next;
	cliente previous;

	// construtor para inicializar os clientes
	public cliente(String nome, String email, String cep, String senha, String username) {
		this.nome = nome;
		this.email = email;
		this.cep = cep;
		this.senha = senha;
		this.username = username;
		this.next = null;
		this.previous = null;
	}

	// metodos para pegar os valores dos clientes

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getCep() {
		return cep;
	}

	public String getSenha() {
		return senha;
	}

	public String getUsername() {
		return username;
	}

	public cliente getNext() {
		return next;
	}

	public void setNext(cliente next) {
		this.next = next;
	}

	public cliente getPrevious() {
		return previous;
	}

	public void setPrevious(cliente previous) {
		this.previous = previous;
	}
}
