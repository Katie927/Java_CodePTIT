package concutobu;

import java.util.Scanner;
import java.util.Vector;

public class J03004_ChuanHoaTen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            Vector<String> a = new Vector<String>();
            String x = "";
            s = s.toLowerCase() + " ";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    if (x != "") {
                        a.add(x);
                        x = "";
                    }
                } else {
                    x += s.charAt(i);
                }
            }
            for (int i = 0; i < a.size(); i++) {
                String k = a.get(i);
                System.out.print(k.substring(0, 1).toUpperCase() + k.substring(1) + " ");
            }
            System.out.println();
        }
        sc.close();
	}
}
