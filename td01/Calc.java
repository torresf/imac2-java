import java.util.Scanner; // Importe un module java : Scanner

public class Calc { 
	public static void main(String[] args) {
		// Instancie un object scanner de type Sanner
		Scanner scanner = new Scanner(System.in);

		// Défini une variable value de type int
		// nextInt() est une méthode de l'object Scanner
		int value1 = scanner.nextInt(); 
		int value2 = scanner.nextInt();

		// Affiche les valeur entrée par l'utilisateur et les résultats des opérations
		System.out.println("Valeur 1 : " + value1);
		System.out.println("Valeur 2 : " + value2);
		System.out.println("Somme : " + (value1 + value2));
		System.out.println("Différence : " + (value1 - value2));
		System.out.println("Produit : " + value1 * value2);
		System.out.println("Quotient : " + value1 / value2);
		System.out.println("Reste : " + value1 % value2);
	}
}