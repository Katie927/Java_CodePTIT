package J04003_PhanSo;

import java.util.Scanner;

public class J04003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		PhanSo n = new PhanSo(a, b);
		System.out.println(n.ans());
	}
}
