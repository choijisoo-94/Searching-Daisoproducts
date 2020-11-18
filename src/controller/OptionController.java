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
			//*** 01. 모든 상품 검색 ***
			System.out.println("모든 상품 정보 검색");
			controller.getProductList();
			EndView.serviceView();
		}else if(reqNo == 2) {
			//*** 02. '왕꿈틀이'라는 이름의 물품 검색 ***
			System.out.println("원하시는 상품명을 입력해주시면 해당 상품의 재고 위치와 가격을 알려드립니다. ^^ " + "\n\r");
			System.out.println("\n2. 하나의 상품 위치 및 가격 정보 검색 ");
			Scanner product = new Scanner(System.in);
			daisoproduct=product.nextLine();
			controller.getProductMessage(ProductModel.getProduct(daisoproduct),daisoproduct);
			log.info("고객님께서 " + daisoproduct +"을 검색하셨습니다.(검색기록 저장)");
			EndView.serviceView();
		}else if(reqNo == 3) {
			//*** 01. 모든 가맹점 검색 ***
			System.out.println("모든 가맹점 검색");
			fcontroller.getFranchiseList();
			EndView.serviceView();
		}else if(reqNo == 4) {
			//1. 관리자인지 고객인지 검증도 해줘야함
			//2. 다이소 채팅봇 서비스 (admin)
			EndView.messageView("관리자이신가요? 고객님이신가요? 관리자이시면 다시 로그인해주세요.^^");
			if(AdminLogin.loginDaiso()) {
				EndView.messageView("관리자 채널 입니다. 상품을 관리하실 수 있어요");
				Admin_EndView.adminServiceView();
			}else {
				view.FailView.failMessageView("접근 허용 불허 -관리자만 이용하실수 있습니다!");
				EndView.serviceView();
			}
		}else if(reqNo == 5) {
			EndView.messageView("로그아웃 되셨습니다. 남부터미널점 다이소를 이용해주셔서 감사합니다!^^");
			log.info("고객님께서 로그아웃을 하셨습니다.(로그아웃기록 저장)");
		}
	}
}
