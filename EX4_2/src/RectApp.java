import java.util.Scanner;

public class RectApp {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); //��ü ����
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		System.out.println("������� ������ " + rect.getArea());
		scanner.close();

	}

}
