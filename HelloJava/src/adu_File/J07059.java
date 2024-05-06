package adu_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class CaThi{
	public static int autoId = 1;
	private String id;
	private String competeDate;
	private String competeTime;
	private String room;
	
	
	
	
	public CaThi() {
		super();
	}
	public CaThi(String id, String competeDate, String competeTime, String room) {
		super();
		this.id = id;
		this.competeDate = competeDate;
		this.competeTime = competeTime;
		this.room = room;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompeteDate() {
		return competeDate;
	}
	public void setCompeteDate(String competeDate) {
		this.competeDate = competeDate;
	}
	public String getCompeteTime() {
		return competeTime;
	}
	public void setCompeteTime(String competeTime) {
		this.competeTime = competeTime;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	
}

public class J07059 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("src/CATHI.in"));
		int test = Integer.parseInt(sc.nextLine());
		 
	}
}
