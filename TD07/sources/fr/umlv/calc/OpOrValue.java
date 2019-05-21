package fr.umlv.calc;

import java.util.Objects;
import java.util.Scanner;

public class OpOrValue {
	public static final int OP_NONE = 0;
	public static final int OP_ADD = 1;
	public static final int OP_SUB = 2;

	private final int operator;
	private final int value;
	private final OpOrValue left;
	private final OpOrValue right;

	private OpOrValue(int operator, int value, OpOrValue left, OpOrValue right) {
		if (operator != OP_NONE && operator != OP_ADD && operator != OP_SUB)
			throw new IllegalArgumentException("L'operation n'existe pas");
		this.operator = operator;
		this.value = value;
		this.left = left;
		this.right = right;
	}
	public OpOrValue(int value) {
		this(OP_NONE, value, null, null);
	}
	public OpOrValue(int operator, OpOrValue left, OpOrValue right) {
		this(operator, 0, Objects.requireNonNull(left), Objects.requireNonNull(right));
	}

	public int eval() {
		switch(operator) {
		case OP_ADD:
			return left.eval() + right.eval();
		case OP_SUB:
			return left.eval() - right.eval();
		default: // case OP_NONE:
			return value;
		}
	}


	public static OpOrValue parse(Scanner scanner) {
		if (scanner != null)
			return OpOrValue.parseRec(scanner);
		return null;
	}

	public static OpOrValue parseRec(Scanner scanner) {
		var token = scanner.next();
		try {
			int i = Integer.parseInt(token);
			return new OpOrValue(i);
		} catch (NumberFormatException e) {
			var left = parseRec(scanner);
			var right = parseRec(scanner);
			switch(token) {
			case "+": return new OpOrValue(OP_ADD, left, right);
			case "-": return new OpOrValue(OP_SUB, left, right);
			default: throw new IllegalArgumentException("Le caractère n'est pas compatible avec les opérations");
			}
		}
	}
	
	public int getValue() {
        return(value);
    }
	
	public OpOrValue getSousArbreGauche() {
        return(left);
    }   

    public OpOrValue getSousArbreDroit() {
        return(right);
    }

	public void ParcoursInfixe() {
		if (getSousArbreGauche() != null)
			getSousArbreGauche().ParcoursInfixe();
		if (getValue() != 0)
			System.out.print(getValue());
		else {
			if (operator == OP_ADD)
				System.out.print(" + ");
			else if (operator == OP_SUB)
				System.out.print(" - ");
		}
		if (getSousArbreDroit() != null)
			getSousArbreDroit().ParcoursInfixe();
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		ParcoursInfixe();
		System.out.println();
		return "";
	}

}