package QuanLiSinhVien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		ArrayList<SinhVien> dssv = new ArrayList<>();

		try {
			// doc file dssv
			File f = new File("D:\\SinhVien.txt");
			Scanner sc = new Scanner(f);

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] data = line.split(",");

				// tach du lieu tung dong va khoi tao sinh vien
				if (data.length >= 6) {
					String mssv = data[0].trim();
					String hoLot = data[1].trim();
					String ten = data[2].trim();
					String[] ngayThangNam = data[3].trim().split("-");
					int ngay = Integer.parseInt(ngayThangNam[0]);
					int thang = Integer.parseInt(ngayThangNam[1]);
					int nam = Integer.parseInt(ngayThangNam[2]);
					Ngay ngaySinh = new Ngay(ngay, thang, nam);
					String chuyenNganh = data[4].trim();
					String queQuan = data[5].trim();

					// tao doi tuong SV va them vao danh sach
					SinhVien sv = new SinhVien(mssv, hoLot, ten, queQuan, chuyenNganh, ngaySinh);
					dssv.add(sv);
				} else {
					System.out.println("Du lieu khong hop le " + line);
				}
			}
			sc.close();

		} catch (FileNotFoundException e) {
			System.out.println("Khong tim thay tap tin" + e.getMessage()); // mo ta nguyen nhan gay ra ngoai le
		}

		// hien thi thong tin danh sach sinhVien

		for (SinhVien sv : dssv) {
			sv.hienThiThongTin();
		}
	}
}
