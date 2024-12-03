package BTTH1;

import java.util.Scanner;

public class Bt05 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu: ");
		int a = scanner.nextInt();

		int[] array = new int[a];

		for (int i = 0; i < a; i++) {
			System.out.println("Nhập phần tử thứ: " + i + 1);
			array[i] = scanner.nextInt();
		}

		for (int i = 0; i < a; i++) {
			System.out.println("Cac phan tu trong mang: " + array[i]);
		}

	}

}
