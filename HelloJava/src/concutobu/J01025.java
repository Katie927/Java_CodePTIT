package concutobu;

import java.util.Scanner;

public class J01025 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = in.nextInt();
			int a1 = in.nextInt();
			int b1 = in.nextInt();
			int c1 = in.nextInt();
			int d1 = in.nextInt();
			int x1 = Math.min(a1, a);
			int x2 = Math.min(b1, b);
			int x3 = Math.max(c, c1);
			int x4 = Math.max(d, d1);
			int ans = Math.max(x3-x1, x4-x2);
			System.out.println(ans * ans);
	}
}
