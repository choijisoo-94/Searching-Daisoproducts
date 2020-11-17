package customer.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import controller.OptionController;
import model.ProductModel;
import model.domain.Product;

public class EndView {
	
	static OptionController controller = new OptionController();
	
	// 특정 상품 출력
		public static void productView(Product product) {
			if (product != null) {
				System.out.println(product);
			} else {
				System.out.println("검색하는 상품이 존재하지 않습니다.");
			}
		}
		
		// 모든 상품 출력
		public static void projectListView(ArrayList<Product> allProducts) {
			for (Product product : allProducts) {
				System.out.println("[상품명] : " + product.getName());
			}
		}

		// 예외가 아닌 단순 메세지 출력
		public static void messageView(String message) {
			System.out.println(message);
		}
		
		// 예외가 아닌 단순 메세지 출력
		public static void serviceView() {
			System.out.println("\n 어떤 서비스를 원하시나요? 원하시는 서비스 번호를 입력해주세요^^");
			System.out.println("1. 모든 상품 정보 검색");
			System.out.println("2. 하나의 상품 위치 및 가격 정보 검색");
			
			System.out.print("번호 입력 : ");
			Scanner option = new Scanner(System.in);
			
			try {
				int optionNumber = option.nextInt();
				controller.reqProcess(optionNumber);
			}catch(InputMismatchException e){
				 System.out.println("원하시는 서비스 번호를 재입력해주세요^^");
				 System.out.println("1. 모든 상품 정보 검색");
				 System.out.println("2. 하나의 상품 위치 및 가격 정보 검색");
				 option = new Scanner(System.in);
				 int optionNumber = option.nextInt();
		         controller.reqProcess(optionNumber);
			}		
		}

		 

		public static void invalidateReq(String message) {
			System.out.println("발생된 문제 : " + message);
		}
		public static void validateReq(String message) {
			System.out.println("정상 실행 : " + message);
		}
		public static void viewProd(Product prod) {
			System.out.println("검색된 상품 정보 : " + prod);
		}
		public static void viewProdAll(ArrayList<Product> all) {
			System.out.println("모든 상품 정보");
			for(Product p : all) {
				System.out.println(p);
			}
		}
}