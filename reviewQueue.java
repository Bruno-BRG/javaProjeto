package mercadoLivre;

import java.util.Scanner;

// i want a class that will take a string as the review of a product, it must ask for the itemID, a rating and a string as the review the review must be saved in a queue

public class reviewQueue {
	reviewQueue next;
	String itemID;
	int rating;
	String review;
	reviewQueue head;
	reviewQueue tail;
	int size;

	// constructor to initialize the queue
	public reviewQueue() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	// method to add a review to the queue
	public void addReview(String itemIDReview, int rating, String review) {
		reviewQueue newReview = new reviewQueue();
		newReview.itemID = itemIDReview;
		newReview.rating = rating;
		newReview.review = review;
		if (head == null) {
			head = newReview;
			tail = newReview;
		} else {
			tail.next = newReview;
			tail = newReview;
		}
		size++;
	}

	// method to show the reviews
	public void showReviews() {
		reviewQueue currentReview = head;
		while (currentReview != null) {
			System.out.println("ItemID: " + currentReview.itemID);
			System.out.println("Rating: " + currentReview.rating);
			System.out.println("Review: " + currentReview.review);
			currentReview = currentReview.next;
		}
	}
}
