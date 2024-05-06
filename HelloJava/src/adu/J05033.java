package adu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
	private int h;
	private int m;
	
	
	public Time(int h, int m) {
		super();
		this.h = h;
		this.m = m;
	}

	@Override
	public int compareTo(Time t) {
		int s1 = h * 60 + m;
        int s2 = t.h * 60 + t.m ;
        return s1 - s2;
	}
	
	@Override
	public String toString() {
		return String.format("%d", h)+" gio "+m+" phut";
	}
}

class Player{
	private String id;
	private String name;
	private String inTime;
	private String outTime;
	private Time playedTime;
	
	public Player(String id, String name, String inTime, String outTime) {
		super();
		this.id = id;
		this.name = name;
		this.inTime = inTime;
		this.outTime = outTime;
	}
	
	Time getPlayedTime() {
		
		return 
	}
	
}

public class J05033 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Time arr[] = new Time[n];
		ArrayList<Time> lt = new ArrayList<>(n);
		for(int i=0 ; i<n ; i++) {
			arr[i] = new Time(sc);
			lt.add(arr[i]);
		}
		Collections.sort(lt);
		for(Time i : lt) {
			System.out.println(i);
		}
	}
}
