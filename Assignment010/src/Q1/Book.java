package Q1;
//1. å����, ����, ���ǻ�, ������ 
//Ű���� �Է��� ���ؼ� ArrayList�� �����Ͻÿ�.

import java.util.*;

public class Book {

	public static void main(String[] args) {
		var book = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("å ������ �Է��ϼ���. >> ");
			String name = scanner.nextLine();
			
			System.out.println("���ڸ� �Է��ϼ���. >> ");
			String author = scanner.nextLine();
			
			System.out.println("���ǻ縦 �Է��ϼ���. >> ");
			String publisher = scanner.nextLine();
			
			System.out.println("������ �Է��ϼ���. >> ");
			String price = scanner.nextLine();
			System.out.print("�Է��� �������� exit�� �Է��ϼ���.");
			//if(price.equals("exit")) {
			//	break;
				
				
				name = name.concat(author);
				name = name.concat(publisher);
				name = name.concat(price);
				book.add(name);
				System.out.println(book);
		}		
	}	
}
	
