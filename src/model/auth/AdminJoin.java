package model.auth;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class AdminJoin {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Playdata\\Desktop\\AdminDB.txt");
		try {
			FileWriter filewritter = new FileWriter(file, true);
			if(file.isFile() && file.canWrite()) {
				System.out.println("����(������)������ ���� ID�� PW�� �Է��ϼ���.");
				System.out.print("ID : ");
				filewritter.append(scan.nextLine());
				filewritter.append("\t");
				System.out.print("PW : ");
				filewritter.append(scan.nextLine());
				filewritter.append("\r");
				System.out.println("���������� ��ϵǼ̽��ϴ�.");
			}
			filewritter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

