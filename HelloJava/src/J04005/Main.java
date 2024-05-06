package J04005;
import java.util.Scanner;

import J04005.ThiSinh;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ThiSinh n = new ThiSinh(in.nextLine(),in.next(),in.nextFloat(),in.nextFloat(),in.nextFloat());
		System.out.println(n.getName() + " " + n.getDate() + " " + n.getPoint());
	}
}
