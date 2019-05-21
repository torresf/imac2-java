package fr.umlv.calc;

import java.util.Scanner;

public abstract class Operation implements Expr {

	private final Expr left;
	private final Expr right;
	
	public Operation(Expr left, Expr right) {
		this.left = left;
		this.right = right;
	}
	
	public Expr getLeft() {
		return left;
	}
	
	public Expr getRight() {
		return right;
	}
	
	public abstract String getOperation();
	
	public static Operation parse(Scanner scanner) {
		return (Operation) Expr.parse(scanner);
	}

	@Override
	public void displayTree() {
		System.out.print("(");
		left.displayTree();
		System.out.print(this.getOperation());
		right.displayTree();
		System.out.print(")");		
	}	
}