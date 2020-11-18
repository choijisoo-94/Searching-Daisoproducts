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
		// *** 01. ��� ��ǰ �˻� ***
		System.out.println("��� ��ǰ ���� �˻�");
		ProductController.getProductList();
		EndView.serviceView();
	}else if(reqNo==2)
	{
		// *** 02. Ư�� ��ǰ �˻� ***
		System.out.println("���Ͻô� ��ǰ���� �Է����ֽø� �ش� ��ǰ�� ��� ��ġ�� ������ �˷��帳�ϴ�. ^^ " + "\n\r");
		System.out.println("\n2. �ϳ��� ��ǰ ��ġ �� ���� ���� �˻� ");
		Scanner product = new Scanner(System.in);
		productname = product.nextLine();
		ProductController.getProduct(productname);
		EndView.serviceView();
	}else if(reqNo==3)
	{
		// *** 03. ���ο� ��ǰ ��� ***
		System.out.println("���ο� ��ǰ���� ���");
		Product newProduct = new Product("6�� ���̾", 3, "B1 - 3", 3000);
		ProductController.insertProductList(newProduct);
		EndView.serviceView();
	}else if(reqNo==4)
	{
		// *** 04. ��� ���� ***
		System.out.println("\n4. ������ ��ǰ�� ��� ������Ʈ");
		Product newProduct2 = new Product("C-TYPE ������", 35, "B2 - 1", 4000);
		ProductController.updateProduct("6�� ���̾", 6);
		ProductController.updateProduct("�����ڷ�", 0);
		EndView.serviceView();
	}else if(reqNo==5)
	{
		// *** 05. ��ġ ���� ***
		System.out.println("\n5. ��ǰ�� ��ġ ���� ���� �õ�");
		ProductController.updateProduct2("��ȸ�� ����ũ", "A1 - 3");
		ProductController.updateProduct2("C-TYPE ������", "B3 - 2");
		EndView.serviceView();
	}else if(reqNo==6)
	{
		// *** 06. Ư�� ��ǰ ���� ***
		System.out.println("\n6. Ư�� ��ǰ�� �Է� �� ����");
		Scanner product = new Scanner(System.in);
		productname = product.nextLine();
		ProductController.deletePruduct(productname);
		EndView.serviceView();
	}else if(reqNo==7)
	{	// *** 07. �α׾ƿ�***
		EndView.messageView("�α׾ƿ� �Ǽ̽��ϴ�. �����͹̳��� ���̼Ҹ� �̿����ּż� �����մϴ�!^^");
		log.info("�����Բ��� �α׾ƿ��� �ϼ̽��ϴ�.(�α׾ƿ���� ����)");
		}
	}
}
