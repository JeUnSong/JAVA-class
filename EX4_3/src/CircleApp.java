
public class CircleApp {

	public static void main(String[] args) {
		Circle pizza = new Circle(10, "���̳� ����"); // ��ü ����/ �������� 10����,
												   // �̸��� "���̳� ����"�� �ʱ�ȭ
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle donut = new Circle(); // ��ü ����. �������� 1, �̸��� ""�� �ʱ�ȭ
		donut.name = "ũ������ ����"; // �̸�����
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
		}
}
