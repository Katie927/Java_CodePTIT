package adu_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Subject {
	private String id;
	private String name;
	private int tc;
	
	@Override
	public String toString() {
		return this.id+" "+this.name+" "+this.tc;
	}
	
	public Subject() {
		super();
	}
	public Subject(String id, String name, int tc) {
		super();
		this.id = id;
		this.name = name;
		this.tc = tc;
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
	public int getTc() {
		return tc;
	}
	public void setTc(int tc) {
		this.tc = tc;
	}
}

public class J07034 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MONHOC.in"));
		
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Subject> arr = new ArrayList<Subject>();
		while(n --> 0) {
			String id = sc.nextLine();
			String name = sc.nextLine();
			int tc = Integer.parseInt(sc.nextLine());
			Subject xs = new Subject(id, name, tc);
			arr.add(xs);
		}
		
		Collections.sort(arr, new Comparator<Subject>() {
			public int compare(Subject a, Subject b) {
				return a.getName().compareTo(b.getName());
			}
		});
		for(Subject i:arr) {
			System.out.println(i);
		}
	}
}
