package adu_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class DN{
	private String id;
	private String name;
	private int quantity;
	
	
	@Override
	public String toString() {
		return id + " " + name + " " + quantity;
	}
	
	public DN() {
		super();
	}
	public DN(String id, String name, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}

public class J07037 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DN.in"));
		
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<DN> arr = new ArrayList<DN>();
		while(n --> 0) {
			String id = sc.nextLine();
			String name = sc.nextLine();
			int tc = Integer.parseInt(sc.nextLine());
			DN xs = new DN(id, name, tc);
			arr.add(xs);
		}
		
		Collections.sort(arr, new Comparator<DN>() {
			public int compare(DN a, DN b) {
				return a.getId().compareTo(b.getId());
			}
		});
		for(DN i:arr) {
			System.out.println(i);
		}
	}
}
