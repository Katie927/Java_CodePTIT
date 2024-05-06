package J04008;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test --> 0) {
			Point A = new Point();
			Point B = new Point();
			Point C = new Point();
			A.input(sc);
			B.input(sc);
			C.input(sc);
			double k = A.checkTriagle(B,  C);
			if (k != -1)
                System.out.printf("%.3f\n", k);
            else
                System.out.println("INVALID");
		}
	}
}