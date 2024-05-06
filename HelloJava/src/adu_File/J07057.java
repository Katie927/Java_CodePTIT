package adu_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Candidate{
	public static int autoId = 1;
	private String id;
	private String name;
	private double score;
	private String danToc;
	private double bonus;
	
	public String getId() {
		return id;
	}

	String fixesName(String name) {
		String s = "";
		name = name.trim();
		String words[] = name.split("\\s+");
		for(String i:words) {
			s += Character.toUpperCase(i.charAt(0));
			s += i.substring(1).toLowerCase() + " ";
		}
		return s;
	}
	
	double totalScore() {
		double t = 0;
		if(this.bonus == 1) {
			t += 1.5;
		}
		else if(this.bonus == 2) {
			t += 1;
		}
		if(!this.danToc.equals("Kinh")) {
			t += 1.5;
		}
		return this.score + t;
	}
	
	String result() {
		if(totalScore() >= 20.5) {
			return "Do";		
		}
		return "Truot";
	}
	
	
	@Override
	public String toString() {
		return id+" "+fixesName(name)+String.format("%.1f", totalScore())+" "+result();
	}
	
	public Candidate() {
		super();
	}
	public Candidate(String name, double score, String danToc, double bonus) {
		super();
		this.id = String.format("TS%02d", autoId++);
		this.name = name;
		this.score = score;
		this.danToc = danToc;
		this.bonus = bonus;
	}
}

public class J07057 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("THISINH.in"));
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Candidate> arr = new ArrayList<Candidate>();
		while(n --> 0) {
			String name = sc.nextLine();
			double score = Double.parseDouble(sc.nextLine());
			String danToc = sc.nextLine();
			double bonus = Double.parseDouble(sc.nextLine());
			Candidate x = new Candidate(name, score, danToc, bonus);
			arr.add(x);
		}
		Collections.sort(arr, new Comparator<Candidate>() {
			@Override
			public int compare(Candidate a, Candidate b) {
				if(Double.compare(b.totalScore(), a.totalScore()) == 0) {
					return a.getId().compareTo(b.getId());
				}
				return Double.compare(b.totalScore(), a.totalScore());
			}
		});
		for(Candidate i:arr) {
			System.out.println(i);
		}
	}
}
