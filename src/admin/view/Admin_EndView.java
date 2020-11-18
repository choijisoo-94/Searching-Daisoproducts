
package admin.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import controller.AdminController;
import model.domain.Product;

public class Admin_EndView {
		static AdminController controller = new AdminController();
	
		public static void adminServiceView() {
				System.out.println("\n 어떤 서비스를 원하시나요? 원하시는 서비스 번호를 입력해주세요^^");
				System.out.println("1. 모든 상품 정보 검색");
				System.out.println("2. 하나의 상품 위치 및 가격 정보 검색");
				System.out.println("3. 새로운 상품 등록");
				System.out.println("4. 상품 재고 수정");
				System.out.println("5. 상품 위치 수정");
				System.out.println("6. 상품 삭제");
				System.out.println("7. 로그아웃");
				// 모든 검색, 특정 검색 , 새로운 상품 등록,재고 수정,위치 수정, 상품 삭제 , 로그아웃
				System.out.print("번호 입력 : ");
				Scanner option = new Scanner(System.in);
			
			try {
				int optionNumber = option.nextInt();
				controller.adminreqProcess(optionNumber);
			}catch(InputMismatchException e){
				 System.out.println("원하시는 서비스 번호를 재입력해주세요^^");
				 System.out.println("1. 모든 상품 정보 검색");
				 System.out.println("2. 특정 상품 위치 및 가격 정보 검색");
				 System.out.println("3. 새로운 상품 등록");
				 System.out.println("4. 상품 재고 수정");
				 System.out.println("5. 상품 위치 수정");
				 System.out.println("6. 상품 삭제");
				 System.out.println("7. 로그아웃");
				 option = new Scanner(System.in);
				 int optionNumber = option.nextInt();
		         controller.adminreqProcess(optionNumber);
			}		
		}
	
		// 예외가 아닌 단순 메세지 출력
		public static void messageView(String message) {
			System.out.println(message);
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