package Assignment6_1;

public class StudentApp {

	public static void main(String[] args) {
		Student name = new Student("������");
		Student korean = new Student("����" + 80);
		Student english = new Student("����" + 50);
		Student math = new Student("����" + 30);
		System.out.println("�� �̸��� " + name.name + "�̸� ���� ����, ����, ������ ������ ���� ");
		System.out.println(korean.name + " " + english.name + " " + math.name + " �Դϴ�.");

	}

}
