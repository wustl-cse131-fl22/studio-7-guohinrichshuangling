package studio7;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle (double initLength, double initWidth) {
		this.length = initLength;
		this.width = initWidth;
	}
	
	public double area () {
		return this.length * this.width;
	}
	
	public double perimeter() {
		return (2*this.length) + (2*this.width);
	}
	
	public boolean isSquare() {
		if (this.length == this.width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSmaller(Rectangle compare) {
		if (this.area() < compare.area()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(5.0, 5.0);
		Rectangle r2 = new Rectangle(6.0, 7.0);
		System.out.println(r1.area());
		System.out.println(r1.perimeter());
		System.out.println(r1.isSquare());
		System.out.println(r2.isSquare());
		System.out.println(r1.isSmaller(r2));
	}

}
