package Assignment6_2;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Student st = new Student();
		Scanner scanner = new Scanner(System.in);
		
		
		Student kor = new Student();
		kor.name = "����";
		Student eng = new Student();
		eng.name = "����";
		Student mat = new Student();
		mat.name = "����";
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		st.name = scanner.next();
		
		while(true ) {
		System.out.print(kor.name + " ������ �Է��ϼ���: ");
		st.score = scanner.nextInt();
		
		System.out.print(eng.name + " ������ �Է��ϼ���: ");
		st.score = scanner.nextInt();
		
		System.out.print(mat.name + " ������ �Է��ϼ���: ");
		st.score = scanner.nextInt();
		
		System.out.println("��� �Է������� exit�� �Է��ϼ���.");
		System.out.print(">>");
		String text = scanner.next();
		
		System.out.println(st.name + "���� ��� ������ " + st.ave());
		if(text.equals("exit"))
		break;
		}

	}

}