
public class Rect {
	private int width;
	private int height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

public boolean equals(Object obj) { //�簢�� ���� ��
	Rect p = (Rect)obj; // obj�� Rect�� �ٿ� ĳ����
	if(width*height == p.width*p.height) return true;
	else return false;
   }
}
