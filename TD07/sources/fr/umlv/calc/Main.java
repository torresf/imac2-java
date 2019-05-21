package fr.umlv.calc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpOrValue expression = new OpOrValue(OpOrValue.OP_ADD,
			new OpOrValue(2),
			new OpOrValue(3)
		);
		System.out.println(expression.eval());

		String input = "- + 2 3 4";
		Scanner s = new Scanner(input);
		OpOrValue test = OpOrValue.parse(s);
		System.out.println(test.eval());
		System.out.println(test);
		s.close();

	}

}
