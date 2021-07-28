/* Name: Lang, Jordan
 * Date: 01/16/2021
 * Course/Section: CMIS 242/6380
*/

package assignment1Cmis242;

import java.util.Scanner;

public class RunInventory {

	public static void main(String[] args) {

		Scanner keyboardInput = new Scanner(System.in);
		Inventory bookobj = new Inventory();
		int userSelection;

		do {

			bookobj.displayOptions();
			userSelection = keyboardInput.nextInt();

			switch (userSelection) {

			case 1:
				int idNum;
				String bName;
				double price;

				System.out.println("What is the book ID Number (Integer value)?");
				idNum = keyboardInput.nextInt();
				keyboardInput.nextLine();
				System.out.println("What is the book name?");
				bName = keyboardInput.nextLine();
				System.out.println("What is the book price (double value)?");
				price = keyboardInput.nextDouble();

				Book b = new Book(idNum, bName, price);
				bookobj.addBook(b);
				break;

			case 2:
				bookobj.removeBook();
				break;

			case 3:
				bookobj.findIdNum();
				break;

			case 4:
				bookobj.showAllBooks();
				break;

			case 9:
				System.out.println("Thank you for using the program. GoodBye!");
				break;

			default:
				System.out.println("Please choose a number from the MENU.");

			}

		} while (userSelection != 9);
	}
}