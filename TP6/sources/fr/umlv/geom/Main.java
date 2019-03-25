package fr.umlv.geom;

public class Main {

	public static void main(String[] args) {
		// Exercice 1
		
		System.out.println("--- EX1 ---");
		System.out.println("--- Q6 ---");
		var point = new Point(1, 2);
		var circle = new Circle(point, 1);
		
		var circle2 = new Circle(point, 2);
		circle2.translate(1, 1);
		
		System.out.println(circle);
		System.out.println(circle2);

		// Q7
		System.out.println("\n--- Q7 ---");
		var point2 = new Point(1, 2);
	    var circle3 = new Circle(point2, 1);
	    circle3.getCenter().translate(1,1);
	    System.out.println(point2);
	    
		// Q9
		System.out.println("\n--- Q9 ---");
		var p = new Point(1, 2);
		var p2 = new Point(5, 2);
	    var c = new Circle(p, 2);
	    System.out.println(c.contains(p2));
	    

		// Exercice 2
		System.out.println("\n--- EX2 ---");
		System.out.println("--- Q4 ---");
	    var p3 = new Point(1, 2);
	    var c2 = new Circle(p3, 2);
	    System.out.println(c2);
	    var ring = new Ring(p3, 2, 1);
	    System.out.println(ring);
	}

}
