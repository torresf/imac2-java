import java.util.ArrayList;

public class Basket {
	private ArrayList<FruitQuantity> fruits;
	private int price;

	public Basket() {
		fruits = new ArrayList<FruitQuantity>();
	}

	public void add(Fruit f) {
		fruits.add(new FruitQuantity(f, 1));
		this.updatePrice();
	}
	
	public void add(Fruit f, int q) {
		fruits.add(new FruitQuantity(f, q));
		this.updatePrice();
	}

	private void updatePrice() {
		int price = 0;
		for (FruitQuantity fq : fruits) {
			price += fq.getFruit().getPrice() * fq.getQuantity();
		}
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (FruitQuantity fq : fruits) {
			str.append(fq.getFruit().toString()).append(fq.getQuantity()).append("\n");
		}
		str.append("price : ").append(this.getPrice());
		return new String(str);
	}

}

class FruitQuantity {
	private Fruit fruit;
	private int quantity;
	
	public FruitQuantity(Fruit f, int q) {
		fruit = f;
		quantity = q;
	}

	public Fruit getFruit() {
		return fruit;
	}
	
	public int getQuantity() {
		return quantity;
	}
}

