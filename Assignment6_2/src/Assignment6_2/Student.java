package Assignment6_2;
//2. StudentŬ������ ����ؼ� ��������5-3�� �����غ���
//�л� �̸�, ����, ����, ���� ������ �Է��Ͽ� ����� ���ؼ� ����ϴ�  
//���α׷��� �ۼ��Ͻÿ�. ��� �ݺ��ϴٰ� "exit"�� �Է��ϸ� ����.

public class Student {
	String name;
	String subject;
	double score;

	public Student(String name) {
		this.name = name;
	}
	public  Student(String s, double c) {
		subject = s;
		score = c;
	}
}