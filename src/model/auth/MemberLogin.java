package model.auth;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import controller.OptionController;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MemberLogin {
	static Scanner scan = new Scanner(System.in);

	public static boolean loginDaiso(){
		boolean passCustomer = true;
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
						log.info(ID + "고객님께서 로그인을 하셨습니다.(로그인기록 저장)");
						System.out.println();
						System.out.println("로그인 되셨습니다. 다이소에 오신걸 환영합니다!^^");
						pass = 1;}	}
				if(pass == 0) {
					System.out.println("로그인 실패입니다. 회원가입을 진행해주세요.");
					return false;}
					bufReader.close();
			} catch (IOException e) {
				//e.printStackTrace();
				view.FailView.failMessageView("데이터베이스 파일 입출력 오류입니다.");
			}
		}catch (FileNotFoundException e) {
			//e.printStackTrace();
			view.FailView.failMessageView("데이터베이스 정보를 찾을 수 없습니다.");
		}
		return true;
	}
}

