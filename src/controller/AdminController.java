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
		// *** 01. ��� ��ǰ �˻� ***
		System.out.println("��� ��ǰ ���� �˻�");
		ProductController.getProductList();
		Admin_EndView.adminServiceView();
	}else if(reqNo==2)
	{
		// *** 02. Ư�� ��ǰ �˻� ***
		System.out.println("���Ͻô� ��ǰ���� �Է����ֽø� �ش� ��ǰ�� ��� ��ġ�� ������ �˷��帳�ϴ�. ^^ " + "\n\r");
		System.out.println("\n2. �ϳ��� ��ǰ ��ġ �� ���� ���� �˻� ");
		Scanner product = new Scanner(System.in);
		productname = product.nextLine();
		ProductController.getProduct(productname);
		Admin_EndView.adminServiceView();
	}else if(reqNo==3)
	{
		// *** 03. ���ο� ��ǰ ��� ***
		System.out.println("���ο� ��ǰ���� ���");
		EndView.messageView("���ο� ��ǰ ����� ���� [��ǰ��]�� [���],[��� ��ġ],[����]�� �Է��ϼ���.");
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
		// *** 04. ��� ���� ***
		System.out.println("\n4. ������ ��ǰ�� ��� ������Ʈ");
		EndView.messageView("��ǰ ��� ������ ���� [��ǰ��]�� [������ ��ǰ ���]�� �Է��ϼ���.");
		Scanner product = new Scanner(System.in);
		productname = product.nextLine();
		Scanner amount = new Scanner(System.in);
		productamount = amount.nextInt();
		ProductController.updateProduct(productname,productamount);
		Admin_EndView.adminServiceView();
	}else if(reqNo==5)
	{
		// *** 05. ��ġ ���� ***
		System.out.println("\n5. ��ǰ�� ��ġ ���� ���� �õ�");
		EndView.messageView("��ǰ ��ġ���� ������ ���� [��ǰ��]�� [������ ��ǰ �����ġ]�� �Է��ϼ���.");
		Scanner product = new Scanner(System.in);
		productname = product.nextLine();
		Scanner productlocation1 = new Scanner(System.in);
		productLocation = productlocation1.nextLine();
		ProductController.updateProduct2(productname, productLocation);
		Admin_EndView.adminServiceView();
	}else if(reqNo==6)
	{
		// *** 06. Ư�� ��ǰ ���� ***
		System.out.println("\n6. Ư�� ��ǰ�� �Է� �� ����");
		EndView.messageView("��ǰ ���� ������ ���� [��ǰ��]�� �Է��ϼ���.");
		Scanner product = new Scanner(System.in);
		productname = product.nextLine();
		ProductController.deletePruduct(productname);
		Admin_EndView.adminServiceView();
	}else if(reqNo==7)
	{	// *** 07. �α׾ƿ�***
		EndView.messageView("�α׾ƿ� �Ǽ̽��ϴ�. �����͹̳��� ���̼Ҹ� �̿����ּż� �����մϴ�!^^");
		log.info("�����ڴԲ��� �α׾ƿ��� �ϼ̽��ϴ�.(�α׾ƿ���� ����)");
		EndView.serviceView();
		}
	}
}
