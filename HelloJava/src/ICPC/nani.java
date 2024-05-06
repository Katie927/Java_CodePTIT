package ICPC;

import java.util.ArrayList;
import java.util.Scanner;

public class nani {
	public static void main(String[] args) throws Exception {
//		chuHe n = new chuHe();
//		n.display();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<chuHe> arr = new ArrayList<chuHe>();
		for(int i=0 ; i<n ; i++) {
			arr.add(new chuHe());
		}
		for(chuHe i : arr) {
			System.out.println(i);
		}
	}
}
