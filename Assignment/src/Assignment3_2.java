import java.util.Scanner;

public class Assignment3_2 {
//�̸�, �й�, �а��� Ű���� �Է��� �޾Ƽ� ����ϱ�.
	public static void main(String[] args) {
		System.out.print("�̸�, �й�, �а��� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print("�̸��� " + name + ", ");
		
		int studentid = scanner.nextInt();
		System.out.print("�й��� " + studentid + ", ");
		
		String department = scanner.next();
		System.out.print("�а��� " + department + " �Դϴ�.");
		
		scanner.close();

	}

}
