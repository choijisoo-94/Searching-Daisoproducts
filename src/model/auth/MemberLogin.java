package model.auth;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class MemberLogin {
	static Scanner scan = new Scanner(System.in);

	public static void loginDaiso(){
		int pass = 0;
		System.out.println("�α����� ����  ID�� ��й�ȣ�� �Է��ϼ���.");
		System.out.print("ID : ");
		String ID = scan.nextLine();
		System.out.print("PW : ");
		String PW = scan.nextLine();
		File file = new File("C:\\Users\\Playdata\\Desktop\\MemberDB.txt");
		try {
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			try {
				while((line = bufReader.readLine()) != null) {
					int passID = line.indexOf(ID);
					int passPW = line.indexOf(PW);
					if(passID != -1 && passPW != -1) {
						System.out.println();
						System.out.println("�α��� �Ǽ̽��ϴ�. ���̼ҿ� ���Ű� ȯ���մϴ�!^^");
						pass = 1;}	}
				if(pass == 0) {
					System.out.println("�α��� �����Դϴ�. ȸ�������� �������ּ���.");}
				bufReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

