package model.auth;

import java.util.ArrayList;
import java.util.logging.Logger;

public class AdminAuth {
	
	boolean admin = true;
	static Logger logger = Logger.getLogger("log4jtest.MemberLogintest");
	
	//admin���̵�� ��й�ȣ �Է�
	
	//����,������,�Ⱓ�� ����, ����, �Ƹ�����Ʈ�̸� ��� ���� ����
	
	//
	
	public static void Employeelogin(ArrayList<String> ID) { 
		if(ID.get(0).equals("jwjw")) {
			logger.info("�������̵� : " +ID.get(0)+"�� �����ϼ̽��ϴ�.");
		}else if(ID.get(0).equals("jsjs")){
			logger.info("�������̵� : " +ID.get(1)+"�� �����ϼ̽��ϴ�.");
		}else if(ID.get(0).equals("hkhk")) {
			logger.info("�������̵� : " +ID.get(2)+"�� �����ϼ̽��ϴ�.");
		}else if(ID.get(0).equals("pdpd")) {
			logger.info("�������̵� : " +ID.get(3)+"�� �����ϼ̽��ϴ�.");
		}else if(ID.get(0).equals("daiso1004")) {
			logger.info("�������̵� : " +ID.get(4)+"�� �����ϼ̽��ϴ�.");
		}
	}
	
	
	public static void adminValidation() {
		
	}
}
