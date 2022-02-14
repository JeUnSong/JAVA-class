import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FlyingTextEx extends JFrame {
	private final int FLYING_UNIT = 10; // ���̺��� �� �� �����̴� ������ 10�ȼ�
	private JLabel la = new JLabel("HELLO"); // Ű �Է¿� ���� ������ ���̺� ������Ʈ
	
	public FlyingTextEx() {
		this.setTitle("��,��,��,�� Ű�� �̿��Ͽ� �ؽ�Ʈ �����̱�");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = this.getContentPane();
		c.setLayout(null); // ����Ʈ���� ��ġ������ ����
		c.addKeyListener(new MyKeyListener()); //����Ʈ�ҿ� key ������ �ޱ�
		la.setLocation(50,50);
		la.setSize(100,20);
		c.add(la);
		
		this.setSize(300,300);
		this.setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus(); // ����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		
		// ���� �ڵ�� ����Ʈ�ҿ� ��Ŀ���� ���� ��� ���콺�� Ŭ���ϸ� �ٽ� ��Ŀ���� ��� ��
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource(); // ���콺�� Ŭ���� ������Ʈ
				com.setFocusable(true);
				com.requestFocus(); // ���콺�� Ŭ���� ������Ʈ���� ��Ŀ�� ����
			}
		});
	}

	// key ������ ����
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); // �Էµ� Ű�� Ű�ڵ带 �˾Ƴ���.
			
			// Ű�ڵ� ��(keyCode)�� ���� ��,��,��,�� Ű�� �Ǻ��ϰ� la�� ��ġ�� �̵���Ų��.
			switch(keyCode) {
			case KeyEvent.VK_UP: // up Ű
				la.setLocation(la.getX(), la.getY()-FLYING_UNIT); break;
			case KeyEvent.VK_DOWN: // down Ű
				la.setLocation(la.getX(), la.getY()+FLYING_UNIT); break;
			case KeyEvent.VK_LEFT: // left Ű
				la.setLocation(la.getX()-FLYING_UNIT, la.getY()); break;
			case KeyEvent.VK_RIGHT: // right Ű
				la.setLocation(la.getX()+FLYING_UNIT, la.getY()); break;
			}
		}
	}
	public static void main(String[] args) {
		new FlyingTextEx();

	}

}
