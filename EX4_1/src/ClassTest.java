
public class ClassTest {

	//static�� �ν��Ͻ��� �������� �ʰ� ����޸𸮿� �÷��ش�.
	public static void main(String[] args) {
		//CircleŬ������ �ν��Ͻ� ����
		Circle pizza = new Circle();
		pizza.name="���̳�����";//�̸�
		pizza.radius=20;     //������
		double area = pizza.getArea();     //�������ϱ�
		System.out.println(pizza.name+"�� ������ "+area);
		
//		Circle pizzaNick=pizza;
//		System.out.println(pizzaNick.name);
//		System.out.println(pizza.name);
		
		Circle donut = new Circle();
		donut.name="ũ������ ����";
		donut.radius=2;
		area = donut.getArea();
		System.out.println(donut.name+"�� ������ "+area);

		
		donut=pizza;
	}
	
	
	
}
