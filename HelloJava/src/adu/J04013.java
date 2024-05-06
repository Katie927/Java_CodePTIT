package adu;

import java.text.DecimalFormat;
import java.util.Scanner;

class Contestant{
	private String id;
	private String name;
	private double mat;
	private double physic;
	private double chemistry;
	
	public Contestant(String id, String name, double mat, double physic, double chemistry) {
		super();
		this.id = id;
		this.name = name;
		this.mat = mat;
		this.physic = physic;
		this.chemistry = chemistry;
	}
	
	double bonus() {
		if(this.id.charAt(2) == '1') {
			return 0.5;
		}
		else if(this.id.charAt(2) == '2') {
			return 1;
		}
		else {
			return 2.5;
		}
	}
	
	double totalScore() {
		return this.mat*2 + this.chemistry + this.physic;
	}
	String result() {
		if(this.totalScore() + bonus() >= 24) {
			return "TRUNG TUYEN";
		}
		else {
			return "TRUOT";
		}
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.##");
		return id+" "+name+" "+df.format(bonus())+" "+df.format(totalScore())+" "+result();
	}
	
}

public class J04013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id =  sc.nextLine();
		String name = sc.nextLine();
		double mat = Double.parseDouble(sc.nextLine());
		double physic = Double.parseDouble(sc.nextLine());
		double chemistry = Double.parseDouble(sc.nextLine());
		
		Contestant n = new Contestant(id, name, mat, physic, chemistry);
		System.out.println(n);
		
	}
}
