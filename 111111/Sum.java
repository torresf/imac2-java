import java.util.Scanner; // Importe un module java : Scanner
import java.util.Arrays; // Importe un module java : Arrays
import java.lang.Integer; // Importe un module java : Integer

public class Sum { 
	
	// Questions 
	// 2. static pour une méthode signifie qu'elle est reliée à la classe et pas à l'objet instancié
	// 3. Si un argument n'est pas un nombre, le programme lance une exception

	// Converti un tableau de strings en tableau d'entiers
	private static int[] strArrayToIntArray(String[] strArray) {
		int intArray[] = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}

	// Calcule la somme des éléments d'un tableau d'entiers
	private static int calcSum(int[] array) {
		int sum = 0;
		for (int value: array) {
			sum += value;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("integers : " + Arrays.toString(args));
		System.out.println("sum : " + calcSum(strArrayToIntArray(args)));
	}

}