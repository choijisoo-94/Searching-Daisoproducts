package model.auth;

import java.util.ArrayList;
import java.util.logging.Logger;

public class AdminAuth {
	
	boolean admin = true;
	static Logger logger = Logger.getLogger("log4jtest.MemberLogintest");
	
	//admin아이디와 비밀번호 입력
	
	//점장,정직원,기간제 직원, 인턴, 아르바이트이면 기능 관리 가능
	
	//
	
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
	
	
	public static void adminValidation() {
		
	}
}
