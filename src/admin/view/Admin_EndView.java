
package admin.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import controller.AdminController;
import model.domain.Product;

public class Admin_EndView {
		static AdminController controller = new AdminController();
	
		public static void adminServiceView() {
				System.out.println("\n � ���񽺸� ���Ͻó���? ���Ͻô� ���� ��ȣ�� �Է����ּ���^^");
				System.out.println("1. ��� ��ǰ ���� �˻�");
				System.out.println("2. �ϳ��� ��ǰ ��ġ �� ���� ���� �˻�");
				System.out.println("3. ���ο� ��ǰ ���");
				System.out.println("4. ��ǰ ��� ����");
				System.out.println("5. ��ǰ ��ġ ����");
				System.out.println("6. ��ǰ ����");
				System.out.println("7. �α׾ƿ�");
				// ��� �˻�, Ư�� �˻� , ���ο� ��ǰ ���,��� ����,��ġ ����, ��ǰ ���� , �α׾ƿ�
				System.out.print("��ȣ �Է� : ");
				Scanner option = new Scanner(System.in);
			
			try {
				int optionNumber = option.nextInt();
				controller.adminreqProcess(optionNumber);
			}catch(InputMismatchException e){
				 System.out.println("���Ͻô� ���� ��ȣ�� ���Է����ּ���^^");
				 System.out.println("1. ��� ��ǰ ���� �˻�");
				 System.out.println("2. Ư�� ��ǰ ��ġ �� ���� ���� �˻�");
				 System.out.println("3. ���ο� ��ǰ ���");
				 System.out.println("4. ��ǰ ��� ����");
				 System.out.println("5. ��ǰ ��ġ ����");
				 System.out.println("6. ��ǰ ����");
				 System.out.println("7. �α׾ƿ�");
				 option = new Scanner(System.in);
				 int optionNumber = option.nextInt();
		         controller.adminreqProcess(optionNumber);
			}		
		}
	
		// ���ܰ� �ƴ� �ܼ� �޼��� ���
		public static void messageView(String message) {
			System.out.println(message);
		}
	
		public static void invalidateReq(String message) {
			System.out.println("�߻��� ���� : " + message);
		}
		public static void validateReq(String message) {
			System.out.println("���� ���� : " + message);
		}
		public static void viewProd(Product prod) {
			System.out.println("�˻��� ��ǰ ���� : " + prod);
		}
		public static void viewProdAll(ArrayList<Product> all) {
			System.out.println("��� ��ǰ ����");
			for(Product p : all) {
				System.out.println(p);
			}
		}
}