package concutobu;

import java.util.Scanner;

class PhanSo {
	private long a, b;
	PhanSo(long a, long b){
		this.a = a;
		this.b = b;
	}
	private long gcd(long x, long y) {
		while (y != 0) {
			long z = x % y;
	        x = y;
	        y = z;
		}
	    return x;
	}
	public String toString() {
        long g = gcd(this.a, this.b);
        return a / g + "/" + b / g;
    }
}

public class J04004_TongPhanSo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        PhanSo ans = new PhanSo(a * d + c * b, b * d);
        System.out.println(ans);
	}
}
