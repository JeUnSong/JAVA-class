package dd;
//1. P253�� ����5-1���� PointŬ������ showPoint()�� �߻�޼���� �����ؼ�
//PointŬ������ �߻�Ŭ������ �ٲپ �ڵ��غ���
abstract class Pointxy {
	public abstract void showPoint();
}

class Point extends Pointxy {
	private int x,y;
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	@Override
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point {
	private String color; 
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
