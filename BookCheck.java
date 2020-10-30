package labass6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BookCheck {
	
	public static void main(String[] args) {
		
		Book book = new Book(1, "Java in Depth", "John");
		Book book1 = new Book(2, "ThermoDynamics", "Jenny");
		Book book2 = new Book(3, "Chemical Theory", "Jessy");
		Book book3 = new Book(4, "let's us c", "Balagurusamy");
		
		
		BookCollection bookCol = new BookCollection();
		bookCol.bookList.add(book);
		bookCol.bookList.add(book1);
		bookCol.bookList.add(book2);
		bookCol.bookList.add(book3);
		
		System.out.println("---------------before sorting---------------");
		printBooks(bookCol.bookList);
		
		//check whether book is there or not
    		Book bookUpdate = new Book("Java in Depth", "Balagurusamy");
		bookCol.hasBook(bookUpdate);
		
		//sort
		System.out.println("---------------after sorting by book title---------------");
		bookCol.sortByBookName();
		

		System.out.println("---------------after sorting by author ---------------");
		bookCol.sortByAuthor();
              }
	
		private static void printBooks(List<Book> bookList) {
		//print the book
		for(Book book: bookList) {
			System.out.println(book);
		}
	}

}
		