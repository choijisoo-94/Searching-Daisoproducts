
package customer.view;

import java.io.IOException;
import java.util.Scanner;

import controller.OptionController;
import model.ProductModel;
import model.auth.MemberLogin;

public class StartView {
	
	public static void main(String[] args) {

		// 다이소 소개글
		EndView.messageView("환영합니다 고객님!^^ 남부터미널점 다이소 입니다!");
		
		// 다이소 고객 로그인
		if(MemberLogin.loginDaiso()==false) {
			EndView.messageView("고객님 회원가입과 로그인을 해주시면 다이소 채팅봇을 이용하실 수 있습니다.^^");
		}else {
			// 다이소 채팅봇 서비스 
			EndView.serviceView();
		}
	
		
		
		
		

		
		
		
	}
}

