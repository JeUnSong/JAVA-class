import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		String name = scanner.next();
		System.out.println("�̸��� " + name + "�Դϴ�.");
		
		System.out.print("����: ");
		String city = scanner.next();
		System.out.println("���ô� " + city + "�Դϴ�.");
		
		System.out.print("����: ");
		int age = scanner.nextInt();
		System.out.println("���̴� " + age + "�� �Դϴ�. ");
		
		System.out.print("ü��: ");
		double weight = scanner.nextDouble();
		System.out.println("ü���� " + weight + "kg �Դϴ�. ");
		
		System.out.print("���� ����: ");
		boolean single = scanner.nextBoolean();
		System.out.println("���� ���δ�" + single + " �Դϴ�.");
		
		scanner.close();
	}

}
