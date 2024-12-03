package BTTH1;

public class SinhVienBT11 {
	private String mssv, hoLot, ten, ngaySinh, chuyenNganh, queQuan, truongHoc;

	@Override
	public String toString() {
		return "SinhVienBT11 [mssv=" + mssv + ", hoLot=" + hoLot + ", ten=" + ten + ", ngaySinh=" + ngaySinh
				+ ", chuyenNganh=" + chuyenNganh + ", queQuan=" + queQuan + ", truongHoc=" + truongHoc + "]";
	}

	public SinhVienBT11(String mssv, String hoLot, String ten, String ngaySinh, String chuyenNganh, String queQuan,
			String truongHoc) {
		super();
		this.mssv = mssv;
		this.hoLot = hoLot;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.chuyenNganh = chuyenNganh;
		this.queQuan = queQuan;
		this.truongHoc = truongHoc;
	}

}
