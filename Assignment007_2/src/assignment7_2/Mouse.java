package Assignment7_2;
//2. ���콺 Ŭ������ �����Ͻÿ�.
//���ʹ�ư, �����ʹ�ư, mouseMove()
public class Mouse {
	public String name;
	public void leftClick() {System.out.println("����Ŭ��");}
	public void rightClick() {System.out.println("������Ŭ��");}
	public void mouseMove() {System.out.println("���콺 �̵�");}
}
//3. �ٸ��콺 Ŭ������ ���콺Ŭ������ ��ӹ޾Ƽ� �����Ͻÿ�.
//��ũ���� �߰�
class WheelMouse extends Mouse {
	public void wheelUp() {System.out.println("�ٿø���");}
	public void wheelDown() {System.out.println("�ٳ�����");}
	public void wheelClick() {System.out.println("��Ŭ��");}
}
//4. 3��ư���콺 Ŭ������ �ٸ��콺 Ŭ������ ��ӹ޾Ƽ� �����Ͻÿ�.
//��ư�� �ϳ� �� �ֽ��ϴ�.
class ThreeButtonMouse extends WheelMouse {
	public void threeButtonClick() {System.out.println("����° ��ư ������");}
}

class MouseInheritance {
	//5. 2~4���� �ν��Ͻ��� �����Ͻÿ�.
	public static void main(String[] args) {
		Mouse m=new Mouse();
		m.name="���콺";
		System.out.println(m.name);
		m.leftClick();
		m.rightClick();
		m.mouseMove();
		
		WheelMouse wm=new WheelMouse();
		wm.name="�ٸ��콺";
		System.out.println(wm.name);
		wm.wheelUp();
		wm.wheelDown();
		wm.wheelClick();
		
		ThreeButtonMouse tm=new ThreeButtonMouse();
		tm.name="3��ư���콺";
		System.out.println(tm.name);
		tm.threeButtonClick();
		
	}
}