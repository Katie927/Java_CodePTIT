package concutobu;

import java.math.BigInteger;
import java.util.Scanner;

public class SoNguyenLon {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		//in.nextline();
		while(test --> 0) {
			BigInteger a = new BigInteger(in.next());
			BigInteger b = new BigInteger(in.next());
			System.out.println(a.add(b));
		}
		
//		in.close();
	}
}
