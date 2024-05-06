package J04002;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		String c = sc.next();
		if(w>0 && h>0) {
			Rectangle rect = new Rectangle(w, h, c);
			System.out.println(rect);
		}
		else {
			System.out.println("INVALID");
		}
	}
}