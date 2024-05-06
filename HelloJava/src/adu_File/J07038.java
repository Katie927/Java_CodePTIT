package adu_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//class Student{
//	private String id;
//	private String name;
//	private String claSS;
//	private String email;
//	
//	public Student() {
//		super();
//	}
//	public Student(String id, String name, String claSS, String email) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.claSS = claSS;
//		this.email = email;
//	}
//	
//	private String fixedName(String name) {
//		name = name.trim();
//		String words[] = name.split("\\s+");
//		String s = "";
//		for(int i=0 ; i<words.length ; i++) {
//			s += Character.toUpperCase(words[i].charAt(0));
//			s += words[i].substring(1).toLowerCase() + " ";	
//		}
//		return s;
//	}
//	
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	@Override
//	public String toString() {
//		return id+" "+fixedName(name)+claSS;
//	}
//	public String getId() {
//		return id;
//	}
//	
//}

class Enterprise{
	private String id;
	private String name;
	private int intermSlot;
	
	private ArrayList<Student> interm = new ArrayList<Student>();
	
	public void display() {
		Collections.sort(interm, new Comparator<Student>() {
			@Override
			public int compare(Student a, Student b) {
				return a.getId().compareTo(b.getId());
			}
		});
		int dem = 0;
		for(Student i:interm) {
			dem++;
			if(dem > intermSlot) {
				break;
			}
			System.out.println(i);
		}
	}
	
	public Enterprise() {
		super();
	}
	public Enterprise(String id, String name, int intermSlot) {
		super();
		this.id = id;
		this.name = name;
		this.intermSlot = intermSlot;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setInterm(Student x) {
		this.interm.add(x);
	}
	
}

public class J07038 {
	static Student getStudentById(ArrayList<Student> arr, String id) {
		for(Student i:arr) {
			if(i.getId().equals(id)) {
				return i;
			}
		}
		return null;
	}

	static Enterprise getEnterpriseById(ArrayList<Enterprise> arr, String id) {
		for(Enterprise i:arr) {
			if(i.getId().equals(id)) {
				return i;
			}
		}
		return null;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
		int n1 = Integer.parseInt(sc1.nextLine());
		ArrayList<Student> students = new ArrayList<Student>();
		while(n1 --> 0) {
			String id = sc1.nextLine();
			String name = sc1.nextLine();
			String claSS = sc1.nextLine();
			String email = sc1.nextLine();
			
			Student stu = new Student(id, name, claSS, email);
			students.add(stu);
		}
		
		Scanner sc2 = new Scanner(new File("DN.in"));
		int n2 = Integer.parseInt(sc2.nextLine());
		ArrayList<Enterprise> enterprises = new ArrayList<Enterprise>();
		while(n2 --> 0) {
			String id = sc2.nextLine();
			String name = sc2.nextLine();
			int intermSlot = Integer.parseInt(sc2.nextLine());
			
			Enterprise ente = new Enterprise(id, name, intermSlot);
			enterprises.add(ente);
		}
		
		Scanner sc3 = new Scanner(new File("THUCTAP.in"));
		int n3 = Integer.parseInt(sc3.nextLine());
		while(n3 --> 0) {
			String stuId = sc3.next();
			String enterpriseId = sc3.nextLine();
			enterpriseId = enterpriseId.trim();
			Student intermStu = getStudentById(students, stuId);
			for(int i=0 ; i<enterprises.size() ; i++) {
				if(enterpriseId.equals(enterprises.get(i).getId())) {
					enterprises.get(i).setInterm(intermStu);
				}
			}
		}
		int k = Integer.parseInt(sc3.nextLine());
		while(k --> 0) {
			String tp = sc3.nextLine();
			Enterprise tmp = getEnterpriseById(enterprises, tp);
			System.out.println("DANH SACH THUC TAP TAI "+ tmp.getName() +":");
			tmp.display();
		}
	}
}
