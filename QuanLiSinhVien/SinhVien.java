package QuanLiSinhVien;

public class SinhVien {
	private String MSSV, hoLot, Ten, queQuan, chuyenNganh;
	private Ngay ngaySinh;

	public SinhVien(String mSSV, String hoLot, String ten, String queQuan, String chuyenNganh, Ngay ngaySinh) {
		super();
		MSSV = mSSV;
		this.hoLot = hoLot;
		Ten = ten;
		this.queQuan = queQuan;
		this.chuyenNganh = chuyenNganh;
		this.ngaySinh = ngaySinh;
	}

	public String getMSSV() {
		return MSSV;
	}

	public void setMSSV(String mSSV) {
		MSSV = mSSV;
	}

	public String getHoLot() {
		return hoLot;
	}

	public void setHoLot(String hoLot) {
		this.hoLot = hoLot;
	}

	public String getTen() {
		return Ten;
	}

	public void setTen(String ten) {
		Ten = ten;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public Ngay getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Ngay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public void hienThiThongTin() {
		System.out.print("SinhVien [MSSV=" + MSSV + ", hoLot=" + hoLot + ", Ten=" + Ten + ", queQuan=" + queQuan
				+ ", chuyenNganh=" + chuyenNganh + ", ngaySinh=");
		ngaySinh.hienThi();
	}

}
