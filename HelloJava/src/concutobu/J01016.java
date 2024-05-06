package concutobu;

import java.util.Scanner;

public class J01016 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			String str = in.next();
			int ans = 0;
			for(int i=0 ; i<str.length() ; i++) {
				char c = str.charAt(i);
				if(c == '4' || c == '7') {
					ans++;
				}
			}
			if(ans == 4 || ans == 7) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		in.close();
	}
}
