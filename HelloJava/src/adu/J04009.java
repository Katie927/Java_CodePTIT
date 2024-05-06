//package adu;
//
//import static java.lang.Math.sqrt;
//import java.util.Scanner;
//
//class Point{
//	private double x;
//	private double y;
//	
//	public Point(Scanner sc) {
//		this.x = sc.nextDouble();
//		this.y = sc.nextDouble();
//	}
//	
//	double distance(Point p) {
//		double x0 = this.x - p.x;
//        double y0 = this.y - p.y;
//        return Math.sqrt(x0 * x0 + y0 * y0);
//	}
//}
//
//class Triangle{
//	
//	private Point a;
//	private Point b;
//	private Point c;
//	private double A;
//	private double B;
//	private double C;
//	
//	public Triangle(Scanner sc) {
//		this.a = new Point(sc);
//		this.b = new Point(sc);
//		this.c = new Point(sc);
//		this.A = a.distance(b);
//		this.B = b.distance(c);
//		this.C = c.distance(a);
//	}
//	
//	public void check() {
//		if(this.A+this.B <= this.C || this.A+this.C <= this.B || this.C+this.B <= this.A) {
//			System.out.println(String.format("INVALID"));
//		}
//		else {
//			double area = 0.25 * sqrt( (A+B+C) * (A+B-C) * (A-B+C) * (-A+B+C) );
//			area = ( A * B * C )/(4* area);
//			double sp = Math.PI * area *area;
//			System.out.printf("%.2f\n", sp);
//		}
//	}
//}
//
//public class J04009 {
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int test = sc.nextInt();
//		while(test --> 0) {
//			Triangle tri = new Triangle(sc);
//			tri.check();
//		}
//	}
//}
