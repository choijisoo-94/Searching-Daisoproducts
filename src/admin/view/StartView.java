package admin.view;

import controller.ProductController;

public class StartView {

	public static void main(String[] args) {
		System.out.println("1. 모든 상품 정보 검색");
		ProductController.reqProcess(1);
		
		System.out.println("\n2. 저장 후 검색");
		ProductController.reqProcess(5);
		ProductController.reqProcess(1);
		
		System.out.println("\n3. 수정 후 검색");
		ProductController.reqProcess(3);
		ProductController.reqProcess(1);
		
		System.out.println("\n4. 삭제 후 검색");
		ProductController.reqProcess(4);
		ProductController.reqProcess(1);
		
		System.out.println("\n5. 하나의 상품 정보 검색");
		ProductController.reqProcess(2);
	}
}
