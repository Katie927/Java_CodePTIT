package concutobu;

import java.util.Scanner;

public class J01018 {
	public static String check(String str) {
		char x = str.charAt(0);
		int sum = x-'0';
		for(int i=1 ; i<str.length() ; i++) {
			char c = str.charAt(i);
			char c1 = str.charAt(i-1);
			int k = Math.abs(c-c1);
			sum += c-'0';
			if(k != 2) {
				return "NO";
			}
		}
		if(sum % 10 != 0)	
			return "NO";
		return "YES";
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		while(test --> 0) {
			String str = in.next();
			System.out.println(check(str));
		}
		in.close();
	}
}
