package adu;

import java.util.Scanner;

class Point3D{
	private double x;
	private double y;
	private double z;
	public Point3D(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static Point3D _vector(Point3D A, Point3D B) {
		return new Point3D(A.x- B.x, A.y-B.y, A.z-B.z);
	}
	
	public static Point3D normalVector(Point3D ab, Point3D ac) {
		double A = ab.y*ac.z - ab.z*ac.y;
		double B = -ab.x*ac.z + ab.z*ac.x;
		double C = ab.x*ac.y - ab.y*ac.x;
		return new Point3D(A, B, C);
	}
	
	public static boolean check(Point3D A, Point3D B, Point3D C, Point3D D) {
		Point3D ab = _vector(A, B);
		Point3D ac = _vector(A, C);
		Point3D norV = normalVector(ab, ac);
		
		double ans = norV.x*(D.x- A.x) + norV.y*(D.y- A.y) + norV.z*(D.z- A.z);
//		System.out.println(norV.x+" " + norV.y +" "+ norV.z);
//		System.out.println(ans);
		return ans == 0;
	}
}

public class J04011 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
}