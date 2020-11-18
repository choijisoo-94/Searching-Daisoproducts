
package customer.view;

import java.io.IOException;
import java.util.Scanner;

import controller.OptionController;
import model.ProductModel;
import model.auth.MemberLogin;

public class StartView {
	
	public static void main(String[] args) {
		
		// 다이소 고객 로그인
		MemberLogin.loginDaiso();
	
		
		// 다이소 서비스
		EndView.serviceView();
		
		

		
		
		
	}
}

