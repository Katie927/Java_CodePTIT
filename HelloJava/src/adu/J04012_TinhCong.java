package adu;

import java.util.Scanner;

class Employee{
	private String name;
	private long salary;
	private int workDay;
	private String position;
	
	public Employee(String name, long salary, int workDay, String position) {
		super();
		this.name = name;
		this.salary = salary;
		this.workDay = workDay;
		this.position = position;
	}
	
	public long getSalary() {
		return salary*workDay;
	}

	public long bonus() {
		if(this.workDay >= 25) {
			return this.getSalary() * 2/10;
		}
		else if(this.workDay >=22) {
			return this.getSalary() / 10;
		}
		else {
			return 0;
		}
	}
	
	public int posBonus() {
		if(this.position.charAt(0) == 'G') {
			return 250000;
		}
		else if(this.position.charAt(0) == 'P') {
			return 200000;
		}
		else if(this.position.charAt(0) == 'T') {
			return 180000;
		}
		else {
			return 150000;
		}
	}
	
	long totalSalary() {
		return this.getSalary() + this.bonus() + this.posBonus();
	}
	
	@Override
	public String toString() {
		return "NV01 " +this.name +" "+this.getSalary()+" "+this.bonus()+" "+this.posBonus()+" "+this.totalSalary();
	}
}

public class J04012_TinhCong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		long salary = Long.parseLong(sc.nextLine());
		int workDays = Integer.parseInt(sc.nextLine());
		String position = sc.nextLine();
		
		Employee n = new Employee(name, salary, workDays, position);
		System.out.println(n);
	}
}
