package admin.view;

import controller.ProductController;
import model.domain.Product;

public class StartView {

	public static void main(String[] args) {
		
		System.out.println("1. ��� ��ǰ ���� �˻�");
		ProductController.getProductList();
		
		System.out.println("\n2. Ư�� ��ǰ ���� �˻�");
		ProductController.getProduct("���δ�");
		
		System.out.println("\n3. �������� �ʴ� ��ǰ ���� �˻�");
		ProductController.getProduct("��");
		
		System.out.println("\n4. ���ο� ��ǰ���� ���� ����");
		Product newProduct = new Product("6�� ���̾", 3, "B1 - 3", 3000);
		ProductController.insertProductList(newProduct);
		
		System.out.println("\n5. �����ϴ� �׸� ������");
		Product newProduct2 = new Product("C-TYPE ������", 35, "B2 - 1", 4000);
		ProductController.insertProductList(newProduct2);
		
		System.out.println("\n6. ���ο� ��ǰ ������ ���� �˻�");
		ProductController.getProduct("6�� ���̾");
		
		System.out.println("\n7. ���� �� ��� ��ǰ �˻�");
		ProductController.getProductList();
		
		System.out.println("\n8. ������ ��ǰ�� ��� ������Ʈ");
		ProductController.updateProduct("6�� ���̾", 6);
		ProductController.updateProduct("�����ڷ�", 0);
	
		System.out.println("\n9. ��� ���� ������ ��ǰ �˻�");
		ProductController.getProduct("6�� ���̾");
		
		System.out.println("\n10. ��ǰ�� ��ġ ���� ���� �õ�");
		ProductController.updateProduct2("��ȸ�� ����ũ", "A1 - 3");
		ProductController.updateProduct2("C-TYPE ������", null);
		
		System.out.println("\n11. ��ǰ�� ��ġ ���� ���� �� �˻�");
		ProductController.getProduct("��ȸ�� ����ũ");
		ProductController.getProduct("C-TYPE ������");
		
		
		System.out.println("\n12. �����ϰ��� �ϴ� �׸�  �߸� �˻�");
		ProductController.deletePruduct("��Ǫ---");
		
		System.out.println("\n13. �����ϰ��� �ϴ� �׸�  ����� �˻�");
		ProductController.deletePruduct("��Ǫ");
		
		System.out.println("\n14. ��ǰ ����");
		ProductController.getProductList();
	}
}
