package controller;

import java.util.Scanner;

import customer.view.EndView;
import admin.view.Admin_EndView;
import lombok.extern.slf4j.Slf4j;
import model.ProductModel;
import model.auth.AdminLogin;
import model.auth.MemberLogin;

@Slf4j
public class OptionController {
	
	static FranchiseController fcontroller = new FranchiseController();
	
	static String daisoproduct="";
	
	public static void reqProcess(int reqNo) {
		
		ProductController controller = new ProductController();
		
		if(reqNo == 1) {
			//*** 01. ��� ��ǰ �˻� ***
			System.out.println("��� ��ǰ ���� �˻�");
			controller.getProductList();
			EndView.serviceView();
		}else if(reqNo == 2) {
			//*** 02. '�ղ�Ʋ��'��� �̸��� ��ǰ �˻� ***
			System.out.println("���Ͻô� ��ǰ���� �Է����ֽø� �ش� ��ǰ�� ��� ��ġ�� ������ �˷��帳�ϴ�. ^^ " + "\n\r");
			System.out.println("\n2. �ϳ��� ��ǰ ��ġ �� ���� ���� �˻� ");
			Scanner product = new Scanner(System.in);
			daisoproduct=product.nextLine();
			controller.getProductMessage(ProductModel.getProduct(daisoproduct),daisoproduct);
			log.info("���Բ��� " + daisoproduct +"�� �˻��ϼ̽��ϴ�.(�˻���� ����)");
			EndView.serviceView();
		}else if(reqNo == 3) {
			//*** 01. ��� ������ �˻� ***
			System.out.println("��� ������ �˻�");
			fcontroller.getFranchiseList();
			EndView.serviceView();
		}else if(reqNo == 4) {
			//1. ���������� ������ ������ �������
			//2. ���̼� ä�ú� ���� (admin)
			EndView.messageView("�������̽Ű���? �����̽Ű���? �������̽ø� �ٽ� �α������ּ���.^^");
			if(AdminLogin.loginDaiso()) {
				EndView.messageView("������ ä�� �Դϴ�. ��ǰ�� �����Ͻ� �� �־��");
				Admin_EndView.adminServiceView();
			}else {
				view.FailView.failMessageView("���� ��� ���� -�����ڸ� �̿��ϽǼ� �ֽ��ϴ�!");
				EndView.serviceView();
			}
		}else if(reqNo == 5) {
			EndView.messageView("�α׾ƿ� �Ǽ̽��ϴ�. �����͹̳��� ���̼Ҹ� �̿����ּż� �����մϴ�!^^");
			log.info("���Բ��� �α׾ƿ��� �ϼ̽��ϴ�.(�α׾ƿ���� ����)");
		}
	}
}
