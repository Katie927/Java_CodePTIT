package adu;

import java.util.ArrayList;
import java.util.Scanner;

class Candidates{
	public static int autoId = 1;
	
	private String name;
	private String dateOfBirth;
	private double lt;
	private double th;
	
	String id() {
		return String.format("PH%02d", autoId++);
	}
	
	int age(String date) {
		String year = date.substring(6);
		return 2021 - Integer.parseInt(year);
	}
	
	double bonus() {
		if(this.lt >=8 && this.th >= 8) {
			return 1;
		}
		else if( this.lt >=7.5 && this.th >= 7.5 ) {
			return 0.5;
		}
		else {
			return 0;
		}
	}
	
	int finalScore() {
		int score  =  (int) Math.round((lt + th)/2 + bonus());
		if(score > 10) {
			return 10;
		}
		else {
			return score;
		}
	}
	
	String result() {
		if(finalScore() > 8) {
			return "Xuat sac";
		}
		else if(finalScore() > 7) {
			return "Gioi";
		}
		else if(finalScore() > 6) {
			return "Kha";
		}
		else  if(finalScore() > 4) {
			return "Trung binh";
		}
		else {
			return "Truot";
		}
	}
	
	@Override
	public String toString() {
		return id()+" "+name+" "+age(dateOfBirth)+" "+finalScore()+" "+result();
	}
	
	public Candidates() {
		super();
	}
	public Candidates(String name, String dateOfBirth, double lt, double th) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.lt = lt;
		this.th = th;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setId(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLt() {
		return lt;
	}
	public void setLt(double lt) {
		this.lt = lt;
	}
	public double getTh() {
		return th;
	}
	public void setTh(double th) {
		this.th = th;
	}
}

public class J05060 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		ArrayList<Candidates> arr = new ArrayList<Candidates>();
		while(n --> 0) {
			String name = sc.nextLine();
			String datOfBirth = sc.nextLine();
			double lt =sc.nextDouble();
			double th = sc.nextDouble();
			sc.nextLine();
			
			Candidates x = new Candidates(name, datOfBirth, lt, th);
			arr.add(x);
		}
		for(Candidates i: arr) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
