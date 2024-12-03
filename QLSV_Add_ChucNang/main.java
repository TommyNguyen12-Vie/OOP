//a) Viết chức năng thêm tên sinh viên mới vào cuối danh sách.
//b) Viết chức năng xuất danh sách sinh viên ra màn hình.
//c) Viết chức năng xóa một sinh viên theo họ và tên sinh viên.
//d) Viết chức năng tìm kiếm một sinh viên bằng tên sinh viên.
//2
//e) Viết hàm main dưới dạng menu lựa chọn các chức năng trên.
package QLSV_Add_ChucNang;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<SinhVien> dssv = new ArrayList<>();

	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("=========MENU=======");
			System.out.println("1. Chuc nang them ten sinh vien moi vao cuoi danh sach.");
			System.out.println("2. Chuc nang xuat danh sach sinh vien ra man hinh.");
			System.out.println("3. Chuc nang xoa mot sinh vien theo ho va ten.");
			System.out.println("4. Chuc nang tim kiem mot sinh vien bang ten sinh vien.");
			System.out.println("0. Thoat chuong trinh!! ");
			System.out.println("Moi ban chon!");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 0: {
				System.out.println("Cam on ban da su dung chuong trinh >< ");
				break;
			}
			case 1: {
				System.out.println("1. Chuc nang them ten sinh vien moi vao cuoi danh sach.");
				addSinhVien();
				break;
			}
			case 2: {
				System.out.println("2. Chuc nang xuat danh sach sinh vien ra man hinh.");
				outputSinhVien();
				break;
			}
			case 3: {
				System.out.println("3. Chuc nang xoa mot sinh vien theo ho va ten.");
				deleteSinhVien();
				break;
			}
			case 4: {
				System.out.println("4. Chuc nang tim kiem mot sinh vien bang ten sinh vien.");
				searchSinhVien();
				break;
			}
			default:
				System.out.println("Lua chon khong hop le!!! Vui long thu lai.");
				break;
			}

		} while (choice != 0);

	}

	private static void addSinhVien() {

		System.out.println("Nhap ten sinh vien: ");
		String name = sc.nextLine();
		System.out.println("Nhap tuoi sinh vien: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap id sinh vien: ");
		String id = sc.nextLine();
		System.out.println("Nhap chuyen nganh sinh vien: ");
		String major = sc.nextLine();
		System.out.println("Nhap que quan sinh vien: ");
		String homeTown = sc.nextLine();

		SinhVien sv = new SinhVien(name, age, id, major, homeTown);
		dssv.add(sv);
	}

	private static void outputSinhVien() {
		if (dssv.isEmpty()) {
			System.out.println("Danh sach sinh vien rong: ");
		} else {
			System.out.println("Danh sach sinh vien: ");
			for (SinhVien sv : dssv) {
				System.out.println(sv);
			}
		}

	}

	private static void deleteSinhVien() {
		System.out.println("Nhap ten sinh vien can xoa: ");
		String nameToDelete = sc.nextLine();
		boolean found = false;

		// tim va xoa sinh vien trong ds
		for (SinhVien sv : dssv) {
			if (sv.getName().equalsIgnoreCase(nameToDelete)) {
				dssv.remove(sv);
				System.out.println("Da xoa sinh vien co name = " + nameToDelete);
			}
			found = true;
			break;
		}
		if (!found) {
			System.out.println("Khong tim thay sinh vien co name =  " + nameToDelete);
		}

	}

	private static void searchSinhVien() {
		System.out.println("Nhap ten sinh vien can tim: ");
		String nameToSearch = sc.nextLine();
		boolean found = false;

		// tim kiem sinh vien theo ten
		for (SinhVien sv : dssv) {
			if (sv.getName().equalsIgnoreCase(nameToSearch)) {
				System.out.println("Tim thay sinh vien: " + sv);
				found = true;
				break;
			}

		}
		if (!found) {
			System.out.println("Khong tim thay sinh vien co name = " + nameToSearch);
		}

	}

}
