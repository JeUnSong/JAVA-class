import java.util.Scanner;

public class Assignment3_3 {
	
	public static double sum(double a, double b, double c) {
		return a + b + c;
	}

	public static void main(String[] args) {
//����,����,���� �������� Ű���� �Է��� �޾Ƽ� ��� ���ϱ�.
		System.out.println("�Ʒ� �� ������ ������ �־� �ּ���.");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����");
		double korean = scanner.nextDouble();
		
		System.out.print("����");
		double english = scanner.nextDouble();
		
		System.out.print("����");
		double mathematics = scanner.nextDouble();
		
		double average = sum(korean, english, mathematics)/3;
		
		System.out.print("���� ����� " +  average + " �Դϴ�.");
		
		scanner.close();
	}

}
