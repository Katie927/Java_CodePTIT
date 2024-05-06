package J04007;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String name = sc.nextLine();
		 String sex = sc.next();
		 String birth = sc.next();
		 sc.nextLine();
		 String address = sc.nextLine();
		 String taxCode = sc.next();
		 String date = sc.next();
		 NhanVien n = new NhanVien(name, sex, birth, address, taxCode, date);
		 System.out.println(n.getStaffCode()+" "+n.getName()+" "+n.getSex()+" "+n.getBirth()+" "+n.getAddress()+" "+n.getTaxCode()+" "+n.getDate());
		 sc.close();
	}
}
