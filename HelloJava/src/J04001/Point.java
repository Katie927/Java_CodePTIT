package J04001;

import static java.lang.Math.*;

public class Point {
	private double x;
	private double y;
	
	public Point (double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getx() {
		return x;
	}
	public double gety() {
		return y;
	}
	
	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	
	double distance(Point p) {
		return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
	}
	double distance(Point a, Point b) {
		return sqrt(pow(a.x - b.x, 2) + pow(a.y - b.y, 2));
	}
}
