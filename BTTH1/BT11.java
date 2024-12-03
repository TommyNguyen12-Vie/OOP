package BTTH1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BT11 {
	public static void main(String[] args) {
		ArrayList<SinhVienBT11> dssv = new ArrayList<>();

		try {
			// doc file SV-HS-CD
			File f = new File("D:\\SV-HS-CD.txt");
			Scanner sc = new Scanner(f);
			int count = 0;
			sc.nextLine();
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				count++;
				String[] data = line.split(",");

				// bo qua dong cmt bat dau bang //
				if (line.trim().startsWith("//")) {

					continue;
				}

				if (data.length < 7) {
					continue; // bo qua dong thieu du lieu
				}
				String mssv = data[0].trim();
				String hoLot = data[1].trim();
				String ten = data[2].trim();
				String ngaySinh = data[3].trim();
				String nganhHoc = data[4].trim();
				String noiSinh = data[5].trim();
				String truongDH = data[6].trim();

				SinhVienBT11 sv = new SinhVienBT11(mssv, hoLot, ten, ngaySinh, nganhHoc, noiSinh, truongDH);
				dssv.add(sv);
			}

			for (SinhVienBT11 sv : dssv) {
				System.out.println(sv);
			}
//			System.out.println("Danh sach day du info: " + count);

		} catch (FileNotFoundException e) {

			System.out.println("File do khong hop le!!" + e.getMessage());
		}

	}
}
