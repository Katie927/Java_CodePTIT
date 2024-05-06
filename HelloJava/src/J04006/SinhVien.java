package J04006;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;

class SinhVien {
	private String MSV;
	private String name;
	private String Lop;
	private Date date;
	private float GPA;
	
	public SinhVien(String name, String Lop, Date date, float GPA) {
		MSV = "B20DCCN001";
		this.name = name;
		this.Lop = Lop;
		this.date = date;
		this.GPA = GPA;
	}
	public String getMSV() {
		return MSV;
	}
	public String getName() {
		return name;
	}
	public String getLop() {
		return Lop;
	}
	public String getDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		return formatter.format(date);
	}
	String getPoint() {
		DecimalFormat df = new DecimalFormat("#.00");
	    return df.format(GPA);
	}
	
}
