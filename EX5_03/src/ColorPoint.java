
class ColorPoint extends Point { // Point�� ��� �޴� ColorPoint ����
	private String color; // ���ǻ�
	public ColorPoint(int x, int y, String color) {
		super(x,y); // Point�� ������ Point(x, y) ȣ��
		this.color = color;
	}
	public void showColorPoint() { // �÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint(); // Point Ŭ������ showPoint() ȣ��
	}

}
