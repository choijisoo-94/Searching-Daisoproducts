package model.auth;

import java.util.ArrayList;
import java.util.logging.Logger;

import model.domain.Product;

public class MemberDTO {
	static Logger logger = Logger.getLogger("log4jtest.MemberLogintest");
	
		public static void MemberLoginsystem () {
//			System.out.println("���̼� ������ �α���");
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
			
			Grade.add("����");
			Grade.add("������");
			Grade.add("�Ⱓ�� ����");
			Grade.add("����");
			Grade.add("�Ƹ�����Ʈ");
			
			for (int i = 0; i< ID.size(); i++) {
				System.out.println( ID.get(i)+ "�̸� " + PW.get(i)+ "�̰� " + Grade.get(i)+ "�Դϴ�.");
			}
		}
		
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
}