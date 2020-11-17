package admin.view;

import controller.ProductController;
import model.domain.Product;

public class StartView {

	public static void main(String[] args) {
		
		System.out.println("1. 모든 상품 정보 검색");
		ProductController.getProductList();
		
		System.out.println("\n2. 특정 상품 정보 검색");
		ProductController.getProduct("바인더");
		
		System.out.println("\n3. 존재하지 않는 상품 정보 검색");
		ProductController.getProduct("귤");
		
		System.out.println("\n4. 새로운 상품명을 새로 생성");
		Product newProduct = new Product("6공 다이어리", 3, "B1 - 3", 3000);
		ProductController.insertProductList(newProduct);
		
		System.out.println("\n5. 존재하는 항목 재저장");
		Product newProduct2 = new Product("C-TYPE 충전기", 35, "B2 - 1", 4000);
		ProductController.insertProductList(newProduct2);
		
		System.out.println("\n6. 새로운 상품 생성한 것을 검색");
		ProductController.getProduct("6공 다이어리");
		
		System.out.println("\n7. 저장 후 모든 상품 검색");
		ProductController.getProductList();
		
		System.out.println("\n8. 저장한 상품의 재고 업데이트");
		ProductController.updateProduct("6공 다이어리", 6);
		ProductController.updateProduct("마대자루", 0);
	
		System.out.println("\n9. 재고 수량 개선한 상품 검색");
		ProductController.getProduct("6공 다이어리");
		
		System.out.println("\n10. 상품의 위치 정보 수정 시도");
		ProductController.updateProduct2("일회용 마스크", "A1 - 3");
		ProductController.updateProduct2("C-TYPE 충전기", null);
		
		System.out.println("\n11. 상품의 위치 정보 수정 후 검색");
		ProductController.getProduct("일회용 마스크");
		ProductController.getProduct("C-TYPE 충전기");
		
		
		System.out.println("\n12. 삭제하고자 하는 항목  잘못 검색");
		ProductController.deletePruduct("샴푸---");
		
		System.out.println("\n13. 삭제하고자 하는 항목  제대로 검색");
		ProductController.deletePruduct("샴푸");
		
		System.out.println("\n14. 상품 삭제");
		ProductController.getProductList();
	}
}
