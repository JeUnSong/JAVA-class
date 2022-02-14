import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerEx extends JFrame {
	private JLabel la = new JLabel("Hello");
	
	public MouseListenerEx() {
		this.setTitle("Mouse �̺�Ʈ ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.addMouseListener(new MouseListener() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX(); // ���콺 Ŭ�� ��ǥ x
				int y = e.getY(); // ���콺 Ŭ�� ��ǥ y
				la.setLocation(x, y); //���̺��� ��ġ�� (x,y)�� �̵�
			}

			@Override
			public void mouseClicked(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}
			});
		
		c.setLayout(null);  //����Ʈ���� ��ġ ������ ����
		la.setSize(50, 20); // ���̺��� ũ�� 50x20
		la.setLocation(30,30);// ���̺���ġ 30x30
		c.add(la); // ���̺� ������Ʈ ����
		
		this.setSize(250, 250);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new MouseListenerEx();

	}

}
