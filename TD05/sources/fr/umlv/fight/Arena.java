package fr.umlv.fight;

public class Arena {
	
	public Arena() {
		// TODO Auto-generated constructor stub
	}
	
	public static Robot fight(Robot r1, Robot r2) {
		// TODO Auto-generated method stub
		var tour = 0;
		while (!r1.isDead() && !r2.isDead()) {
			System.out.println("Tour n°" + tour);
			if (tour %2 == 0) {
				r1.fire(r2);
			} else {
				r2.fire(r1);
			}
			tour++;
		}
		if (r1.isDead()) {
			return r2;
		}
		return r1;
	}
}
