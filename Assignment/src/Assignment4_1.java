import java.util.Scanner;
//�Է��� ���� Ȧ������ ¦������ �Ǻ��ϴ� ���α׷� �ۼ��ϱ�.
public class Assignment4_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int number = scanner.nextInt();
		
		if (number%2 == 0) {
			System.out.println(number + "�� ¦���Դϴ�.");
		}else {
			System.out.println(number + "�� Ȧ���Դϴ�.");
		}
		scanner.close();

	}

}
