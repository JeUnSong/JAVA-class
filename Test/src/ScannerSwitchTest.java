import java.util.Scanner;

public class ScannerSwitchTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		System.out.print("������ �Է��ϼ���(0~100): ");
		int score = scanner.nextInt();
		switch (score/10) {
			case 10: //scoer = 100
			case 9: //scoer = 90~99
				grade='A';
				break;
			case 8: //scoer = 80~89
				grade='B';
				break;
			case 7: //scoer = 70~79
				grade='C';
				break;
			case 6: //scoer = 60~69
				grade='D';
				break;
			default: //scoer = 59 ����
				grade='F';
		}
		System.out.println("������ " + grade + "�Դϴ�.");

		scanner.close();

	}

}
