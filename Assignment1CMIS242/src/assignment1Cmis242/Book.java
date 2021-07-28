/* Name: Lang, Jordan
 * Date: 01/16/2021
 * Course/Section: CMIS 242/6380
*/

package assignment1Cmis242;

public class Book {

	//instance variables
	private int idNum;
	private String title;
	private double price;

	//constructor
	public Book(int idNum, String title, double price) {

		this.idNum = idNum;
		this.title = title;
		this.price = price;
	}
	
	//Getter Methods
	public int getIdNum() {
		return idNum;
	}
	public String getTitle() {
		return title;
	}
	public double getPrice() {
		return price;
	}
	
	//Setter Methods
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}