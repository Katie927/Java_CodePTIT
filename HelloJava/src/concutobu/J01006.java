package concutobu;
import java.util.*;

public class J01006 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		long[] fibo = new long[93];
		fibo[1] = 1;
		for(int i=2 ; i<92 ; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		while(test -- > 0) {
			long n = in.nextLong();
			int check = 0;
			for(int i=0 ; i<93 ; i++) {
				if(n == fibo[i]) {
					check = 1;
					break;
				}
			}
			if(check == 1)	System.out.println("YES");
			else			System.out.println("NO");
		}
	}
}