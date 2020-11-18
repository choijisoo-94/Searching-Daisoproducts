package controller;

import java.util.Scanner;

import customer.view.EndView;
import lombok.extern.slf4j.Slf4j;
import model.ProductModel;

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
		}
	}
}
