import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {
		char grabe;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���(0~100): ");
		int score = scanner.nextInt(); //���� �б�
		if(score >=90)                 //90 �̻�
			grabe = 'A';
		else if(score >=80)            //80�̻� 90�̸�
			grabe = 'B';
		else if(score >=70)            //70�̻� 80�̸�
			grabe = 'C';
		else if(score >=60)            //60�̻� 70�̸�
			grabe = 'D';
		else                           //60 �̸�
			grabe = 'F';
		System.out.println("������ "+ grabe + "�Դϴ�.");
		
		scanner.close();

	}

}
