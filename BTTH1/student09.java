package BTTH1;

import java.util.ArrayList;

public class student09 {
	public static void main(String[] args) {
		student st1 = new student(" A", "Nguyễn Văn", "1");
		student st2 = new student(" B", "Nguyễn Văn", "1");
		student st3 = new student(" C", "Nguyễn Văn", "1");
		student st4 = new student(" D", "Nguyễn Văn", "1");
		student st5 = new student(" E", "Nguyễn Văn", "1");

		ArrayList<student> arr = new ArrayList();
		arr.add(st4);
		arr.add(st3);
		arr.add(st2);
		arr.add(st1);
		arr.add(st5);

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith(" A")) {
				System.out.println("Stars with name = A: " + arr.get(i));
			}
		}

		System.out.println("List student: " + arr);

	}

}
