
package customer.view;

import java.io.IOException;
import java.util.Scanner;

import controller.OptionController;
import model.ProductModel;
import model.auth.MemberLogin;

public class StartView {
	
	public static void main(String[] args) {
		
		// ���̼� �� �α���
		MemberLogin.loginDaiso();
	
		
		// ���̼� ����
		EndView.serviceView();
		
		

		
		
		
	}
}

