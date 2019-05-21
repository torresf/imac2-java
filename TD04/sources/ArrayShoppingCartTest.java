
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
		Book b1 = new Book("Titre1a", "Author1");
		Book b2 = new Book("Titre2aaa", "Author2");
		Book b3 = new Book("Titre3aa", "Author3");
		freeShoppingCart.add(b1);
		freeShoppingCart.add(b2);
		freeShoppingCart.add(b3);
		freeShoppingCart.add(b3);
		freeShoppingCart.add(b3);
		
		System.out.println("\n==> Without iterator");
		System.out.println(freeShoppingCart.longestTitle().toString());

		System.out.println("\n==> With iterator");
		System.out.println(freeShoppingCart.longestTitleIterator().toString());
		
		System.out.println("\n==> With for(:)");
		System.out.println(freeShoppingCart.longestTitleFor().toString());
		
		System.out.println();
		
		freeShoppingCart.display();
		System.out.println("removeFirstOccurence : b3");
		freeShoppingCart.removeFirstOccurence(b3);
		freeShoppingCart.display();
		System.out.println("removeFirstOccurenceIterator : b3");
		freeShoppingCart.removeFirstOccurenceIterator(b3);
		freeShoppingCart.display();
		
	}

}
