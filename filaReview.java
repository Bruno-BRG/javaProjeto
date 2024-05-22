package mercadoLivre;

import java.util.Scanner;

// i want a class that will take a string as the review of a product, it must ask for the itemID, a rating and a string as the review the review must be saved in a queue

public class filaReview {
	filaReview next;
	String itemID;
	int nota;
	String review;
	filaReview head;
	filaReview tail;
	int tamanho;

	// constructor to initialize the queue
	public filaReview() {
		this.head = null;
		this.tail = null;
		this.tamanho = 0;
	}

	// method to add a review to the queue
	public void adicionarReview(String itemIDReview, int nota, String review) {
		filaReview novaReview = new filaReview();
		novaReview.itemID = itemIDReview;
		novaReview.nota = nota;
		novaReview.review = review;
		if (head == null) {
			head = novaReview;
			tail = novaReview;
		} else {
			tail.next = novaReview;
			tail = novaReview;
		}
		tamanho++;
	}

	// method to show the reviews
	public void mostrarReviews() {
		filaReview reviewAtual = head;
		while (reviewAtual != null) {
			System.out.println("ItemID: " + reviewAtual.itemID);
			System.out.println("Nota: " + reviewAtual.nota);
			System.out.println("Review: " + reviewAtual.review);
			System.out.println("--------------");
			reviewAtual = reviewAtual.next;
		}
	}
}
