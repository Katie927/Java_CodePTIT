package J04008;

import java.util.Scanner;
import java.lang.Math;

public class Point {
	private double x;
	private double y;
	
	void input(Scanner sc) {
		this.x = sc.nextDouble();
		this.y = sc.nextDouble();
	}
	
	double distance(Point p) {
		double x0 = this.x - p.x;
		double y0 = this.y - p.y;
		return Math.sqrt(x0*x0 + y0*y0);
	}
	
	double checkTriagle(Point a, Point b) {
		double A = this.distance(a);
		double B = this.distance(b);
		double C = a.distance(b);
		if (A + B > C && B + C > A && A + C > B)
            return A + B + C;
        return -1;
	}
	
//	public Point (double x, double y) {
//		this.x = x;
//		this.y = y;
//	}
//	public double getx() {
//		return x;
//	}
//	public double gety() {
//		return y;
//	}
//	
//	public Point(Point p) {
//		this.x = p.x;
//		this.y = p.y;
//	}
//	
//	double distance(Point p) {
//		return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
//	}
//	double distance(Point a, Point b) {
//		return sqrt(pow(a.x - b.x, 2) + pow(a.y - b.y, 2));
//	}
}
