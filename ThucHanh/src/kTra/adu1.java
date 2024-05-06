package kTra;

import java.math.BigInteger;
import java.util.Scanner;

public class adu1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		sc.nextLine();
		while(test --> 0) {
			String s = sc.nextLine();
			BigInteger n = new BigInteger(s);
			int dem = 0;
			boolean ok = false;
			while(dem < 1000) {
				StringBuilder s1 = new StringBuilder(n.toString());
				String s2 = s1.reverse().toString();
				BigInteger n2 = new BigInteger(s2);
				
				if(n.mod(new BigInteger("13")).toString() == "0") {
					System.out.println(n.toString());
					ok = true;
					break;
				}
				n = n.add(n2);

				dem++;
			}
			if (!ok) {
				System.out.println("-1");
			}
		}
	}
}
