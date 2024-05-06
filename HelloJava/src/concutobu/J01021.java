 package concutobu;

import java.math.BigInteger;
import java.util.Scanner;

public class J01021 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			BigInteger mod = new BigInteger("1000000007");
			BigInteger a = in.nextBigInteger();
			BigInteger b = in.nextBigInteger();	
			if(a.equals(BigInteger.ZERO) && b.equals(BigInteger.ZERO))
				break;
			System.out.println(a.modPow(b, mod));
		}
//		in.close();
	}
}
