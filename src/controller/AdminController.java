package controller;

import java.util.Scanner;

import customer.view.EndView;
import lombok.extern.slf4j.Slf4j;
import model.domain.Product;

@Slf4j
public class AdminController {
	
	public static void adminreqProcess(int reqNo) {
	
	String productname = "";	
	AdminController controller = new AdminController();

	if(reqNo==1)
	{
		// *** 01. 모든 상품 검색 ***
		System.out.println("모든 상품 정보 검색");
		ProductController.getProductList();
		EndView.serviceView();
	}else if(reqNo==2)
	{
		// *** 02. 특정 상품 검색 ***
		System.out.println("원하시는 상품명을 입력해주시면 해당 상품의 재고 위치와 가격을 알려드립니다. ^^ " + "\n\r");
		System.out.println("\n2. 하나의 상품 위치 및 가격 정보 검색 ");
		Scanner product = new Scanner(System.in);
		productname = product.nextLine();
		ProductController.getProduct(productname);
		EndView.serviceView();
	}else if(reqNo==3)
	{
		// *** 03. 새로운 상품 등록 ***
		System.out.println("새로운 상품명을 등록");
		Product newProduct = new Product("6공 다이어리", 3, "B1 - 3", 3000);
		ProductController.insertProductList(newProduct);
		EndView.serviceView();
	}else if(reqNo==4)
	{
		// *** 04. 재고 수정 ***
		System.out.println("\n4. 저장한 상품의 재고 업데이트");
		Product newProduct2 = new Product("C-TYPE 충전기", 35, "B2 - 1", 4000);
		ProductController.updateProduct("6공 다이어리", 6);
		ProductController.updateProduct("마대자루", 0);
		EndView.serviceView();
	}else if(reqNo==5)
	{
		// *** 05. 위치 수정 ***
		System.out.println("\n5. 상품의 위치 정보 수정 시도");
		ProductController.updateProduct2("일회용 마스크", "A1 - 3");
		ProductController.updateProduct2("C-TYPE 충전기", "B3 - 2");
		EndView.serviceView();
	}else if(reqNo==6)
	{
		// *** 06. 특정 상품 삭제 ***
		System.out.println("\n6. 특정 상품명 입력 후 삭제");
		Scanner product = new Scanner(System.in);
		productname = product.nextLine();
		ProductController.deletePruduct(productname);
		EndView.serviceView();
	}else if(reqNo==7)
	{	// *** 07. 로그아웃***
		EndView.messageView("로그아웃 되셨습니다. 남부터미널점 다이소를 이용해주셔서 감사합니다!^^");
		log.info("직원님께서 로그아웃을 하셨습니다.(로그아웃기록 저장)");
		}
	}
}
