package step10_report;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ProductSave {

	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Playdata\\Desktop\\ProductDB.txt");
		try {
			FileWriter filewritter = new FileWriter(file, true);
			if(file.isFile() && file.canWrite()) {
				System.out.println("��ǰ�� �̸��� ��ġ�� �Է��ϼ���.");
				System.out.print("��ǰ �̸� : ");
				filewritter.append(scan.nextLine());
				filewritter.append("\t");
				System.out.println("��ġ : ");
				filewritter.append(scan.nextLine());
				filewritter.append("\r");
				System.out.println("��ǰ�� ��ϵǾ����ϴ�.");
			}
			filewritter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}

