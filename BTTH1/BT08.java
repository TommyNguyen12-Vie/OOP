package BTTH1;

import java.util.Scanner;

public class BT08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		int b = (int) (Math.random() * 100);

		do {
			System.out.println("Nhập vào số nguyên");
			a = scanner.nextInt();

			if (a > b) {
				System.out.println("Số bạn đoán lớn hơn");
			} else if (a < b) {
				System.out.println("Số bạn đoán nhỏ hơn");
			}

		} while (a != b);
		System.out.println("Bạn đã đoán đúng. Good job em!");
		System.out.println("Số random la " + b);

		scanner.close();
	}

}
