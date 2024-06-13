package DataStructure;

public class LinkedList {
    // Atributos
    private Node head;
    private Node tail;
    private int size;

    // Nó do nosso método de LinkedList
    class Node {
        String data;
        Node next;

        // Construtor
        Node(String data) {
            this.data = data;
        }
    }

    // Implementa o construtor da nossa lista
    public LinkedList(String data) {
        size = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    // Método de pega o primeiro elemento da lista
    public void getFirst() {
        if (this.head == null) {
            System.out.println("Lista vazia!");
        } else {
            System.out.println("Primeiro elemento da lista: " + head.data);
        }
    }

    // Método de pega o último elemento da lista
    public void getLast() {
        if (this.tail == null) {
            System.out.println("Lista vazia!");
        } else {
            System.out.println("Último elemento da lista: " + tail.data);
        }
    }

    // Método de obter o tamanho da lista
    public void getSize() {
        System.out.println("Tamanho da lista: " + this.size);
    }

    // Método para esvaziar a lista
    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Limpando a lista...");
    }
}
