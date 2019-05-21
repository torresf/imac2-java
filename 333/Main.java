import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		// EX1 - Question 2
		var book = new Book("Titre", "Auteur");
		System.out.println(book.getTitle() + ' ' + book.getAuthor());

		var book1 = new Book("Titre");
		System.out.println(book1.getTitle() + ' ' + book1.getAuthor());

		// EX2- Question 1
		var b1 = new Book("Da Java Code", "Duke Brown");
		var b2 = b1;
		var b3 = new Book("Da Java Code", "Duke Brown");

		System.out.println(b1 == b2);
		System.out.println(b1 == b3);

		System.out.println(Book.compareBook(b1, b2));
		System.out.println(Book.compareBook(b1, b3));

		// EX2 - Question 4
		var list = new ArrayList();
		list.add(b1);
		System.out.println(list.indexOf(b2));
		System.out.println(list.indexOf(b3));

		// EX2 - Question 9 - Lance une exception
		// var aBook = new Book(null, null);
		// var anotherBook = new Book(null, null);
		// var list2 = new ArrayList();
		// list2.add(aBook);
		// System.out.println(list2.indexOf(anotherBook));

		// EX3
		var bookWithAuthor = new Book("Da Java Code", "Duke Brown");
		var bookWithoutAuthor = new Book("Da Java Code");
		var bookWithEmptyTitle = new Book("", "<no author>");
		System.out.println(bookWithAuthor);
		System.out.println(bookWithoutAuthor);
		System.out.println(bookWithEmptyTitle);

	}

}