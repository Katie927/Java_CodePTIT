package J04006;
import J04006.SinhVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc  = new Scanner(System.in);
		String name = sc.nextLine();
		String Lop = sc.next();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = formatter.parse(sc.next());
		float GPA = sc.nextFloat();
		SinhVien n = new SinhVien(name, Lop, date, GPA);
		System.out.println(n.getMSV()+" "+n.getName()+" "+ n.getLop()+" "+n.getDate()+" "+n.getPoint());
	}
}
