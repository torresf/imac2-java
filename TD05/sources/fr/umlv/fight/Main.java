package fr.umlv.fight;

public class Main {

	public static void main(String[] args) {
		// Exercice 1 Robot
		System.out.println("-------- EX1 --------");
		Robot robot1 = new Robot("R2D2");
		Robot robot2 = new Robot("Data");
		System.out.println(robot1);
		System.out.println(robot2);
		System.out.println("Le vainqueur est : " + Arena.fight(robot1, robot2));
		
		// Exercice 2 Fighter
		System.out.println();
		System.out.println("-------- EX2 --------");
		Fighter john = new Fighter("John", System.currentTimeMillis());
		Fighter jane = new Fighter("Jane", System.currentTimeMillis()/2);
		System.out.println(Arena.fight(john, jane) + " wins");
	}

}
