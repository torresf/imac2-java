
public class Apple extends Fruit {
	private int weight;
	private String name;
	
	public Apple(int w, String n) {
		super();
		weight = w;
		name = n;
	}

	public int getWeight() {
		return weight;
	}
	
	public int getPrice() {
		return weight / 2;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(this.getName()).append(" ").append(this.getWeight()).append("g x");
		return new String(str);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + weight;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	
}
