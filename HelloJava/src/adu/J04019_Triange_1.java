package adu;

import static java.lang.Math.sqrt;

import java.util.Scanner;

class Point{
	private double x;
	private double y;
	
	public Point(Scanner sc) {
		this.x = sc.nextDouble();
		this.y = sc.nextDouble();
	}
	
	static Point nextPoint(Scanner sc) {
        return new Point(sc);
    }
	
	double distance(Point p) {
		double x0 = this.x - p.x;
        double y0 = this.y - p.y;
        return Math.sqrt(x0 * x0 + y0 * y0);
	}
}

class Triangle{
	
	private Point a;
	private Point b;
	private Point c;
	private double A;
	private double B;
	private double C;
	
	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.A = a.distance(b);
        this.B = b.distance(c);
        this.C = c.distance(a);
	}
	
	public boolean valid() {
		if(this.A+this.B <= this.C || this.A+this.C <= this.B || this.C+this.B <= this.A) {
			return false;
		}
		else {
			return true;
		}
	}

	public String getPerimeter() {
		return String.format("%.3f", A+ B + C) ;
	}

}

public class J04019_Triange_1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}

