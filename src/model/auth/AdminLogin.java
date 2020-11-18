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
public class AdminLogin {
	static Scanner scan = new Scanner(System.in);

	public static boolean loginDaiso(){
		boolean passCustomer = true;
		int pass = 0;
		System.out.println("관리자님 접근 허용을 위해  ID와 비밀번호를 입력하세요.");
		System.out.print("ID : ");
		String ID = scan.nextLine();
		System.out.print("PW : ");
		String PW = scan.nextLine();
		File file = new File("C:\\Users\\Playdata\\Desktop\\AdminDB.txt");
		try {
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			try {
				while((line = bufReader.readLine()) != null) {
					int passID = line.indexOf(ID);
					int passPW = line.indexOf(PW);
					if(passID != -1 && passPW != -1) {
						log.info(ID + "관리자님께서 관리시스템에 접근 하셨습니다.(접근기록 저장)");
						System.out.println();
						System.out.println("접근 권한 허용되셨습니다. 관리자 페이지로 이동합니다!");
						pass = 1;}	}
				if(pass == 0) {
					System.out.println("관리자 접근 실패입니다. 해당 서비스는 정직원만 이용가능합니다.");
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

