package studio7;

public class Complex {
	
	private double a;
	private double b;
	
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public String toString() {
		return a + " + " + b + "i";
	}
	
	public Complex add(Complex c2) {
		return new Complex(this.a+c2.a, this.b+c2.b);
	}
	
	public Complex multiply(Complex c2) {
		return new Complex(this.a*c2.a - this.b*c2.b, this.a*c2.b + this.b*c2.a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(1,2);
		Complex c2 = new Complex(3,4);
		System.out.println(c1.toString());
		System.out.println(c1.add(c2).toString());
		System.out.println(c1.multiply(c2).toString());
	}

}
