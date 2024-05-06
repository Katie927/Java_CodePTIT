package adu;

import java.util.Scanner;

class Fraction {
	private long denomination;
	private long numerator;
	
	private long gcd(long x, long y) {
		while (y != 0) {
			long z = x % y;
	        x = y;
	        y = z;
		}
	    return x;
	}
	
	public Fraction(long denomination, long numerator) {
		super();
	    this.denomination = denomination;
	    this.numerator = numerator;
	    shorten();
	}
	void shorten() {
		long g = gcd(numerator, denomination);
		this.denomination /= g;
		this.numerator /= g;
	}
	
	Fraction _add(Fraction t) {
		return new Fraction(this.denomination * t.numerator + t.denomination * this.numerator, this.numerator * t.numerator);
	}
	Fraction _multi(Fraction t) {
		return new Fraction(this.denomination * t.denomination, this.numerator * t.numerator);
	}

	@Override
	public String toString() {
//		return getDenomination() + "/" + getNumerator();
//		shorten();
		return denomination + "/" + numerator;
	}
	
}

public class J04014_Fracture {
	public static void main(String[] args) throws ArithmeticException {
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		while(test --> 0) {
			Fraction f1 = new Fraction(sc.nextLong(), sc.nextLong());
			Fraction f2 = new Fraction(sc.nextLong(), sc.nextLong());
			Fraction C = (f1._add(f2))._multi(f1._add(f2));
			Fraction D = (f1._multi(f2))._multi(C);
			System.out.println(C +" "+ D);
//			System.out.println(f1._add(f2));
//			System.out.println(f1._multi(f2));
		}
	}
}
