package Q3;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		ArrayList<Book> data = new ArrayList<Book>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("å ������ �Է��ϼ���. >> ");
		String name = scanner.nextLine();
		
		System.out.println("���ڸ� �Է��ϼ���. >> ");
		String author = scanner.nextLine();
		
		System.out.println("���ǻ縦 �Է��ϼ���. >> ");
		String publisher = scanner.nextLine();
		
		System.out.println("������ �Է��ϼ���. >> ");
		String price = scanner.nextLine();
		
		System.out.println("���� : " + name );
		System.out.println("���� : " + author );
		System.out.println("���ǻ� : " + publisher );
		System.out.println("���� : " + price );
	}

}
