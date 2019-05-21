package fr.umlv.geom;

public class Circle {
	private Point center;
	private int radius;
	
	public Circle(Point c, int r) {
		center = new Point(c.getX(), c.getY());
		radius = r;
	}
	
	public Point getCenter() {
		return new Point(center.getX(), center.getY());
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("\ncenter : ").append(this.center);
		str.append("\nrayon : ").append(this.radius);
		str.append("\nsurface : ").append(this.surface());
		return new String(str);
	}
	
	public void translate(int dx, int dy) {
		this.center.translate(dx, dy);
	}
	
	protected double surface() {
		return Math.PI * radius * radius;
	}
	
	protected double getDistance(Point p) {
		return Math.sqrt(
				Math.pow(p.getX() - this.center.getX(), 2) -
				Math.pow(p.getY() - this.center.getY(), 2) 
			);
	}
	
	public boolean contains(Point p) {
		return getDistance(p) <= this.radius;
	}
	
	public boolean contains(Point p, Circle... circles) {
		for (Circle circle : circles) {
			if (circle.contains(p))	
				return true;
		}
		return false;
	}
}
