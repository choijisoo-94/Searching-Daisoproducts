package step10_report;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ProductFind {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int pass = 0;
		System.out.println("ã���÷��� ��ǰ���� �Է��ϼ���.");
		System.out.println("��ǰ�� : ");
		String Product = scan.nextLine();
		File file = new File("C:\\Users\\Playdata\\Desktop\\ProductDB.txt");
		try {
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			try {
				while((line = bufReader.readLine()) != null) {
					System.out.println(line.indexOf(Product));
					int passProduct = line.indexOf(Product);
					if(passProduct != -1) {
						System.out.print("��ǰã�� ����! ��� �ֽ��ϴ�.");
						pass = 1;}	}
				if(pass == 0) {
					System.out.println("��ǰã�� �����Դϴ�. ���� ��� ���ų� ��ǰ���� �߸��Ǿ����ϴ�.");}
				bufReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		}
	}
}


