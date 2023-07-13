package day04.practice;

public class RightAngleTriangle extends Polygon {
	
	protected double sideA;
	protected double sideB;

	public RightAngleTriangle(double sideA, double sideB) throws Exception {
		super(3);
		if (sideA <= 0 || sideB <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.sideA = sideA;
		this.sideB = sideB;
	}

	public int getNumberOfSides() {
		return super.numberOfSides;
	}

	@Override
	public double calculateArea() {
		return (sideA * sideB)/2;
	}

	@Override
	public double circumference() {
		return (this.sideA + this.sideB + Math.sqrt(Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2)));
	}

}
