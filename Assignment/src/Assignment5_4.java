import java.util.Scanner;

public class Assignment5_4 {
//4. 3���� �迭�� ���� �ۼ��غ�����.
	public static void main(String[] args) {
		int[] scoer = new int[3];
		int sum=0;
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
		System.out.print("�̸��� �Է��ϼ���. : ");
		String name = scanner.next();
		
		System.out.print("����,����,������ ������ �Է��ϼ���: ");
		for(int i=0; i<scoer.length; i++)
			scoer[i] = scanner.nextInt();
		
		for(int i=0; i<scoer.length; i++)
			sum += scoer[i];
		System.out.println("��� �Է������� exit�� �Է��ϼ���.");
		System.out.print(">>");
		String text = scanner.next();
		if(text.equals("exit"))
			break;
		System.out.print(name + "���� ���� ����� " + (double)sum/scoer.length);
		
		
		}
		
		
	}
	
}
