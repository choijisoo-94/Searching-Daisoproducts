package controller;

import java.util.Scanner;

import customer.view.EndView;
import model.ProductModel;

public class OptionController {
	
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
			controller.getProjectMessage(ProductModel.getProduct(daisoproduct));
			EndView.serviceView();
//		}else if(reqNo == 3) {
//			boolean result = pm.update("왕꿈틀이", 10, "A3-2");
//			if(result == true) {
//				EndView.validateReq("상품 재고 수정 완료");
//			}else {
//				EndView.validateReq("취급하지 않는 상품 수정 불가");
//			}
//		}else if(reqNo == 4) {
//			int result = pm.delete("왕꿈틀이");
//			if(result == 1) {
//				EndView.validateReq("상품 삭제 완료");
//			}else {
//				EndView.validateReq("삭제하려는 상품 정보가 없습니다.");
//			}
//		}else if (reqNo == 5) {
//			try {
//				pm.insert(new Product("Pocky", 16, "A3 - 1", 1500));
//				EndView.validateReq("상품 등록 완료");
//			}catch (Exception e) {
//				e.printStackTrace();
//				EndView.invalidateReq("이미 등록된 상품입니다. 다시 시도하세요.");
//			}
//		}else {
//			EndView.invalidateReq("요청에 부합되는 서비스가 없습니다.");
//		}
	}
	}
}
