// Crie uma lista telefônica que armazene o nome e o número de telefone de uma pessoa. A lista deve ser duplamente encadeada e deve ter as seguintes operações:
class Contato {
    String nome;
    String numero;
    Contato proximo;
    Contato anterior;

    // Construtor
    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
        this.proximo = null;
        this.anterior = null;
    }
}

// Adicionar um contato
class ListaTelefonica {
    Contato inicio;
    Contato fim;
    
    // Adiciona um contato ao final da lista
    public ListaTelefonica() {
        this.inicio = null;
        this.fim = null;
    }
    
    // Adiciona um contato ao final da lista
    public void adicionarContato(String nome, String numero) {
        Contato novoContato = new Contato(nome, numero);
        if (inicio == null) {
            inicio = novoContato;
            fim = novoContato;
        } else {
            fim.proximo = novoContato;
            novoContato.anterior = fim;
            fim = novoContato;
        }
    }

    // Imprime a lista de contatos
    public void imprimirLista() {
        Contato atual = inicio;
        while (atual != null) {
            System.out.println("Nome: " + atual.nome + ", Número: " + atual.numero);
            atual = atual.proximo;
        }
    }
}

// Adicionar um contato
public class Main {
    public static void main(String[] args) {
        ListaTelefonica lista = new ListaTelefonica();
        lista.adicionarContato("João", "123456789");
        lista.adicionarContato("Maria", "987654321");
        lista.imprimirLista();
    }
}
