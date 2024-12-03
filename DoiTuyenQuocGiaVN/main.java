package DoiTuyenQuocGiaVN;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
	static ArrayList<DoiTuyenQGVN> dtvn = new ArrayList<>();

	public static void main(String[] args) {

		try {
			// doc file doi tuyen quoc gia viet nam
			File f = new File("D:\\DoiTuyenQuocGiaVN.txt");
			Scanner sc = new Scanner(f);
			sc.nextLine();
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] data = line.split(",");

				if (data.length == 4) {
					String tenCauThu = data[0].trim();
					String viTri = data[1].trim();
					int soAo = Integer.parseInt(data[2].trim());
					String tenCauLacBo = data[3].trim();

					DoiTuyenQGVN dtqg = new DoiTuyenQGVN(tenCauThu, viTri, tenCauLacBo, soAo);
					dtvn.add(dtqg);
				}
			}
			// in cac cau thu
			System.out.println("Danh sach doi tuyen quoc gia Viet Nam: ");
			for (DoiTuyenQGVN dtqg : dtvn) {
				System.out.println(dtqg);
			}
			// dem so luong cau thu trong doi tuyen
			System.out.println("So luong cau thu trong doi tuyen: " + getTotalPlayer());
			// so luong cau thu co so ao < 20
			System.out.println("So luong cau thu co so ao < 20: ");
			getShirtNumberLessThan20();
			// Thong ke so luong cau thu theo tung vi tri
			System.out.println("Thong ke so luong cau thu theo tung vi tri: ");
			positionStatic();
		} catch (FileNotFoundException e) {
			System.out.println("File khong hop le!!");
		}

	}

	// dem so luong cau thu
	private static int getTotalPlayer() {
		return dtvn.size();
	}

	// cho biet cau thu co so ao nho hon 20
	private static void getShirtNumberLessThan20() {
		boolean found = false;
		for (DoiTuyenQGVN dtqg : dtvn) {
			if (dtqg.getSoAo() < 20) {
				System.out.println("Cau thu co so ao < 20: " + dtqg.getTenCauThu());
				found = true;
			}
		}
		if (!found) {
			System.out.println("khong co cau thu nao co so ao < 20");
		}
	}
	// thong ke so luong cau thu theo tung vi tri

	private static void positionStatic() {
		Map<String, Integer> positionCount = new HashMap<>();
		// String la vi tri cua cau thu
		// Integer la so luong cau thu o vi tri do
		for (DoiTuyenQGVN dtqg : dtvn) {
			String position = dtqg.getViTri();// lay vi tri cua cau thu. vd thu mon, tien dao,..
			// cap nhat so luong cau thu o vi tri position
			positionCount.put(position, positionCount.getOrDefault(position, 0) + 1);
		}
		// in ket qua thong ke
		for (Map.Entry<String, Integer> entry : positionCount.entrySet()) {
			// entry.getKey() trả về vị trí (key)
			// entry.getValue() trả về số lượng cầu thủ ở vị trí đó (value)
			System.out.println(entry.getKey() + ": " + entry.getValue() + " nguoi");
		}
	}

}
