import java.util.Objects;

public class Book {
	private String title;
	private String author;
	private static final String DEFAULT_AUTHOR = "<no author>";

	public Book(String title, String author) {
		this.title = Objects.requireNonNull(title);
		this.author = Objects.requireNonNull(author);
	}

	public Book(String title) {
		this(title, DEFAULT_AUTHOR);
	}

	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return this.author;
	}

	public static boolean compareBook(Book b1, Book b2) {
		return b1.title.equals(b2.title) && b1.author.equals(b2.author);
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		Book b = (Book) o;
		return compareBook(this, b);
	}

	@Override
	public String toString() {
		if (this.author == DEFAULT_AUTHOR) {
			return this.title;
		} else {
			if (this.title.isEmpty()) {
				return this.author;
			}
		}
		return this.title + " by " + this.author;
	}

}