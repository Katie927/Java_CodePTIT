package concutobu;

import java.util.Scanner;

public class J01011 {
	public static long LCM(long a, long b) {
		while(a != 0 && b!=0) {
			if(a > b) {
				a = a%b;
			}
			else {
				b = b%a;
			}
		}
		return a + b;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		while(test --> 0) {
			long a = in.nextInt();
			long b = in.nextInt();
			long lcm = LCM(a,b);
			long tmp = a*b;
			System.out.println(tmp/lcm + " " + lcm);
		}
	}
}
