import java.util.Scanner;

public class Assignment5_3 {

//3. �л� �̸�, ����, ����, ���� ������ �Է��Ͽ� ����� ���ؼ� ����ϴ�
//���α׷��� �ۼ��Ͻÿ�. ��� �ݺ��ϴٰ� "exit"�� �Է��ϸ� ����.
	public static int sum(int k, int e, int m) {
		return k+e+m;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = scanner.next();
		
		while(true ) {
			
			System.out.print("���� ������ �Է��ϼ���: ");
			int korean = scanner.nextInt();
			
			System.out.print("���� ������ �Է��ϼ���: ");
			int english = scanner.nextInt();
			
			System.out.print("���� ������ �Է��ϼ���: ");
			int math = scanner.nextInt();
			
			
			int a = sum(korean, english, math);
			System.out.println("��� �Է������� exit�� �Է��ϼ���.");
			System.out.print(">>");
			String text = scanner.next();
			if(text.equals("exit"))
				System.out.print(name + "���� ��� ������ " + a/3 + "�Դϴ�.");
				break;
			
			
		
		}
		scanner.close();
		}
	
	}


