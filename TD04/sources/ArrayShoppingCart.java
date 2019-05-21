public class ArrayShoppingCart {
	private int maxBook;
	private Book[] books;
	private int size;
	
	public ArrayShoppingCart(Integer max) {
		maxBook = max;
		books = new Book[maxBook];
		size = 0;
	}
	
	public void add(Book book) {
		System.out.println(size);
		if (size < maxBook) {
			books[size] = book;
			size++;
		} else {
			System.out.println("Maximum de livres atteint");
		}
	}
	
	public void display() {
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			System.out.println(books[i].toString());
		}
	}
	
	public Book longestTitle() {
		int index = -1;
		if (size == 0) {
			return null;
		}
		int maxLength = books[0].getTitle().length();
		for (int i = 0; i < size; i++) {
			if (books[i].getTitle().length() > maxLength) {
				index = i;
			}
		}
		if (index == -1) {
			return null;
		}
		return books[index];
	}
}
