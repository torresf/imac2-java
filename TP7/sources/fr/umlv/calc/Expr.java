package fr.umlv.calc;

import java.util.Scanner;

public interface Expr {
	
	public int eval();
	public void displayTree();
	
	public static Expr parse(Scanner scanner) {
		System.out.print("Enter a character : ");
		String word = scanner.next();
		Expr expr = null;

		try {
			int value = Integer.parseInt(word);
			expr = new Value(value);
		} catch (NumberFormatException | NullPointerException nfe) {
			switch (word) {
			case "+": 
				expr = new Add(parse(scanner), parse(scanner));
				break;
			case "-": 
				expr = new Sub(parse(scanner), parse(scanner));
				break;
			default:
				System.out.println("Error: not a known operation -> Leaving");
				break;
			}
		}
		return expr;
	}
}
