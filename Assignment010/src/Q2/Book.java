package Q2;
import java.util.*;
public class Book {
	//2. 1���� HashMap�� �̿��ؼ� �����ϰ� ����Ͻÿ�.
	//key => å����, ����, ���ǻ�, ����
	public static void main(String[] args) {
		HashMap<String, String> book = new HashMap<String, String>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("å������ �Է��ϼ���");
		String name = scanner.nextLine();
		book.put(name, "å����");
		
		System.out.print("���ڸ� �Է��ϼ���");
		String author = scanner.nextLine();
		book.put(author, "����");
		
		System.out.print("���ǻ縦 �Է��ϼ���");
		String publisher = scanner.nextLine();
		book.put(publisher, "����");
		
		System.out.print("������ �Է��ϼ���");
		String price = scanner.nextLine();
		book.put(price, "����");
		
		Set<String> keys = book.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String n = it.next();
			String s =book.get(n);
			System.out.println(s + ":" + n);
		}
		

	}

}
