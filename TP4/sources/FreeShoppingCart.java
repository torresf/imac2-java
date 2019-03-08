import java.util.ArrayList;
import java.util.Iterator;

public class FreeShoppingCart {
	ArrayList<Book> books;
	
	public FreeShoppingCart() {
		books = new ArrayList<Book>();
	}
	
	public void add(Book book) {
		books.add(book);
	}
	
	public void display() {
		System.out.println("display ArrayList : ");
		for (int i = 0; i < books.size(); i++) {
			System.out.println("	- " + books.get(i).toString());
		}
	}
	
	public Book longestTitle() {
		int index = -1;
		int maxLength = books.get(0).getTitle().length();
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getTitle().length() > maxLength) {
				maxLength = books.get(i).getTitle().length();
				index = i;
			}
		}
		if (index == -1) {
			return null;
		}
		return books.get(index);
	}
	
	public Book longestTitleIterator() {
		int maxLength = 0;
		Book bookToReturn = books.get(0);
		Book currentBook = null;
		Iterator<Book> it = books.iterator();
		while (it.hasNext()) {
			currentBook = it.next();
			if (currentBook.getTitle().length() > maxLength) {
				maxLength = currentBook.getTitle().length();
				bookToReturn = currentBook;
			}
		}
		return bookToReturn;
	}
	
	public Book longestTitleFor() {
		int maxLength = 0;
		Book bookToReturn = null;
		for (Book book : books) {
			if (book.getTitle().length() > maxLength) {
				maxLength = book.getTitle().length();
				bookToReturn = book;
			}
		}
		return bookToReturn;
	}
	
	public void removeFirstOccurence(Book b) {
		books.remove(b);
	}
	
	public void removeFirstOccurenceIterator(Book b) {
		Iterator<Book> it = books.iterator();
		while (it.hasNext()) {
			if (it.next().equals(b)) {
				it.remove();
				break;
			}
		}
	}
}
