
package customer.view;

import java.io.IOException;
import java.util.Scanner;

import controller.OptionController;
import model.ProductModel;
import model.auth.MemberLogin;

public class StartView {
	
	public static void main(String[] args) {

		// ���̼� �Ұ���
		EndView.messageView("ȯ���մϴ� ����!^^ �����͹̳��� ���̼� �Դϴ�!");
		
		// ���̼� �� �α���
		if(MemberLogin.loginDaiso()==false) {
			EndView.messageView("���� ȸ�����԰� �α����� ���ֽø� ���̼� ä�ú��� �̿��Ͻ� �� �ֽ��ϴ�.^^");
		}else {
			// ���̼� ä�ú� ���� 
			EndView.serviceView();
		}
	
		
		
		
		

		
		
		
	}
}

