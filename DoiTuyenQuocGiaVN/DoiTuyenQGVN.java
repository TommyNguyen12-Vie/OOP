package DoiTuyenQuocGiaVN;

public class DoiTuyenQGVN {
	private String tenCauThu, viTri, tenCauLacBo;
	private int soAo;

	public DoiTuyenQGVN(String tenCauThu, String viTri, String tenCauLacBo, int soAo) {
		super();
		this.tenCauThu = tenCauThu;
		this.viTri = viTri;
		this.tenCauLacBo = tenCauLacBo;
		this.soAo = soAo;
	}

	@Override
	public String toString() {
		return "DoiTuyenQGVN [tenCauThu=" + tenCauThu + ", viTri=" + viTri + ", tenCauLacBo=" + tenCauLacBo + ", soAo="
				+ soAo + "]";
	}

	public String getTenCauThu() {
		return tenCauThu;
	}

	public void setTenCauThu(String tenCauThu) {
		this.tenCauThu = tenCauThu;
	}

	public String getViTri() {
		return viTri;
	}

	public void setViTri(String viTri) {
		this.viTri = viTri;
	}

	public String getTenCauLacBo() {
		return tenCauLacBo;
	}

	public void setTenCauLacBo(String tenCauLacBo) {
		this.tenCauLacBo = tenCauLacBo;
	}

	public int getSoAo() {
		return soAo;
	}

	public void setSoAo(int soAo) {
		this.soAo = soAo;
	}

}
