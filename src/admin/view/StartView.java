package admin.view;

import controller.ProductController;

public class StartView {

	public static void main(String[] args) {
		System.out.println("1. ��� ��ǰ ���� �˻�");
		ProductController.reqProcess(1);
		
		System.out.println("\n2. ���� �� �˻�");
		ProductController.reqProcess(5);
		ProductController.reqProcess(1);
		
		System.out.println("\n3. ���� �� �˻�");
		ProductController.reqProcess(3);
		ProductController.reqProcess(1);
		
		System.out.println("\n4. ���� �� �˻�");
		ProductController.reqProcess(4);
		ProductController.reqProcess(1);
		
		System.out.println("\n5. �ϳ��� ��ǰ ���� �˻�");
		ProductController.reqProcess(2);
	}
}
