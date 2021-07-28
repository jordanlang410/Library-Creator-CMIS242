/* Name: Lang, Jordan
 * Date: 01/16/2021
 * Course/Section: CMIS 242/6380
*/

package assignment1Cmis242;

import java.util.Scanner;

public class Inventory {

	Book[] addedBooks = new Book[10000]; // Array to store the user input books(can store 10,000 books)
	public int count; // Count the number of books in the inventory

	Scanner input = new Scanner(System.in);

	public Book findBook(int idNum) {// method to loop through the array

		for (int i = 0; i < count; i++) {
			if (addedBooks[i].getIdNum() == idNum) {
				return addedBooks[i];
			}
		}
		return null;
	}

	public void addBook(Book b) {

		if (findBook(b.getIdNum()) != null) {// make sure the ID number of the book being added doesn't already exist
			System.out.println("A book with this ID Number already exists.");
			
		} else if (count < addedBooks.length) {//add the user enters to the inventory
			addedBooks[count] = b;
			count++;
			
		} else {
			System.out.println("The inventory is full.");
		}
	}

	/*
	 * public static int findIndex(Book[] addedBooks, int t) { if (addedBooks ==
	 * null) { return -1; } int len = addedBooks.length; int i = 0;
	 * 
	 * while (i < len) { if (addedBooks[i] == t) { return i; } else { i = i + 1; } }
	 * return -1; }
	 */

	public void removeBook() {

		int idNum1;
		System.out.println("Enter Book ID Number to remove: ");
		idNum1 = input.nextInt();

		Book fbook = findBook(idNum1);// loop through to find the ID number of the book to remove
		if (fbook != null) {
			for (int i = idNum1; i < count - 1; i++) {// the idNum1 should really be the index, but I could not get full
														// program to work.
				addedBooks[i] = addedBooks[i + 1];// override the chosen book to remove with the next one

			}
			System.out.println("The book with the ID Number " + idNum1 + " has been removed from the inventory.");
			count--;// decrease inventory size by 1

		} else {
			System.out.println("We could not find a book with the ID Number " + idNum1 + ".");
		}
	}

	public void findIdNum() {

		int idNum;
		System.out.println("Enter Book ID Number: ");
		idNum = input.nextInt();// take user input for what ID # they want to search for

		Book fbook = findBook(idNum);// use the findBook method to loop through and search for the user entered ID #
		if (fbook != null) {
			System.out.println("\nBook ID Number: " + fbook.getIdNum() + "\nBook title: " + fbook.getTitle()
					+ "\nBook price: " + fbook.getPrice());

		} else {
			System.out.println("\nWe could not find a book with the ID Number " + idNum + ".");
		}
	}

	public void showAllBooks() {

		if (count != 0) {

			for (int i = 0; i < count; i++) {// loop through the entire inventory and display

				System.out.println("------------------\nBook ID Number: " + addedBooks[i].getIdNum() + "\nBook title: "
						+ addedBooks[i].getTitle() + "\nBook price: " + addedBooks[i].getPrice());
			}

		} else {
			System.out.println("\nThe inventory has no books.");
		}
	}

	public void displayOptions() {
		System.out.println("\n      MENU");
		System.out.println("1: Add a new book.");
		System.out.println("2: Remove a book.");
		System.out.println("3: Find a book.");
		System.out.println("4: Display all books.");
		System.out.println("9: Exit the program.");
	}
}
