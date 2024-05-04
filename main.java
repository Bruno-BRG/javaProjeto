class Contato {
    String nome;
    String numero;
    Contato proximo;
    Contato anterior;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
        this.proximo = null;
        this.anterior = null;
    }
}

class ListaTelefonica {
    Contato inicio;
    Contato fim;

    public ListaTelefonica() {
        this.inicio = null;
        this.fim = null;
    }

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

    public void imprimirLista() {
        Contato atual = inicio;
        while (atual != null) {
            System.out.println("Nome: " + atual.nome + ", Número: " + atual.numero);
            atual = atual.proximo;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ListaTelefonica lista = new ListaTelefonica();
        lista.adicionarContato("João", "123456789");
        lista.adicionarContato("Maria", "987654321");
        lista.imprimirLista();
    }
}
