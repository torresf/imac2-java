package fr.umlv.geom;

public class Ring extends Circle {
	private int innerRadius;
	
	public Ring(Point center, int radius, int innerRadius) {
		super(center, radius);
		if (innerRadius >= radius) {
			throw new IllegalArgumentException("Rayon interne supérieur au rayon.");
		}
		this.innerRadius = innerRadius;
	}
	
	public int getInnerRadius() {
		return innerRadius;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(super.toString());
		str.append("\ninnerRadius : ").append(this.innerRadius);
		return new String(str);
	}

	@Override
	protected double surface() {
		return super.surface() - (Math.PI * innerRadius * innerRadius);
	}
	
	@Override
	public boolean contains(Point p) {
		return super.contains(p) && this.getDistance(p) > this.getInnerRadius();
	}
	
	public boolean contains(Point p, Ring... rings) {
		for (Ring ring : rings) {
			if (ring.contains(p))
				return true;
		}
		return false;
	}
}
