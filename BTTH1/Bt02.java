package BTTH1;

import java.util.Scanner;

public class Bt02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào bán kính hình tròn");
		double r = scanner.nextDouble();

		double chuVi = 2 * Math.PI * r;
		double dienTich = Math.PI * Math.pow(r, 2);

		System.out.printf("Chu vi: %.3f - Diện tích: %.3f ", chuVi, dienTich);
	}

}
