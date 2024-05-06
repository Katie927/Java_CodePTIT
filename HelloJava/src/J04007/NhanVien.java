package J04007;

public class NhanVien {
	public String name;
	public String sex;
	public String birth;
	public String address;
	public String taxCode;
	public String date;
	public String staffCode;
	
	public NhanVien(String name, String sex, String birth, String address, String taxCode, String date) {
		staffCode = "00001";
		this.name = name;
		this.sex = sex;
		this.birth = birth;
		this.address = address;
		this.taxCode = taxCode;
		this.date = date;
	}
	public String getStaffCode() {
		return staffCode;
	}
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}
	public String getBirth() {
		return birth;
	}
	public String getAddress() {
		return address;
	}
	public String getTaxCode() {
		return taxCode;
	}
	public String getDate() {
		return date;
	}
}
