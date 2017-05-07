
public class Rational {

	private int numerator;
	private int denominator;
	
	public Rational() {
		numerator = 0;
		denominator = 1;
	}
	
	public Rational(int numerator) {
		this.numerator = numerator;
		this.denominator = 1;
	}
	
	public Rational(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		this.fix();
	}
	
	public Rational(Rational r) {
		this.numerator = r.numerator;
		this.denominator = r.denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	private void fix() {
		if (denominator == 0) {
			this.numerator = 0;
			this.denominator = 1;
		} else if (denominator < 0) {
			this.numerator = -1 * numerator;
			this.denominator = -1 * denominator;
		}
	}
	
	public void printRational() {
		System.out.println(toString());
	}
	
	public String toString() {
		if (denominator == 1) {
			return String.format("%d", numerator);
		} else {
			return String.format("%d/%d", numerator, denominator);
		}
	}
	
	public void negate() {
		numerator *= -1;
	}
	
	public void invert() {
		int temp = numerator;
		numerator = denominator;
		denominator = temp;
		this.fix();
	}
	
	public double toDouble() {
		return (double)numerator / (double)denominator;
	}

	public int greatestCommonDivisor(int A, int B) {
		if (A == 0) {
			return B;
		} else if (B == 0) {
			return A;
		} else {
			return greatestCommonDivisor(B, A % B);
		}
	}
	
	public Rational reduce() {
		Rational newRat = new Rational(this);

		int divisor = greatestCommonDivisor(newRat.numerator, newRat.denominator);
		newRat.numerator /= divisor;
		newRat.denominator /= divisor;
		
		return newRat;
	}
	
	public Rational add(Rational r) {
		Rational newRat = new Rational();
		
		int num1 = this.numerator * r.denominator;
		int den1 = this.denominator * r.denominator;
		int num2 = r.numerator * this.denominator;
		int den2 = r.denominator * this.denominator;
		
		newRat.numerator = num1 + num2;
		newRat.denominator = den1;
		
		newRat = newRat.reduce();
		
		return newRat;
	}
}
