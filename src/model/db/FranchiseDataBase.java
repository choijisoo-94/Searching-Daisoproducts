package model.db;

import java.util.ArrayList;

import model.domain.Franchise;

public class FranchiseDataBase {

	private static ArrayList<Franchise> total = new ArrayList<>();
	
	static {
		total.add(new Franchise("ȫ����", "02-789-3423", "����� �Ŀ�ġ", 3, "A1 - 1", 5000));
		total.add(new Franchise("�Ǵ���", "02-768-3564", "�鵵��", 2,"A1 - 2", 3000));
		total.add(new Franchise("������", "02-725-3364", "������̱�", 1,"A2 - 1", 50000));
		total.add(new Franchise("���������", "02-723-3757", "����� �Ŀ�ġ", 4, "A2 - 2", 5000));
		total.add(new Franchise("��������","02-736-3473",  "����̹�", 5, "A2 - 3", 20000));
		total.add(new Franchise("������������", "02-7124-3757", "����̹�", 3, "A3 - 1", 20000));
		total.add(new Franchise("�ų�������", "02-767-3768", "���ô�", 2,"A3 - 3", 100000));
		total.add(new Franchise("�Ż翪��", "02-712-3253", "���ô�", 5,"B1 - 1", 100000));
		total.add(new Franchise("�����͹̳���", "02-763-3895", "����", 4, "B1 - 2", 2000));
		total.add(new Franchise("���뿪��", "02-773-3478", "������̱�", 2, "B1 - 3", 50000));
		total.add(new Franchise("��������", "02-795-3374", "����", 1,"B1 - 4", 2000));
		total.add(new Franchise("�Ե���Ʈ������", "02-752-3783", "������̱�", 3,"B2 - 1", 50000));
		total.add(new Franchise("����2ȣ��", "02-784-3893", "����", 5,"B2 - 2", 2000));
		total.add(new Franchise("������", "02-789-3273", "������̱�", 3, "C1 - 1", 50000));
		total.add(new Franchise("��迪��", "02-753-3635", "����� �Ŀ�ġ", 4, "C1 - 2", 5000));
		total.add(new Franchise("�ź�����", "02-743-3834", "�鵵��", 3, "C1 - 3", 3000));
		total.add(new Franchise("ȸ�⿪��", "02-773-3899", "�鵵��", 2, "C2 - 1", 3000));
		total.add(new Franchise("û��������", "02-767-3316", "����� �Ŀ�ġ", 1, "C2 - 2", 5000));
	}
	public static ArrayList<Franchise> getFranchises(){
		return total;
	}
}
