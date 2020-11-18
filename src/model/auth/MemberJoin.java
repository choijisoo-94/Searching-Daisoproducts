package model.auth;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class MemberJoin {

	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Playdata\\Desktop\\MemberDB.txt");
		try {
			FileWriter filewritter = new FileWriter(file, true);
			if(file.isFile() && file.canWrite()) {
				System.out.println("회원가입을 위해 ID와 PW를 입력하세요.");
				System.out.print("ID : ");
				filewritter.append(scan.nextLine());
				filewritter.append("\t");
				System.out.print("PW : ");
				filewritter.append(scan.nextLine());
				filewritter.append("\r");
				System.out.println("회원으로 등록되셨습니다.");
			}
			filewritter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

