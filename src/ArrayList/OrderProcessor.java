package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
//import java.util.concurrent.CountDownLatch;

public class OrderProcessor {

	Scanner scanner = new Scanner(System.in);

	public ArrayList<Book> getOrderFromTheCustomer() {

		int bookCount = 0;

		ArrayList<Book> bookList = new ArrayList<Book>();

		try {
			System.out.println("Total number of Ordering Book Count : ");

			bookCount = scanner.nextInt();

		} catch (Exception exception) {

			System.out.println("Input Mismatch Eception: PLease Enter valid data : " + exception);
		}

		for (int index = 0; index < bookCount; index++) {

			try {
				bookList.add(getBookDataFromTheCustomer());

			} catch (Exception exception) {
				System.out.println("Input Mismatch Exception: please enter the valid data: " + exception);
			}
		}
		return bookList;

	}

	public Book getBookDataFromTheCustomer() {

		int id;
		int quantity;
		String name;
		String author;
		String publisher;

		System.out.println("Enter the Book Id : ");
		id = scanner.nextInt();

		System.out.println("Enter the Book Quantity : ");
		quantity = scanner.nextInt();

		System.out.println("Enter the Book Name: ");
		name = scanner.next();

		System.out.println("Enter the Book Author : ");
		author = scanner.next();

		System.out.println("Enter the Book Publisher : ");
		publisher = scanner.next();

		Book bookDetail = new Book(id, quantity, name, author, publisher);
		return bookDetail;
	}

	void printOrderDetails(ArrayList<Book> bookList) {

		for (Book bookDetails : bookList) {

			System.out.println("Purchasing Book ID : " + bookDetails.id);
			System.out.println("Purchasing Book Quantity : " + bookDetails.quantity);
			System.out.println("Purchasing Book Name : " + bookDetails.name);
			System.out.println("Purchasing Book Author : " + bookDetails.author);
			System.out.println("Purchasing Book Publisher : " + bookDetails.publisher);
		}

	}

}
