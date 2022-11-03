package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}

	public Fraction sum(Fraction f2) {
		return new Fraction(this.numerator*f2.denominator+this.denominator*f2.numerator, this.denominator*f2.denominator);
	}
	
	public Fraction multiple(Fraction f2) {
		return new Fraction(this.numerator*f2.numerator, this.denominator*f2.denominator);
	}

	public Fraction reciprocal() {
		return new Fraction(this.denominator, this.numerator);
	}
	
	public static int gcd(int p, int q) {
		if (p%q == 0) {
			return q;
		} else {
			return gcd(q, p%q);
		}
	}
	
	public Fraction simplify() {
		int simplifyBy = gcd(this.numerator, this.denominator);
		return new Fraction(this.numerator/simplifyBy, this.denominator/simplifyBy);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fraction f1 = new Fraction(5, 10);
		Fraction f2 = new Fraction (2, 3);
		System.out.println(f1.sum(f2).toString());
		System.out.println(f1.multiple(f2).toString());
		System.out.println(f1.reciprocal().toString());
		System.out.println(f1.simplify().toString());
	}

}
