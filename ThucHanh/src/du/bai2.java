package du;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class Student implements Comparable<Student>{
	private String name;
	private String start;
	private String end;
	private long onlineTime;
	public Student(String name, String start, String end) throws ParseException {
		super();
		this.name = name;
		this.start = start;
		this.end = end;
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date in = (Date) df.parse(this.start);
		Date out = (Date) df.parse(this.end);
		this.onlineTime = (long) out.getTime() - in.getTime();
		this.onlineTime /= 60000;
	}
	
	@Override
	public String toString() {
		return name+" "+onlineTime;
	}
	@Override
	public int compareTo(Student t) {
		if(this.onlineTime > t.onlineTime) {
			return -1;
		}
		else if(this.onlineTime == t.onlineTime) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
}

public class bai2 {
	public static void main(String[] args) throws FileNotFoundException, ParseException {
		Scanner sc = new Scanner(new File("ONLINE.in"));
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Student> arr = new ArrayList<Student>();
		while(n --> 0) {
			Student stu = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine());
			arr.add(stu);
		}
		Collections.sort(arr);
		for(Student i: arr) {
			System.out.println(i);
		}
	}
}
