
public class Pear extends Fruit {
	private int juiceCoef;
	
	public Pear(int j) {
		juiceCoef = j;
	}
	
	public int getJuiceCoef() {
		return juiceCoef;
	}
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return juiceCoef * 3;
	}

	@Override
	public String toString() {
		return "Pear [juiceCoef=" + juiceCoef + "] x";
	}
	
	
}
