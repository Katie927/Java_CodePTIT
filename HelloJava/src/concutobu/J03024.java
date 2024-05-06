package concutobu;

import java.util.Scanner;

public class J03024 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test --> 0) {
			String str = sc.next();
			int chan = 0;
			int le = 0;
			int l = str.length();
			int check;
			if(l % 2 == 0)
				check = 2;
			else
				check = 1;
			if(str.charAt(0) == '0')
				check  = -1;
			for(int i=0 ; i<l ; i++) {
				char c = str.charAt(i);
				if(c < '0' || c>'9') {
					check = -1;
					break;
				}
				if(c % 2 == 0)
					chan += 1;
				else
					le += 1;
			}
			if(check == -1) 
				System.out.println("INVALID");
			else if ((check == 1 && le > chan) || (check == 2 && chan >le)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
