
public class ArrayShoppingCartTest {

	public static void main(String[] args) {
		// Ex2
		System.out.println("ArrayShoppingCartTest");
		ArrayShoppingCart array = new ArrayShoppingCart(3);
		for (int i = 0; i < 5; i++) {
			String title = "Titre";
			for (int j = 0; j < i; j++) {
				title += "0";
			}
			array.add(new Book(title, "Author"+i));
		}
		
		// Affichage de la liste de livre
		array.display();
		
		// Affichage du livre dont le titre est le plus long
		System.out.println(array.longestTitle().toString());

		// Ex3
		System.out.println();
		System.out.println("freeShoppingCart");
		FreeShoppingCart freeShoppingCart = new FreeShoppingCart();
		freeShoppingCart.add(new Book("Titre1a", "Author1"));
		freeShoppingCart.add(new Book("Titre2aaa", "Author2"));
		freeShoppingCart.add(new Book("Titre3aa", "Author3"));
		
		System.out.println("\n==> Without iterator");
		System.out.println(freeShoppingCart.longestTitle().toString());

		System.out.println("\n==> With iterator");
		System.out.println(freeShoppingCart.longestTitleIterator().toString());
		
		System.out.println("\n==> With for(:)");
		System.out.println(freeShoppingCart.longestTitleFor().toString());
		
	}

}
