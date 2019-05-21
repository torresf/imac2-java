package fr.umlv.calc;

import java.util.Objects;
import java.util.Scanner;

public class Value implements Expr {
	private final int value;

	public Value(int value) {
		this.value = Objects.requireNonNull(value);
	}

	@Override
	public int eval() {
		return this.value;
	}

	public static Value parse(Scanner scanner) {
		return (Value) Expr.parse(scanner);
	}

	@Override
	public void displayTree() {
		System.out.print(this.eval());		
	}

}
