import java.util.Scanner;

public class Assignment3_1 {
//Ű����� ���� �������� �Է¹޾Ƽ� ���� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final double PI = 3.14;
		double radius = scanner.nextDouble();
		double circleArea = radius*radius*PI;
		
		System.out.println("���� ���� " + circleArea);
		
		scanner.close();
	}

}
