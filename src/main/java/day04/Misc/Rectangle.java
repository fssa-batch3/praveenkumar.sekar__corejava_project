package day04.Misc;

import day04.practice.Polygon;

public class Rectangle extends Polygon {

	protected double length;
	protected double breadth;
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}


	public Rectangle(double length, double breadth) throws Exception {
		super(4);
		if (length <= 0 || breadth <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.length = length;
		this.breadth = breadth;
	}

	@Override
		public double calculateArea() {
		return this.length * this.breadth;
	}

	public int getNumberOfSides() {
		return super.numberOfSides;
	}

	@Override
	public double circumference() {
		return 2 * (this.length + this.breadth);
	}

}
