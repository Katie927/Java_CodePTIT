package adu_File;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Candidates{
	private String id;
	private String name;
	private double math;
	private double physic;
	private double chemistry;
	static DecimalFormat df = new DecimalFormat("0.#");
	
	
	public double totalScore() {
		return this.math*2 + this.physic + this.chemistry + this.bonusScore(); 
	}
	
	public double bonusScore() {
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
	
	public String result() {
		if(this.totalScore() >= 24) {
			return "TRUNG TUYEN";
		}
		else {
			return "TRUOT";
		}
	}
	
	
	@Override
	public String toString() {
		return this.id+" "+this.name+" "+df.format(this.bonusScore())+" "+df.format(this.totalScore())+" "+this.result();
	}
	
	public Candidates() {
		super();
	}
	public Candidates(String id, String name, double math, double physic, double chemistry) {
		super();
		this.id = id;
		this.name = name;
		this.math = math;
		this.physic = physic;
		this.chemistry = chemistry;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getPhysic() {
		return physic;
	}
	public void setPhysic(double physic) {
		this.physic = physic;
	}
	public double getChemistry() {
		return chemistry;
	}
	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}
}

public class J05057 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<Candidates> arr = new ArrayList<Candidates>();
		while(n --> 0) {
			String id = sc.nextLine();
			String name = sc.nextLine();
			double math = sc.nextDouble();
			double physic = sc.nextDouble();
			double chemistry = sc.nextDouble();
			sc.nextLine();
			Candidates x = new Candidates(id, name, math, physic, chemistry);
			arr.add(x);
		}
		
		Collections.sort(arr, new Comparator<Candidates>() {
			@Override
			public int compare(Candidates a, Candidates b) {
				return Double.compare(b.totalScore(), a.totalScore());
			}
		});
		
		for(Candidates i:arr) {
			System.out.println(i);
		}
		sc.close();
	}
}

//2
//KV2A002
//Hoang Thanh Tuan
//5
//6
//5
//KV2B123
//Ly Thi Thu Ha
//8
//6.5
//7
