package model.db;

import java.util.ArrayList;
import model.domain.Product;

public class VirtualDataBase {
	
	private static ArrayList<Product> all = new ArrayList<>();
		
		static {
			all.add(new Product("����", 5, "A1 - 1", 5000));
			all.add(new Product("��ȸ�� ����ũ", 3, "A1 - 2", 3000));
			all.add(new Product("��Ǫ", 15, "A2 - 1", 2000));
			all.add(new Product("�ֹ漼��", 8, "A2 - 2", 2000));
			all.add(new Product("�����ڷ�", 2, "A2 - 3", 5000));
			all.add(new Product("���ƿ� ��!", 20, "A3 - 1", 1000));
			all.add(new Product("�ղ�Ʋ��", 15, "A3 - 2", 1000));
			all.add(new Product("��ī�� ����Ʈ", 25, "A3 - 3", 2500));
			all.add(new Product("����", 2, "B1 - 1", 5000));
			all.add(new Product("signo ��ũ�� ����", 10, "B1 - 2", 3000));
			all.add(new Product("���δ�", 14, "B1 - 3", 2000));
			all.add(new Product("ǳ��", 7, "B1 - 4", 2000));
			all.add(new Product("C-TYPE ������", 35, "B2 - 1", 5000));
			all.add(new Product("�̾���", 25, "B2 - 2", 5000));
			all.add(new Product("��Ű���콺 �縻", 13, "C1 - 1", 1000));
			all.add(new Product("�� ������ ���ڹ�", 2, "C1 - 2", 3000));
			all.add(new Product("�޸� �� ���", 6, "C1 - 3", 5000));
			all.add(new Product("�Ŀ�̼�", 5, "C2 - 1", 4000));
			all.add(new Product("�Ӹ���", 40, "C2 - 2", 2000));
		}
		public static ArrayList<Product> getProducts(){
			return all;
		}
	
}
