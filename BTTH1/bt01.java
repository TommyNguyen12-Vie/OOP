package BTTH1;

import java.util.Scanner;

public class bt01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào họ của bạn: ");
		String ho = scanner.nextLine();
		System.out.println("Nhập vào tên lót của bạn: ");
		String tenLot = scanner.nextLine();
		System.out.println("Nhập vào tên của bạn: ");
		String name = scanner.nextLine();

		System.out.println("Xin chào " + ho + tenLot + name);

		if (Character.isUpperCase(ho.charAt(0)) && Character.isUpperCase(name.charAt(0))) {
			System.out.println("Họ và tên đêu bắt đầu bằng chữ hoa");
		} else {
			System.out.println("Không bắt đầu = chữ hoa ");
		}

		System.out.println("Email: " + name + ho.charAt(0) + tenLot.charAt(0) + "gmail.com");

		scanner.close();
	}
}
