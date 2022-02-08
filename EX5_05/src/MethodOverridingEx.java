
 public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw(); // p�� ����Ű�� ��ü ���� �������̵��� draw() ȣ��. ���� ���ε�
	}
 
 public static void main(String[] args) {
	 Line line = new Line();
	 
	 // ���� ȣ����� ��� paint() �޼ҵ� ������ Shape�� ���� ���۷��� p�� ��ĳ���õ�
	 paint(line); // Line�� �������̵� draw() ����, "Line" ���
	 paint(new Shape());  // Shape�� draw() ����, "Shape" ���
	 paint(new Line());   // Line�� �������̵� draw() ����, "Line" ���
	 paint(new Rect());   // Rect�� �������̵� draw() ����, "Rect" ���
	 paint(new Circle()); // Circle�� �������̵� draw() ����, "Circle" ���
    }
 }