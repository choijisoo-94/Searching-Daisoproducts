package model.auth;

import java.util.ArrayList;
import java.util.logging.Logger;

import model.domain.Product;

public class MemberDTO {
	static Logger logger = Logger.getLogger("log4jtest.MemberLogintest");
	
		public static void MemberLoginsystem () {
//			System.out.println("다이소 페이지 로그인");
			ArrayList<String> ID = new ArrayList<>(); 
			ArrayList<String> PW = new ArrayList<>();
			ArrayList<String> Grade = new ArrayList<>();

			ID.add("jwjw"); 
			ID.add("jsjs");
			ID.add("hkhk"); 
			ID.add("pdpd");
			ID.add("daiso1004");
			
			PW.add("jw1234");
			PW.add("js1234");
			PW.add("hk1234");
			PW.add("pd1234");
			PW.add("daiso1234");
			
			Grade.add("점장");
			Grade.add("정직원");
			Grade.add("기간제 직원");
			Grade.add("인턴");
			Grade.add("아르바이트");
			
			for (int i = 0; i< ID.size(); i++) {
				System.out.println( ID.get(i)+ "이면 " + PW.get(i)+ "이고 " + Grade.get(i)+ "입니다.");
			}
		}
		
	public static void Employeelogin(ArrayList<String> ID) { 
		if(ID.get(0).equals("jwjw")) {
			logger.info("직원아이디 : " +ID.get(0)+"님 입장하셨습니다.");
		}else if(ID.get(0).equals("jsjs")){
			logger.info("직원아이디 : " +ID.get(1)+"님 입장하셨습니다.");
		}else if(ID.get(0).equals("hkhk")) {
			logger.info("직원아이디 : " +ID.get(2)+"님 입장하셨습니다.");
		}else if(ID.get(0).equals("pdpd")) {
			logger.info("직원아이디 : " +ID.get(3)+"님 입장하셨습니다.");
		}else if(ID.get(0).equals("daiso1004")) {
			logger.info("직원아이디 : " +ID.get(4)+"님 입장하셨습니다.");
		}
	}
}