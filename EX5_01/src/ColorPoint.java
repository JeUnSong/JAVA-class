
public class ColorPoint extends Point { // Point�� ��ӹ��� ColorPoint ����
	private String color; // ���� ��
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {//�÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint();
	}
}
