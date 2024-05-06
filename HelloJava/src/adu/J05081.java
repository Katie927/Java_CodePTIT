package adu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class chuHe implements Comparable<chuHe>{
	public static int NUM_PRODUCT = 1;
	private String Code;
	private String name;
	private String donVi;
	private int mua;
	private int ban;
	private int lai;
	
	public chuHe(Scanner sc){
		this.Code = "MH" + String.format("%03d", NUM_PRODUCT++);
		this.name = sc.nextLine();
		this.donVi = sc.nextLine();
		this.mua = sc.nextInt();
		this.ban = sc.nextInt();
		sc.nextLine();
		this.lai = this.ban - this.mua;
	}
	
	
	@Override 
	public int compareTo(chuHe t) {
		return t.lai - this.lai;
	}
	
	@Override
	public String toString() {
		return Code+" "+name+" "+donVi+" "+mua+" "+ban+" "+lai;
	}
	
}

public class J05081 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<chuHe> arr = new ArrayList<chuHe>();
		while(n --> 0) {
			chuHe x = new chuHe(sc);
			arr.add(x);
		}
		Collections.sort(arr);
		for (chuHe i : arr) {
			System.out.println(i);
		}
	}
}
