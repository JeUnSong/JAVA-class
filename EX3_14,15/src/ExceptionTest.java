import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �ΰ��� �Է����ּ���");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		try {
		System.out.println(a/b);
		
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i+1]=1;
		}
	}catch(ArithmeticException e) {
		System.out.println("0���� ���� ��  �����ϴ�.");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("�迭�� ������ ��� �� �����ϴ�.");
		//DB�� ���
	}
		
		System.out.println("�� �κ��� ����ɱ�� ?");
		scanner.close();
	}

}
