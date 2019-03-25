package fr.umlv.fight;

public class Robot {
	private String name;
	int hp;
	
	static int FIREPOWER = 2;
	static int DEFAULT_HEALTH = 10;
	
	public Robot(String name) {
		this.name = name;
		this.hp = DEFAULT_HEALTH;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void fire(Robot enemy) {
		if (enemy.getHp() <= 0) {
			throw new IllegalArgumentException("L'ennemi est déjà mort");
		}
		if (rollDice()) {
			enemy.setHp(enemy.getHp() - FIREPOWER);
			System.out.println(enemy + " a été touché par " + this + " !");
			System.out.println("Il lui reste " + enemy.getHp() + " points de vie.");
		} else {
			System.out.println(this + " rate sa cible.");
		}
	}
	
	public boolean rollDice() {
		return true;
	}
	
	public boolean isDead() {
		return this.hp <= 0;
	}
	
	@Override
	public String toString() {
		return "Robot " + this.name;
	}

}
