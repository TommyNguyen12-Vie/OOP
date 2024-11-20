package QuanLiSinhVien;

public class Ngay {
	private int ngay, thang, nam;

	// make constructor co tham so truyen vao
	public Ngay(int ngay, int thang, int nam) {
		super();
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	// make constructor mac dinh
	public Ngay() {
		this.ngay = 1;
		this.thang = 1;
		this.nam = 1990;
	}

	// getter and setter
	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

// phuong thuc hien thi ngay 
	public void hienThi() {
		System.out.println(ngay + " - " + thang + " - " + nam);

	}

}
