
public class Circle {
	int radius;
	String name;
	
	public Circle() { // �Ű� ���� ���� ������
		radius = 1; name = ""; // �ʵ� �ʱ�ȭ
	}
	
	public Circle(int r, String n) { // �Ű� ������ ���� ������
		radius = r; name = n; //�Ű� ������ �ʵ� �ʱ�ȭ
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}

}
