import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//1.����9-5 ȭ���� FlowLayout�� ����Ͽ� �ۼ��Ͻÿ�.
public class MouseAdapertEx extends JFrame {
	private JLabel la = new JLabel("Hello");
	
	public MouseAdapertEx() {
		this.setTitle("Mouse �̺�Ʈ ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.addMouseListener(new MyMouseAdapert()); // z����Ʈ�ҿ� Mouse �̺�Ʈ ������ �ޱ�
			
		
		c.setLayout(null);
		la.setSize(50, 20); 
		la.setLocation(30,30);
		c.add(la); 
		
		this.setSize(250, 250);
		this.setVisible(true);
	}
	
	// MouseAdapter�� ��ӹ޾� ������ ����
	class MyMouseAdapert extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
		int x = e.getX(); // ���콺 Ŭ�� ��ǥ x
		int y = e.getY(); // ���콺 Ŭ�� ��ǥ y
		la.setLocation(x, y); //���̺��� ��ġ�� (x,y)�� �̵�
	}
}
	
	public static void main(String[] args) {
		new MouseAdapertEx();

	}

}
