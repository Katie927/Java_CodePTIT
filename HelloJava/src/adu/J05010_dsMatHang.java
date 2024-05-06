package adu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class matHang implements Comparable<matHang> {
	static int autoId = 1;
	private String id = "";
	private String name;
	private String type;
	private double inPrice;
	private double outPrice;
	
	public matHang(String name, String type, double inPrice, double outPrice) {
		super();
		this.id += String.format("%d", autoId++);
		this.name = name;
		this.type = type;
		this.inPrice = inPrice;
		this.outPrice = outPrice;
	}
	
	double profit() {
		return this.outPrice - this.inPrice;
	}
	
	@Override
	public String toString() {
		return this.id+" "+this.name+" "+this.type+" "+String.format("%.2f", this.profit());
	}
	
	@Override
	public int compareTo(matHang t) {
		if(this.profit() > t.profit()) {
			return -1;
		}
		else if(this.profit() == t.profit()) {
			return 0;
		}
		else {
			return 1;
		}
	}
}

public class J05010_dsMatHang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<matHang> arr = new ArrayList<matHang>(n);
		while(n --> 0) {
			String name = sc.nextLine();
			String type = sc.nextLine();
			double price = Double.parseDouble(sc.nextLine());
			double quantity = Double.parseDouble(sc.nextLine());
			matHang x = new matHang(name, type, price, quantity);
			arr.add(x);
		}
		Collections.sort(arr);
		for (matHang i : arr) {
			System.out.println(i);
		}
	}
}
