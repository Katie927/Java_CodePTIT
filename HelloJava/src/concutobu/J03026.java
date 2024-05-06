package concutobu;

import java.util.Scanner;

public class J03026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            if (a.compareTo(b) == 0)
                System.out.println(-1);
            else
                System.out.println(Math.max(a.length(), b.length()));
        }
	}
}
