package mercadoLivre;

import java.util.Scanner;

// essa clase server para inicializar a estrutura da lista encadeada que vai guardar os valores
public class listaCliente {

	public Client head;
	public Client tail;
	public int size;

	// construtor para inicializar a lista
	public listaCliente() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	// metodo para adicionar um cliente na lista
	public void addClient(String nome, String email, String cep, String senha, String username) {
		Client novoCliente = new Client(nome, email, cep, senha, username);
		if (head == null) {
			head = novoCliente;
			tail = novoCliente;
		} else {
			tail.setNext(novoCliente);
			novoCliente.setPrevious(tail);
			tail = novoCliente;
		}
		size++;
	}

	// metdodo para verificar se o cliente esta na lista
	public void checkClient(String username, String senha) {
		Client clienteAtual = head;
		while (clienteAtual != null) {
			if (clienteAtual.getUsername().equals(username) && clienteAtual.getSenha().equals(senha)) {
				System.out.println("Bem-vindo " + clienteAtual.getNome());
				break;
			} else {
				System.out.println("Username ou senha incorretos.");
				break;
			}
		}
	}

	// metodo para mostrar os clientes
	public void showClients() {
		Client clienteAtual = head;
		while (clienteAtual != null) {
			System.out.println("Nome: " + clienteAtual.getNome());
			System.out.println("Email: " + clienteAtual.getEmail());
			System.out.println("Cep: " + clienteAtual.getCep());
			System.out.println("Senha: " + clienteAtual.getSenha());
			System.out.println("Username: " + clienteAtual.getUsername());
			System.out.println("--------------");
			clienteAtual = clienteAtual.getNext();
		}
	}
}
