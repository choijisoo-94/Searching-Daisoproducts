package controller;

import java.util.Scanner;

import admin.view.Admin_EndView;
import customer.view.EndView;
import lombok.extern.slf4j.Slf4j;
import model.domain.Product;

@Slf4j
public class AdminController {
	
	public static void adminreqProcess(int reqNo) {
	
	String productname = "";	
	String productlocation = "";
	String productLocation = "";
	int productamount = 0;
	int productprice = 0;
	AdminController controller = new AdminController();

	if(reqNo==1)
	{
		// *** 01. 모든 상품 검색 ***
		System.out.println("모든 상품 정보 검색");
		ProductController.getProductList();
		Admin_EndView.adminServiceView();
	}else if(reqNo==2)
	{
		// *** 02. 특정 상품 검색 ***
		System.out.println("원하시는 상품명을 입력해주시면 해당 상품의 재고 위치와 가격을 알려드립니다. ^^ " + "\n\r");
		System.out.println("\n2. 하나의 상품 위치 및 가격 정보 검색 ");
		Scanner product = new Scanner(System.in);
		productname = product.nextLine();
		ProductController.getProduct(productname);
		Admin_EndView.adminServiceView();
	}else if(reqNo==3)
	{
		// *** 03. 새로운 상품 등록 ***
		System.out.println("새로운 상품명을 등록");
		EndView.messageView("새로운 상품 등록을 위해 [상품명]과 [재고량],[재고 위치],[가격]을 입력하세요.");
		Scanner product = new Scanner(System.in);
		productname = product.nextLine();
		Scanner amount = new Scanner(System.in);
		productamount = amount.nextInt();
		Scanner location = new Scanner(System.in);
		productlocation = location.nextLine();
		Scanner price = new Scanner(System.in);
		productprice = price.nextInt();
		Product newProduct = new Product(productname, productamount, productlocation, productprice);
		ProductController.insertProductList(newProduct);
		Admin_EndView.adminServiceView();
	}else if(reqNo==4)
	{
		// *** 04. 재고 수정 ***
		System.out.println("\n4. 저장한 상품의 재고 업데이트");
		EndView.messageView("상품 재고 수정을 위해 [상품명]과 [수정할 상품 재고량]를 입력하세요.");
		Scanner product = new Scanner(System.in);
		productname = product.nextLine();
		Scanner amount = new Scanner(System.in);
		productamount = amount.nextInt();
		ProductController.updateProduct(productname,productamount);
		Admin_EndView.adminServiceView();
	}else if(reqNo==5)
	{
		// *** 05. 위치 수정 ***
		System.out.println("\n5. 상품의 위치 정보 수정 시도");
		EndView.messageView("상품 위치정보 수정을 위해 [상품명]과 [수정할 상품 재고위치]를 입력하세요.");
		Scanner product = new Scanner(System.in);
		productname = product.nextLine();
		Scanner productlocation1 = new Scanner(System.in);
		productLocation = productlocation1.nextLine();
		ProductController.updateProduct2(productname, productLocation);
		Admin_EndView.adminServiceView();
	}else if(reqNo==6)
	{
		// *** 06. 특정 상품 삭제 ***
		System.out.println("\n6. 특정 상품명 입력 후 삭제");
		EndView.messageView("상품 정보 삭제를 위해 [상품명]을 입력하세요.");
		Scanner product = new Scanner(System.in);
		productname = product.nextLine();
		ProductController.deletePruduct(productname);
		Admin_EndView.adminServiceView();
	}else if(reqNo==7)
	{	// *** 07. 로그아웃***
		EndView.messageView("로그아웃 되셨습니다. 남부터미널점 다이소를 이용해주셔서 감사합니다!^^");
		log.info("관리자님께서 로그아웃을 하셨습니다.(로그아웃기록 저장)");
		EndView.serviceView();
		}
	}
}
