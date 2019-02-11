public class PrintArgs {
	public static void main(String[] args) {
		// Si on ne passe pas d'arguments, le programme ne renvoie rien
		for (String value: args) {
			System.out.println(value);
		}
	}
}