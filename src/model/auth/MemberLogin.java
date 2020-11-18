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
		System.out.println("로그인을 위해  ID와 비밀번호를 입력하세요.");
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
						System.out.println("로그인 되셨습니다. 다이소에 오신걸 환영합니다!^^");
						pass = 1;}	}
				if(pass == 0) {
					System.out.println("로그인 실패입니다. 회원가입을 진행해주세요.");}
				bufReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

