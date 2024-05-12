package the_first;
import java.util.Scanner;

public class mercado_livre {

    public static class Cliente {
        String nome;
        String tipo;

        public Cliente(String nome, String tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }
    }

    public static class Node {
        Cliente cliente;
        Node prev;
        Node next;

        public Node(Cliente cliente) {
            this.cliente = cliente;
            this.prev = null;
            this.next = null;
        }
    }

    public static class ClienteList {
        Node head;
        Node tail;

        public ClienteList() {
            this.head = null;
            this.tail = null;
        }

        public void addCliente(Cliente cliente) {
            Node newNode = new Node(cliente);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
    }

    public static class Produto {
        String nome;
        double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }
    }

    public static class ProdutoStack {
        Produto[] produtos;
        int top;
        int maxSize;

        public ProdutoStack(int maxSize) {
            this.produtos = new Produto[maxSize];
            this.top = -1;
            this.maxSize = maxSize;
        }

        public void push(Produto produto) {
            if (top < maxSize - 1) {
                produtos[++top] = produto;
            } else {
                System.out.println("A pilha está cheia!");
            }
        }

        public Produto pop() {
            if (top >= 0) {
                return produtos[top--];
            } else {
                System.out.println("A pilha está vazia!");
                return null;
            }
        }
    }

    public static class Compra {
        Cliente cliente;
        Produto produto;

        public Compra(Cliente cliente, Produto produto) {
            this.cliente = cliente;
            this.produto = produto;
        }
    }

    public static class TreeNode {
        Compra compra;
        TreeNode left;
        TreeNode right;

        public TreeNode(Compra compra) {
            this.compra = compra;
            this.left = null;
            this.right = null;
        }
    }

    public static class CompraTree {
        TreeNode root;

        public CompraTree() {
            this.root = null;
        }

        public void addCompra(Compra compra) {
            root = addCompraRecursive(root, compra);
        }

        private TreeNode addCompraRecursive(TreeNode current, Compra compra) {
            if (current == null) {
                return new TreeNode(compra);
            }

            if (compra.produto.preco < current.compra.produto.preco) {
                current.left = addCompraRecursive(current.left, compra);
            } else {
                current.right = addCompraRecursive(current.right, compra);
            }

            return current;
        }
    }

    public static class QueueNode {
        int avaliacao;
        QueueNode next;

        public QueueNode(int avaliacao) {
            this.avaliacao = avaliacao;
            this.next = null;
        }
    }

    public static class AvaliacaoQueue {
        QueueNode front;
        QueueNode rear;

        public AvaliacaoQueue() {
            this.front = null;
            this.rear = null;
        }

        public void enqueue(int avaliacao) {
            QueueNode newNode = new QueueNode(avaliacao);
            if (front == null) {
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
        }

        public int dequeue() {
            if (front == null) {
                System.out.println("A fila está vazia!");
                return -1;
            } else {
                int avaliacao = front.avaliacao;
                front = front.next;
                if (front == null) {
                    rear = null;
                }
                return avaliacao;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClienteList clienteList = new ClienteList();
        ProdutoStack produtoStack = new ProdutoStack(5);
        CompraTree compraTree = new CompraTree();
        AvaliacaoQueue avaliacaoQueue = new AvaliacaoQueue();

        while (true) {
            System.out.println("\n===== Mercado Livre =====");
            System.out.println("1. Adicionar cliente");
            System.out.println("2. Adicionar produto");
            System.out.println("3. Realizar compra");
            System.out.println("4. Avaliar vendedor");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = scanner.next();
                    System.out.print("Digite o tipo do cliente (consumidor ou vendedor): ");
                    String tipoCliente = scanner.next();
                    clienteList.addCliente(new Cliente(nomeCliente, tipoCliente));
                    System.out.println("Cliente adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.next();
                    System.out.print("Digite o preço do produto: ");
                    double precoProduto = scanner.nextDouble();
                    produtoStack.push(new Produto(nomeProduto, precoProduto));
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 3:
                    // Implemente a lógica para realizar uma compra
                    break;
                case 4:
                    // Implemente a lógica para avaliar um vendedor
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        }
    }
}
